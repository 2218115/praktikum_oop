/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas.Bab10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author makrusali
 */
public class GUI_Barang extends javax.swing.JFrame {

  /**
   * Creates new form GUI_Barang
   */
  public GUI_Barang() {
    initComponents();
    inisialisasiKoneksi();
    queryTampilkanDataPemasokKeCmbBox();
    queryTampilkanKeTabel();
  } 
  
  private Connection conn = null;
  int barisTerakhirDipilih = -1;
  
  private void inisialisasiKoneksi() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/tugas_oop?user=root&password=");
    } catch(ClassNotFoundException | SQLException e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this, "Koneksi Gagal");
    }
  }
  
  private void deinisialisasiKoneksi() {
    try {
      conn.close();
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
  
  private void bersihkanTabel() {
    DefaultTableModel model = (DefaultTableModel)tblInformasiBarang.getModel();
    int row = model.getRowCount();
    while(row > 0) {
      model.removeRow(row - 1);
      row = model.getRowCount();
    }
  }
  
  private String ambilKodeTerpilihPadaTabel() {
    int barisTerpilih = tblInformasiBarang.getSelectedRow();
    if (barisTerpilih == -1) {
      JOptionPane.showMessageDialog(this, "Belum Ada Barang Terpilih", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
      return null;
    }
    DefaultTableModel model = (DefaultTableModel)tblInformasiBarang.getModel();
    String kode = (String)model.getValueAt(barisTerpilih, 0);
    return kode;
  }
  
  private void tampilkanDataPadaTabel(String[] isi) {
    DefaultTableModel model = (DefaultTableModel)tblInformasiBarang.getModel();
    model.addRow(isi);
  }
  
  private void hapusMasukan() {
    tblInformasiBarang.clearSelection();
    cbKategoriBarang.setSelectedIndex(0);
    cbPemasok.setSelectedIndex(0);
    tfJumlah.setText("");
    tfNama.setText("");
    tfPabrikan.setText("");
  }
  
  private void ambilBarisTerpilihPadaTabel() {
    String kodeBarang = "";
    String kategoriBarang;
    String namaPemasok;
    String pabrikanBarang = "";
    String namaBarang = "";
    String jumlahBarang = "";
    
    int barisTerpilih = tblInformasiBarang.getSelectedRow();
    if (barisTerakhirDipilih != barisTerpilih) {
      DefaultTableModel model = (DefaultTableModel)tblInformasiBarang.getModel();
      kodeBarang = (String)model.getValueAt(barisTerpilih, 0);
      kategoriBarang = (String)model.getValueAt(barisTerpilih, 1);
      namaPemasok = (String)model.getValueAt(barisTerpilih, 2);
      pabrikanBarang = (String)model.getValueAt(barisTerpilih, 3);
      namaBarang = (String)model.getValueAt(barisTerpilih, 4);
      jumlahBarang = (String)model.getValueAt(barisTerpilih, 5);

      tfNama.setText(namaBarang);
      tfPabrikan.setText(pabrikanBarang);
      tfJumlah.setText(jumlahBarang);
      barisTerakhirDipilih = barisTerpilih;
    } else {
      barisTerakhirDipilih = -1;
      tblInformasiBarang.clearSelection();
      hapusMasukan();
    }
  }
  
  private void queryTampilkanDataPemasokKeCmbBox() {
    final String SELECT_QUERY = "SELECT nama_pemasok FROM tb_pemasoks";
    try {
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(SELECT_QUERY);
      List<String> data = new ArrayList<>();
      data.add("-PILIH PEMASOK-");
      while(rs.next()) {
        data.add(rs.getString("nama_pemasok"));
      }
      ComboBoxModel<String> cbModel = new DefaultComboBoxModel<>(data.toArray(String[]::new));
      cbPemasok.setModel(cbModel);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  // tampilkan semua data
  private void queryTampilkanKeTabel() {
    final String SELECT_QUERY = "SELECT * FROM tb_barangs";
    try {
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(SELECT_QUERY);
      bersihkanTabel();
      while(rs.next()) {
        String[] data = new String[6];
        data[0] = rs.getString("kode_barang");
        data[1] = rs.getString("kategori_barang");
        data[2] = rs.getString("nama_pemasok");
        data[3] = rs.getString("pabrikan_barang");
        data[4] = rs.getString("nama_barang");
        data[5] = rs.getString("jumlah_barang");
        tampilkanDataPadaTabel(data);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  // cari
  private void queryCariBarang() {
    final String SELECT_QUERY = "SELECT * FROM tb_barangs where nama_barang LIKE ?";
    String cari = tfSearch.getText();
    try {
      PreparedStatement st = conn.prepareStatement(SELECT_QUERY);
      st.setString(1, "%"+cari+"%");
      ResultSet rs = st.executeQuery();
      bersihkanTabel();
      while(rs.next()) {
        String[] data = new String[6];
        data[0] = rs.getString("kode_barang");
        data[1] = rs.getString("kategori_barang");
        data[2] = rs.getString("nama_pemasok");
        data[3] = rs.getString("pabrikan_barang");
        data[4] = rs.getString("nama_barang");
        data[5] = rs.getString("jumlah_barang");
        tampilkanDataPadaTabel(data);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  // update barang
  private void queryUpdateBarang() {
    final String UPDATE_QUERY = "UPDATE tb_barangs SET kategori_barang = ?, nama_pemasok = ?, pabrikan_barang = ?, nama_barang = ?, jumlah_barang = ? WHERE kode_barang = ?";
    
    String kode = ambilKodeTerpilihPadaTabel();
    if (kode == null) {
      return;
    }
    
    String kategoriBarang = (String)cbKategoriBarang.getSelectedItem();
    String namaPemasok = (String)cbPemasok.getSelectedItem();
    String pabrikanBarang = (String)tfPabrikan.getText();
    String namaBarang = tfNama.getText();
    int jumlahBarang = Integer.parseInt(tfJumlah.getText());
    
    try {
      PreparedStatement st = conn.prepareStatement(UPDATE_QUERY);
      st.setString(1, kategoriBarang);
      st.setString(2, namaPemasok);
      st.setString(3, pabrikanBarang);
      st.setString(4, namaBarang);
      st.setInt(5, jumlahBarang);
      st.setString(6, kode);
      st.execute();
      
      JOptionPane.showMessageDialog(this, "Data Barang Terupdate", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
      hapusMasukan();
      queryTampilkanKeTabel();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  // tambahkan data barang
  private void queryInsertBarang() {
    final String INSERT_QUERY = "INSERT INTO tb_barangs (kode_barang, kategori_barang, nama_pemasok, pabrikan_barang, nama_barang, jumlah_barang) VALUES (?, ?, ?, ?, ?, ?)";
    Random rand = new Random();
    
    String kategoriBarang = (String)cbKategoriBarang.getSelectedItem();
    String namaPemasok = (String)cbPemasok.getSelectedItem();
    String pabrikanBarang = tfPabrikan.getText();
    String namaBarang = tfNama.getText();
    String kodeBarang =  namaBarang.substring(0, 3) + Integer.toString(rand.nextInt(1, 100));
    int jumlahBarang = Integer.parseInt(tfJumlah.getText());
    try {
      PreparedStatement st = conn.prepareStatement(INSERT_QUERY);
      st.setString(1, kodeBarang);
      st.setString(2, kategoriBarang);
      st.setString(3, namaPemasok);
      st.setString(4, pabrikanBarang);
      st.setString(5, namaBarang);
      st.setInt(6, jumlahBarang);
      st.execute();
      
      JOptionPane.showMessageDialog(this, "Data Barang Tersimpan", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
      hapusMasukan();
      queryTampilkanKeTabel();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  
  // hapus data barang
  private void queryDeleteBarang() {
    final String DELETE_QUERY = "DELETE FROM tb_barangs WHERE kode_barang = ?";
   
    String kodeTerpilih = ambilKodeTerpilihPadaTabel();
    
    int res = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data barang " + kodeTerpilih + " ?", "PERINGATAN", JOptionPane.YES_NO_OPTION);
    if (res == 1) {
      return;
    }
    
    try {
      PreparedStatement st = conn.prepareStatement(DELETE_QUERY);
      st.setString(1, kodeTerpilih);
      st.execute();
      hapusMasukan();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    
    queryTampilkanKeTabel();
  }
  
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    tfSearch = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    tfNama = new javax.swing.JTextField();
    tfPabrikan = new javax.swing.JTextField();
    label7 = new javax.swing.JLabel();
    tfJumlah = new javax.swing.JTextField();
    btnSimpan = new javax.swing.JButton();
    label1 = new javax.swing.JLabel();
    label2 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tblInformasiBarang = new javax.swing.JTable();
    btnBatal = new javax.swing.JButton();
    label8 = new javax.swing.JLabel();
    label3 = new javax.swing.JLabel();
    cbPemasok = new javax.swing.JComboBox<>();
    label5 = new javax.swing.JLabel();
    label6 = new javax.swing.JLabel();
    btnHapus = new javax.swing.JButton();
    btnClose = new javax.swing.JButton();
    label9 = new javax.swing.JLabel();
    cbKategoriBarang = new javax.swing.JComboBox<>();
    btnUpdate = new javax.swing.JButton();
    btnFormPemasok = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tfSearchKeyReleased(evt);
      }
    });

    jLabel1.setText("Cari 🔍");

    tfNama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    tfPabrikan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    label7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    label7.setText("Jumlah");

    tfJumlah.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    btnSimpan.setText("Simpan");
    btnSimpan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSimpanActionPerformed(evt);
      }
    });

    label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    label1.setText("Sistem Inventory Barang Elektronik");

    label2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    label2.setText("Input Barang");

    tblInformasiBarang.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "Kode Barang", "Kategori Barang", "Pemasok", "Pabrikan", "Nama", "Jumlah"
      }
    ));
    tblInformasiBarang.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblInformasiBarangMouseClicked(evt);
      }
    });
    jScrollPane2.setViewportView(tblInformasiBarang);

    btnBatal.setText("Batal");
    btnBatal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBatalActionPerformed(evt);
      }
    });

    label8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    label8.setText("Informasi Barang");

    label3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    label3.setText("Kategori Barang");

    cbPemasok.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    cbPemasok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH PEMASOK-" }));
    cbPemasok.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbPemasokActionPerformed(evt);
      }
    });

    label5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    label5.setText("Pabrikan");

    label6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    label6.setText("Nama");

    btnHapus.setText("Hapus");
    btnHapus.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHapusActionPerformed(evt);
      }
    });

    btnClose.setText("Close");
    btnClose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCloseActionPerformed(evt);
      }
    });

    label9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    label9.setText("Pemasok");

    cbKategoriBarang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    cbKategoriBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH KATEGORI-", "MikroElektronik", "AlatRumahTangga" }));
    cbKategoriBarang.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbKategoriBarangActionPerformed(evt);
      }
    });

    btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    btnUpdate.setText("Perbarui");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    btnFormPemasok.setText("Form Pemasok");
    btnFormPemasok.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFormPemasokActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(label1)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(label2)
              .addComponent(label5)
              .addComponent(label6)
              .addComponent(label7)
              .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(label9)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btnBatal)
                .addComponent(btnClose)
                .addComponent(btnHapus)
                .addGroup(layout.createSequentialGroup()
                  .addComponent(label3)
                  .addGap(26, 26, 26)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbPemasok, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbKategoriBarang, 0, 258, Short.MAX_VALUE)
                    .addComponent(tfPabrikan)
                    .addComponent(tfNama)
                    .addComponent(tfJumlah))))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btnFormPemasok)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(0, 158, Short.MAX_VALUE)
                .addComponent(label8)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jScrollPane2))
            .addGap(30, 30, 30))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(97, 97, 97)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel1)))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(label8)
                .addGap(18, 18, 18))
              .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2)
                .addGap(26, 26, 26)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(label3)
                  .addComponent(cbKategoriBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(label9)
                  .addComponent(cbPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(label5)
                  .addComponent(tfPabrikan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(label6)
                  .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(label7)
                  .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnFormPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(33, 44, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
    queryCariBarang();
  }//GEN-LAST:event_tfSearchKeyReleased

  private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    queryInsertBarang();
  }//GEN-LAST:event_btnSimpanActionPerformed

  private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
    hapusMasukan();
    tblInformasiBarang.clearSelection();
  }//GEN-LAST:event_btnBatalActionPerformed

  private void cbPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPemasokActionPerformed
  }//GEN-LAST:event_cbPemasokActionPerformed

  private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    queryDeleteBarang();
  }//GEN-LAST:event_btnHapusActionPerformed

  private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    // TODO add your handling code here:
    deinisialisasiKoneksi();
    dispose();
  }//GEN-LAST:event_btnCloseActionPerformed

  private void cbKategoriBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKategoriBarangActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbKategoriBarangActionPerformed

  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    queryUpdateBarang();
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void tblInformasiBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInformasiBarangMouseClicked
    ambilBarisTerpilihPadaTabel();
  }//GEN-LAST:event_tblInformasiBarangMouseClicked

  private void btnFormPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormPemasokActionPerformed
    // TODO add your handling code here:
    deinisialisasiKoneksi();
    dispose();
    new GUI_Pemasok().setVisible(true);
  }//GEN-LAST:event_btnFormPemasokActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(GUI_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(GUI_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(GUI_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(GUI_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new GUI_Barang().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBatal;
  private javax.swing.JButton btnClose;
  private javax.swing.JButton btnFormPemasok;
  private javax.swing.JButton btnHapus;
  private javax.swing.JButton btnSimpan;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JComboBox<String> cbKategoriBarang;
  private javax.swing.JComboBox<String> cbPemasok;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel label1;
  private javax.swing.JLabel label2;
  private javax.swing.JLabel label3;
  private javax.swing.JLabel label5;
  private javax.swing.JLabel label6;
  private javax.swing.JLabel label7;
  private javax.swing.JLabel label8;
  private javax.swing.JLabel label9;
  private javax.swing.JTable tblInformasiBarang;
  private javax.swing.JTextField tfJumlah;
  private javax.swing.JTextField tfNama;
  private javax.swing.JTextField tfPabrikan;
  private javax.swing.JTextField tfSearch;
  // End of variables declaration//GEN-END:variables
}
