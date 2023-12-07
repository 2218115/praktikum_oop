package Tugas.Bab5;

import Tugas.Bab4.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GUI_BarangAlatRumahTangga extends javax.swing.JFrame {

    public GUI_BarangAlatRumahTangga() {
        initComponents();
        
        cbKategoriBarang.setSelectedIndex(2);
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
    jScrollPane1 = new javax.swing.JScrollPane();
    taDisplayBarang = new javax.swing.JTextArea();
    label1 = new javax.swing.JLabel();
    label2 = new javax.swing.JLabel();
    lbInput1 = new javax.swing.JLabel();
    lbInput2 = new javax.swing.JLabel();
    tfBkManual = new javax.swing.JTextField();
    tfGaransi = new javax.swing.JTextField();

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

    taDisplayBarang.setColumns(20);
    taDisplayBarang.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
    taDisplayBarang.setRows(5);
    jScrollPane1.setViewportView(taDisplayBarang);

    label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    label1.setText("Sistem Inventory Barang Elektronik");

    label2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    label2.setText("Input Barang (Alat Rumah Tangga)");

    lbInput1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lbInput1.setText("Buku Manual");

    lbInput2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lbInput2.setText("Garansi");

    tfBkManual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    tfGaransi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(31, 31, 31)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(label2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label8)
            .addGap(416, 416, 416))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(label1))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbInput2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                      .addComponent(lbInput1)
                      .addGap(313, 313, 313)))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(btnSimpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(label3)
                          .addComponent(label5)
                          .addComponent(label4)
                          .addComponent(label6)
                          .addComponent(label7))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                          .addComponent(tfPemasok)
                          .addComponent(cbKategoriBarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(tfNama)
                          .addComponent(tfPabrikan)
                          .addComponent(tfJumlah)
                          .addComponent(tfBkManual)
                          .addComponent(tfGaransi))))
                    .addGap(74, 74, 74)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(32, Short.MAX_VALUE))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addComponent(label1)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addComponent(label8)
            .addGap(18, 18, 18))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(label2)
            .addGap(26, 26, 26)))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(label3)
              .addComponent(cbKategoriBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(22, 22, 22)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lbInput1)
              .addComponent(tfBkManual, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lbInput2)
              .addComponent(tfGaransi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
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
            .addComponent(btnSimpan)
            .addGap(47, 47, 47))
          .addGroup(layout.createSequentialGroup()
            .addGap(9, 9, 9)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
    
    // variabel list dengan tipe barang alat rumah tangga
    // penyimpan kumpulan barang
    List<BarangAlatRumahTangga> barangs = new ArrayList<BarangAlatRumahTangga>();
    
    public String generateKodeBarang(String namaBarang) {
      Random randomer = new Random();
      int randomNumber = randomer.nextInt(1000);
      return namaBarang + randomNumber;
    }
    
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        // ambil data input
        int indexKategoriBarangTerpilih = cbKategoriBarang.getSelectedIndex();
        String kategoriBarangTerpilih = cbKategoriBarang.getItemAt(indexKategoriBarangTerpilih);
        String pemasok = tfPemasok.getText();
        String pabrikan = tfPabrikan.getText();
        String nama = tfNama.getText();
        int jumlah = Integer.parseInt(tfJumlah.getText());
        String bukuManual = tfBkManual.getText();
        String garansi = tfGaransi.getText();
        
        // generate fake KodeBarang
        String fakeKodeBarang = generateKodeBarang(nama);
        
        // buat objek BarangMikroElektronik
        BarangAlatRumahTangga inputBarangAlatRumahTangga = 
                new BarangAlatRumahTangga(bukuManual, garansi,  kategoriBarangTerpilih, pemasok, pabrikan, nama, jumlah);
        
        // set nilai kodeBarang menggunakan setter
        inputBarangAlatRumahTangga.setKodeBarang(fakeKodeBarang);
        
        // kosongkan input field
        tfPemasok.setText("");
        tfPabrikan.setText("");
        tfNama.setText("");
        tfJumlah.setText("");
        tfBkManual.setText("");
        tfGaransi.setText("");
        
        // Prosess simpan barang
        barangs.add(inputBarangAlatRumahTangga);
        
        // tampilakn barang yang baru saja di masukkan
        taDisplayBarang.setText("");
        taDisplayBarang.append("Data Barang Masuk...\n");
        taDisplayBarang.append("--------------------------------------------\n");
        // ambil kode barang menggunakan getter
        taDisplayBarang.append("Kode       : " + inputBarangAlatRumahTangga.getKodeBarang() + "\n");
        taDisplayBarang.append("Kategori   : " + inputBarangAlatRumahTangga.getKategori() + "\n");
        taDisplayBarang.append("Pemasok    : " + inputBarangAlatRumahTangga.getPemasok() + "\n");
        taDisplayBarang.append("Pabrikan   : " + inputBarangAlatRumahTangga.getPabrikan() + "\n");
        taDisplayBarang.append("Nama       : " + inputBarangAlatRumahTangga.getNama() + "\n");
        taDisplayBarang.append("Jumlah     : " + inputBarangAlatRumahTangga.getJumlah() + "\n");
        taDisplayBarang.append("Bk. Manual : " + inputBarangAlatRumahTangga.getBukuManual()+ "\n");
        taDisplayBarang.append("Garansi    : " + inputBarangAlatRumahTangga.getGaransi()+ "\n\n");
        
        // tampilkan data barang yang tersimpan
        taDisplayBarang.append("\nRekap Data Barang yang Tersimpan\n");
        taDisplayBarang.append("--------------------------------------------\n");
        
        // tampilkan data barang yang tersimpan dalam variabel barangs
        for (int indexBarang = 0;indexBarang < barangs.size();++indexBarang) {
            BarangAlatRumahTangga barang = barangs.get(indexBarang);
            
            taDisplayBarang.append((indexBarang + 1) + ". " + barang.getNama() + "\n");
            // status barang apakah kosong atau tidak?
            String statusBarang = barang.isKosong() ? "Stock Kosong" : "Tersedia";
            taDisplayBarang.append("   Status      : " + statusBarang + "\n");
            taDisplayBarang.append("   Kategori    : " + barang.getKategori() + "\n");
            taDisplayBarang.append("   Pemasok     : " + barang.getPemasok() + "\n");
            taDisplayBarang.append("   Pabrikan    : " + barang.getPabrikan() + "\n");
            taDisplayBarang.append("   Jumlah      : " + barang.getJumlah() + "\n");
            taDisplayBarang.append("   Bk. Manual  : " + barang.getBukuManual()+ "\n");
            taDisplayBarang.append("   Garansi     : " + barang.getGaransi()+ "\n\n");

        }
    }//GEN-LAST:event_btnSimpanActionPerformed

  private void cbKategoriBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKategoriBarangActionPerformed
    // TODO add your handling code here:
    int ketegoriTerpilih = cbKategoriBarang.getSelectedIndex();
    if (ketegoriTerpilih == 0) {
      // sembunyikan gui Gui_BarangMikroelektronik
      this.setVisible(false); 
      // tampilkan Gui_InputBarang
      GUI_InputBarang.main(null); 
    } else if (ketegoriTerpilih == 1) {
      // sembunyikan gui Gui_BarangAlatRumahTangga
      this.setVisible(false); 
      // tampilkan Gui_BarangMikroElektronik
      GUI_BarangAlatRumahTangga.main(null); 
    }
  }//GEN-LAST:event_cbKategoriBarangActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_BarangAlatRumahTangga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_BarangAlatRumahTangga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_BarangAlatRumahTangga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_BarangAlatRumahTangga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GUI_BarangAlatRumahTangga().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnSimpan;
  private javax.swing.JComboBox<String> cbKategoriBarang;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel label1;
  private javax.swing.JLabel label2;
  private javax.swing.JLabel label3;
  private javax.swing.JLabel label4;
  private javax.swing.JLabel label5;
  private javax.swing.JLabel label6;
  private javax.swing.JLabel label7;
  private javax.swing.JLabel label8;
  private javax.swing.JLabel lbInput1;
  private javax.swing.JLabel lbInput2;
  private javax.swing.JTextArea taDisplayBarang;
  private javax.swing.JTextField tfBkManual;
  private javax.swing.JTextField tfGaransi;
  private javax.swing.JTextField tfJumlah;
  private javax.swing.JTextField tfNama;
  private javax.swing.JTextField tfPabrikan;
  private javax.swing.JTextField tfPemasok;
  // End of variables declaration//GEN-END:variables
}
