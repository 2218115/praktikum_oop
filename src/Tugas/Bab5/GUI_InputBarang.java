package Tugas.Bab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GUI_InputBarang extends javax.swing.JFrame {

    public GUI_InputBarang() {
        initComponents();
        clearTable();
        cbKategoriBarang.setSelectedIndex(2);
        cbKategoriBarang.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    label8 = new javax.swing.JLabel();
    label3 = new javax.swing.JLabel();
    cbKategoriBarang = new javax.swing.JComboBox<>();
    label4 = new javax.swing.JLabel();
    tfPemasok = new javax.swing.JTextField();
    label5 = new javax.swing.JLabel();
    label6 = new javax.swing.JLabel();
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
    btnHapus = new javax.swing.JButton();
    btnClose = new javax.swing.JButton();
    lb1 = new javax.swing.JLabel();
    tfInput1 = new javax.swing.JTextField();
    tfInput2 = new javax.swing.JTextField();
    lb2 = new javax.swing.JLabel();
    tfSearch = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    cbSatuan = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    label8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    label8.setText("Informasi Barang");

    label3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    label3.setText("Kategori Barang");

    cbKategoriBarang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    cbKategoriBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak dikategorikan", "Mikroelektronik", "Peralatan Rumah Tangga" }));
    cbKategoriBarang.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbKategoriBarangActionPerformed(evt);
      }
    });

    label4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    label4.setText("Pemasok");

    tfPemasok.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    label5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    label5.setText("Pabrikan");

    label6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    label6.setText("Nama");

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
    label2.setText("Input Barang (Alat Rumah Tangga)");

    tblInformasiBarang.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null}
      },
      new String [] {
        "Kode Barang", "Kategori Barang", "Pemasok", "Pabrikan", "Nama", "Jumlah", "Buku Manual", "Garansi"
      }
    ));
    jScrollPane2.setViewportView(tblInformasiBarang);

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
    lb1.setText("Buku Manual");

    tfInput1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    tfInput2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    lb2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb2.setText("Garansi");

    tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tfSearchKeyReleased(evt);
      }
    });

    jLabel1.setText("Cari 🔍");

    cbSatuan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    cbSatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Satuan", "Puluhan", "Ratusan" }));
    cbSatuan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbSatuanActionPerformed(evt);
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(label1))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)
                    .addComponent(btnBatal))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(label3)
                      .addComponent(label5)
                      .addComponent(label4)
                      .addComponent(label6)
                      .addComponent(label7))
                    .addGap(56, 56, 56)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(tfPemasok, javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(cbKategoriBarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(tfNama)
                      .addComponent(tfPabrikan)
                      .addComponent(tfJumlah)
                      .addComponent(cbSatuan, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(64, 64, 64)
                .addComponent(btnHapus)
                .addGap(18, 18, 18)
                .addComponent(btnClose)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lb2)
              .addComponent(lb1)
              .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(tfInput1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                  .addComponent(tfInput2)))
              .addComponent(label2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(label8)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(30, 30, 30))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addComponent(label1)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel1))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(label8)
                .addGap(18, 18, 18))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2)
                .addGap(26, 26, 26)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(label3)
                  .addComponent(cbKategoriBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(lb1)
                  .addComponent(tfInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(lb2)
                  .addComponent(tfInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(tfPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(label4))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(label5)
                  .addComponent(tfPabrikan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(label6)
                  .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(label7)
                  .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jScrollPane2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(33, 33, 33))))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
    
    // variabel list dengan tipe barang
    // penyimpan kumpulan barang
    List<BarangAlatRumahTangga> barangs = new ArrayList<BarangAlatRumahTangga>();
    
    // fungsi untuk memproduksi kodebarang secara acak
    public String generateKodeBarang(String namaBarang) {
      Random randomer = new Random();
      int randomNumber = randomer.nextInt(1000);
      return namaBarang.substring(0, 2).toUpperCase() + randomNumber;
    }
    
    public void clearTable() {
      DefaultTableModel tableModel = (DefaultTableModel)tblInformasiBarang.getModel();
      int row = tableModel.getRowCount();
      while(row > 0) {
        tableModel.removeRow(row - 1);
        row = tableModel.getRowCount();
      }
    }
    
    public void clearInput() {
        // kosongkan input field
        tfPemasok.setText("");
        tfPabrikan.setText("");
        tfNama.setText("");
        tfJumlah.setText("");
        tfInput1.setText("");
        tfInput2.setText("");
    }
    
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // ambil data input barang
        int indexKategoriBarangTerpilih = cbKategoriBarang.getSelectedIndex();
        String kategoriBarangTerpilih = cbKategoriBarang.getItemAt(indexKategoriBarangTerpilih);
        String pemasok = tfPemasok.getText();
        String pabrikan = tfPabrikan.getText();
        String nama = tfNama.getText();
        String bukuManual = tfInput1.getText();
        String garansi = tfInput2.getText();
        int jumlah = Integer.parseInt(tfJumlah.getText());
        String satuan = cbSatuan.getItemAt(cbSatuan.getSelectedIndex());
       
        // generate fake kodeBarang
        String fakeKodeBarang = generateKodeBarang(nama);
        
        // buat objek barang dengan kontruktor ber-parameter
        BarangAlatRumahTangga inputBarang = new BarangAlatRumahTangga(bukuManual, garansi, kategoriBarangTerpilih, pemasok, pabrikan, nama, jumlah);
        
        // gunakan setter setJumlah dengan 2 parameter
        inputBarang.setJumlah(jumlah, satuan);
        
        // kodeBarang di atur menjadi private jadi untuk memberikan nilai
        // harus di gunakan sebuah method setter dari kode barang
        inputBarang.setKodeBarang(fakeKodeBarang);
        
        // panggil clearInput untuk menghapus inputan
        clearInput();
        
        // proses simpan barang
        barangs.add(inputBarang);

        // tampilkan data barang yang sudah tersimpan dalam list
        // di table
        clearTable();
        DefaultTableModel tableModel = (DefaultTableModel)tblInformasiBarang.getModel();
        for (BarangAlatRumahTangga b : barangs) {
          tableModel.addRow(b.getFields());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

  private void cbKategoriBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKategoriBarangActionPerformed
    // TODO add your handling code here:
    int kategoriTerpilih = cbKategoriBarang.getSelectedIndex();
    if (kategoriTerpilih == 0) {
      lb1.setText("-");
      lb2.setText("-");
      tfInput1.setEnabled(false);
      tfInput2.setEnabled(false);
    } else if (kategoriTerpilih == 1) {
      lb1.setText("Dok. Datasheet");
      lb2.setText("Teg. Kerja");
      tfInput1.setEnabled(true);
      tfInput2.setEnabled(true);
    } else if (kategoriTerpilih == 2) {
      lb1.setText("Bk. Manual");
      lb2.setText("Garansi");
      tfInput1.setEnabled(true);
      tfInput2.setEnabled(true);
    }
  }//GEN-LAST:event_cbKategoriBarangActionPerformed

  private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
    // TODO add your handling code here:
    clearInput();
  }//GEN-LAST:event_btnBatalActionPerformed

  private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    // TODO add your handling code here:
    // ambil index baris yang di pilih
    int selectedRow = tblInformasiBarang.getSelectedRow();
    // cek apakah ada baris yang di pilih
    if (selectedRow >= 0) {
      // jika ada hapus pada index baris yang di pilih
      barangs.remove(selectedRow);
    
      // update tampilan pada tabel
      DefaultTableModel tableModel = (DefaultTableModel)tblInformasiBarang.getModel();
      clearTable();
      for (BarangAlatRumahTangga b : barangs) {
        tableModel.addRow(b.getFields());
      } 
    } else {
      // jika tidak ada yang di pilih hapus semua isi dari tabel
      barangs.removeAll(barangs);
      clearTable();
    }
  }//GEN-LAST:event_btnHapusActionPerformed

  private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    // TODO add your handling code here:
    dispose();
  }//GEN-LAST:event_btnCloseActionPerformed

  private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
    // TODO add your handling code here:
    // ambil nilai dari input search
    String filter = tfSearch.getText();
    
    // buat list untuk menampung data Barang yang sudah di filter
    List<BarangAlatRumahTangga> filteredBarangs = new ArrayList<BarangAlatRumahTangga>();
    
    // cari pada semua barang
    for (BarangAlatRumahTangga b : barangs) {
      // dengan kriteria nama barang sesuai dengan filter
      // atau jika inputan kosong ""
      // maka akan lolos filter
      if (b.getNama().toLowerCase().contains(filter.toLowerCase()) || filter.equals("")) {
        filteredBarangs.add(b);
      }
    }
    
    // tampilkan data yang sudah di filter
    DefaultTableModel tableModel = (DefaultTableModel)tblInformasiBarang.getModel();
    clearTable();
    for (BarangAlatRumahTangga b : filteredBarangs) {
      tableModel.addRow(b.getFields());
    } 
  }//GEN-LAST:event_tfSearchKeyReleased

  private void cbSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSatuanActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbSatuanActionPerformed

    /**
     * @param args the command line argu
     * ments
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
            java.util.logging.Logger.getLogger(GUI_InputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_InputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_InputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_InputBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_InputBarang().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBatal;
  private javax.swing.JButton btnClose;
  private javax.swing.JButton btnHapus;
  private javax.swing.JButton btnSimpan;
  private javax.swing.JComboBox<String> cbKategoriBarang;
  private javax.swing.JComboBox<String> cbSatuan;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel label1;
  private javax.swing.JLabel label2;
  private javax.swing.JLabel label3;
  private javax.swing.JLabel label4;
  private javax.swing.JLabel label5;
  private javax.swing.JLabel label6;
  private javax.swing.JLabel label7;
  private javax.swing.JLabel label8;
  private javax.swing.JLabel lb1;
  private javax.swing.JLabel lb2;
  private javax.swing.JTable tblInformasiBarang;
  private javax.swing.JTextField tfInput1;
  private javax.swing.JTextField tfInput2;
  private javax.swing.JTextField tfJumlah;
  private javax.swing.JTextField tfNama;
  private javax.swing.JTextField tfPabrikan;
  private javax.swing.JTextField tfPemasok;
  private javax.swing.JTextField tfSearch;
  // End of variables declaration//GEN-END:variables
}
