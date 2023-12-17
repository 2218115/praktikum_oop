/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas.Bab10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author makrusali
 */
public class GUI_Pemasok extends javax.swing.JFrame {

  /**
   * Creates new form GUI_Supplier
   */
  public GUI_Pemasok() {
    initComponents();
    inisialisasiKoneksi();
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
    DefaultTableModel model = (DefaultTableModel)tblInformasiPemasoks.getModel();
    int row = model.getRowCount();
    while(row > 0) {
      model.removeRow(row - 1);
      row = model.getRowCount();
    }
  }
  
  private String ambilIdTerpilihPadaTabel() {
    int barisTerpilih = tblInformasiPemasoks.getSelectedRow();
    if (barisTerpilih == -1) {
      JOptionPane.showMessageDialog(this, "Belum Ada Pemasok Terpilih", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
      return null;
    }
    DefaultTableModel model = (DefaultTableModel)tblInformasiPemasoks.getModel();
    String id = (String)model.getValueAt(barisTerpilih, 0);
    return id;
  }
  
  private void tampilkanDataPadaTabel(String[] isi) {
    DefaultTableModel model = (DefaultTableModel)tblInformasiPemasoks.getModel();
    model.addRow(isi);
  }
  
  private void hapusMasukan() {
    tblInformasiPemasoks.clearSelection();
    barisTerakhirDipilih = -1;
    tfAlamat.setText("");
    tfNama.setText("");
    tfTelepon.setText("");
  }
  
  private void tampilkanBarisTerpilihPadaTabel() {
    String id = "";
    String namaPemasok = "";
    String alamatPemasok = "";
    String teleponPemasok = "";
    
    int barisTerpilih = tblInformasiPemasoks.getSelectedRow();
    if (barisTerakhirDipilih != barisTerpilih) {
      DefaultTableModel model = (DefaultTableModel)tblInformasiPemasoks.getModel();
      id = (String)model.getValueAt(barisTerpilih, 0);
      namaPemasok = (String)model.getValueAt(barisTerpilih, 1);
      alamatPemasok = (String)model.getValueAt(barisTerpilih, 2);
      teleponPemasok = (String)model.getValueAt(barisTerpilih, 3);
 
      tfNama.setText(namaPemasok);
      tfAlamat.setText(alamatPemasok);
      tfTelepon.setText(teleponPemasok);
      barisTerakhirDipilih = barisTerpilih;
    } else {
      barisTerakhirDipilih = -1;
      tblInformasiPemasoks.clearSelection();
      hapusMasukan();
    }
  }
  
// tampilkan semua data
private void queryTampilkanKeTabel() {
  final String SELECT_QUERY = "SELECT * FROM tb_pemasoks";
  try {
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery(SELECT_QUERY);
    bersihkanTabel();
    while(rs.next()) {
      String[] data = new String[4];
      data[0] = rs.getString("id");
      data[1] = rs.getString("nama_pemasok");
      data[2] = rs.getString("alamat_pemasok");
      data[3] = rs.getString("telepon_pemasok");
      tampilkanDataPadaTabel(data);
    }
  } catch (SQLException e) {
    e.printStackTrace();
  }
}
  
// cari
private void queryCariPemasok() {
  final String SELECT_QUERY = "SELECT * FROM tb_pemasoks where nama_pemasok LIKE ?";
  String cari = tfSearch.getText();
  try {
    PreparedStatement st = conn.prepareStatement(SELECT_QUERY);
    st.setString(1, "%"+cari+"%");
    ResultSet rs = st.executeQuery();
    bersihkanTabel();
    while(rs.next()) {
      String[] data = new String[4];
      data[0] = rs.getString("id");
      data[1] = rs.getString("nama_pemasok");
      data[2] = rs.getString("alamat_pemasok");
      data[3] = rs.getString("telepon_pemasok");
      tampilkanDataPadaTabel(data);
    }
  } catch (SQLException e) {
    e.printStackTrace();
  }
}
  
// update barang
private void queryUpdatePemasok() {
  final String UPDATE_QUERY = "UPDATE tb_pemasoks SET nama_pemasok = ?, alamat_pemasok = ?, telepon_pemasok = ? WHERE id = ?";

  String id = ambilIdTerpilihPadaTabel();
  if (id == null) {
    return;
  }

  String namaPemasok = tfNama.getText();
  String alamatPemasok = tfAlamat.getText();
  String teleponPemasok = tfTelepon.getText();

  try {
    PreparedStatement st = conn.prepareStatement(UPDATE_QUERY);
    st.setString(1, namaPemasok);
    st.setString(2, alamatPemasok);
    st.setString(3, teleponPemasok);
    st.setString(4, id);
    st.execute();

    JOptionPane.showMessageDialog(this, "Data Pemasok Terupdate", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
    queryTampilkanKeTabel();
    hapusMasukan();
  } catch (SQLException e) {
    e.printStackTrace();
  }
}
  
// tambahkan data barang
private void queryInsertPemasok() {
  final String INSERT_QUERY = "INSERT INTO tb_pemasoks (nama_pemasok, alamat_pemasok, telepon_pemasok) VALUES (?, ?, ?)";
  String namaPemasok = tfNama.getText();
  String alamatPemasok = tfAlamat.getText();
  String teleponPemasok = tfTelepon.getText();
  try {
    PreparedStatement st = conn.prepareStatement(INSERT_QUERY);
    st.setString(1, namaPemasok);
    st.setString(2, alamatPemasok);
    st.setString(3, teleponPemasok);
    st.execute();

    JOptionPane.showMessageDialog(this, "Data Pemasok Tersimpan", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
    queryTampilkanKeTabel();
    hapusMasukan();
  } catch (SQLException e) {
    e.printStackTrace();
  }
}
  
// hapus data barang
private void queryDeletePemasok() {
  final String DELETE_QUERY = "DELETE FROM tb_pemasoks WHERE id = ?";

  String id = ambilIdTerpilihPadaTabel();

  int res = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data pemasok " + id + " ?", "PERINGATAN", JOptionPane.YES_NO_OPTION);
  if (res == 1) {
    return;
  }

  try {
    PreparedStatement st = conn.prepareStatement(DELETE_QUERY);
    st.setString(1, id);
    st.execute();
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

    jLabel1 = new javax.swing.JLabel();
    tfAlamat = new javax.swing.JTextField();
    btnSimpan = new javax.swing.JButton();
    lb2 = new javax.swing.JLabel();
    tfSearch = new javax.swing.JTextField();
    label8 = new javax.swing.JLabel();
    lb3 = new javax.swing.JLabel();
    tfTelepon = new javax.swing.JTextField();
    label1 = new javax.swing.JLabel();
    label2 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    tblInformasiPemasoks = new javax.swing.JTable();
    btnBatal = new javax.swing.JButton();
    btnHapus = new javax.swing.JButton();
    btnClose = new javax.swing.JButton();
    lb1 = new javax.swing.JLabel();
    tfNama = new javax.swing.JTextField();
    btnUpdate = new javax.swing.JButton();
    btnFormBarang = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Cari 🔍");

    tfAlamat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    btnSimpan.setText("Simpan");
    btnSimpan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSimpanActionPerformed(evt);
      }
    });

    lb2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb2.setText("Alamat");

    tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tfSearchKeyReleased(evt);
      }
    });

    label8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    label8.setText("Informasi Pemasok");

    lb3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb3.setText("Telepon");

    tfTelepon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    label1.setText("Sistem Inventory Barang Elektronik");

    label2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    label2.setText("Pemasok");

    tblInformasiPemasoks.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "ID", "Nama", "Alamat", "Telepon"
      }
    ));
    tblInformasiPemasoks.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        tblInformasiPemasoksMousePressed(evt);
      }
    });
    jScrollPane2.setViewportView(tblInformasiPemasoks);

    btnBatal.setText("Batal");
    btnBatal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBatalActionPerformed(evt);
      }
    });

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

    lb1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb1.setText("Nama");

    tfNama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    btnUpdate.setText("Perbarui");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    btnFormBarang.setText("Form Barang");
    btnFormBarang.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFormBarangActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(199, 199, 199)
            .addComponent(label1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFormBarang))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(lb2)
                .addComponent(lb1)
                .addComponent(label2)
                .addGroup(layout.createSequentialGroup()
                  .addComponent(lb3)
                  .addGap(119, 119, 119)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNama, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(tfAlamat)
                    .addComponent(tfTelepon)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnBatal)))
              .addGroup(layout.createSequentialGroup()
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose)
                .addGap(6, 6, 6)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addComponent(label8)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(tfSearch))
              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(30, 30, 30))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(label1)
          .addComponent(btnFormBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addComponent(label2)
            .addGap(26, 26, 26))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(label8)
              .addComponent(jLabel1)
              .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lb1)
              .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lb2)
              .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lb3)
              .addComponent(tfTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
              .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    queryInsertPemasok();
  }//GEN-LAST:event_btnSimpanActionPerformed

  private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
    queryCariPemasok();
  }//GEN-LAST:event_tfSearchKeyReleased

  private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
    hapusMasukan();
  }//GEN-LAST:event_btnBatalActionPerformed

  private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    queryDeletePemasok();
  }//GEN-LAST:event_btnHapusActionPerformed

  private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    deinisialisasiKoneksi();
    dispose();
  }//GEN-LAST:event_btnCloseActionPerformed

  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    queryUpdatePemasok();
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void tblInformasiPemasoksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInformasiPemasoksMousePressed
    // TODO add your handling code here:
    tampilkanBarisTerpilihPadaTabel();
  }//GEN-LAST:event_tblInformasiPemasoksMousePressed

  private void btnFormBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormBarangActionPerformed
    deinisialisasiKoneksi();
    dispose();
    new GUI_Barang().setVisible(true);
  }//GEN-LAST:event_btnFormBarangActionPerformed

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
      java.util.logging.Logger.getLogger(GUI_Pemasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(GUI_Pemasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(GUI_Pemasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(GUI_Pemasok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new GUI_Pemasok().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBatal;
  private javax.swing.JButton btnClose;
  private javax.swing.JButton btnFormBarang;
  private javax.swing.JButton btnHapus;
  private javax.swing.JButton btnSimpan;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel label1;
  private javax.swing.JLabel label2;
  private javax.swing.JLabel label8;
  private javax.swing.JLabel lb1;
  private javax.swing.JLabel lb2;
  private javax.swing.JLabel lb3;
  private javax.swing.JTable tblInformasiPemasoks;
  private javax.swing.JTextField tfAlamat;
  private javax.swing.JTextField tfNama;
  private javax.swing.JTextField tfSearch;
  private javax.swing.JTextField tfTelepon;
  // End of variables declaration//GEN-END:variables
}
