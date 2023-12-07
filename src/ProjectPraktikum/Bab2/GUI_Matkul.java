/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjectPraktikum.Bab2;

/**
 *
 * @author makrusali
 */
public class GUI_Matkul extends javax.swing.JFrame {

  /**
   * Creates new form GUI_Matkul
   */
  public GUI_Matkul() {
    initComponents();
    
    tfKodeMatakuliah.setEnabled(true);
    tfMatakuliah.setEnabled(true);
    tfDosenPengajar.setEnabled(true);
    tfJumlahSKS.setEnabled(true);
    tfHasil.setEnabled(true);
    
    //Data_Matkul dataMatkul = new Data_Matkul("IF001", "OOP", "SIAPA", 4);
    //tfKodeMatakuliah.setText(dataMatkul.kode_mk);
    //tfMatakuliah.setText(dataMatkul.nama_mk);
    //tfDosenPengajar.setText(dataMatkul.dosen_pengampu);
    //tfJumlahSKS.setText(Integer.toString(dataMatkul.jumlah_sks));
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
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    tfKodeMatakuliah = new javax.swing.JTextField();
    tfMatakuliah = new javax.swing.JTextField();
    tfDosenPengajar = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    tfJumlahSKS = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tfHasil = new javax.swing.JTextArea();
    btnCektakDosen = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel1.setText("DATA MATA KULIAH");

    jLabel2.setText("Kode Matakuliah");

    jLabel3.setText("Mata kuliah");

    jLabel4.setText("Dosen Pengajar");

    jLabel5.setText("Jumlah SKS");

    tfHasil.setColumns(20);
    tfHasil.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
    tfHasil.setRows(5);
    jScrollPane1.setViewportView(tfHasil);

    btnCektakDosen.setText("Cetak Dosen Matakuliah");
    btnCektakDosen.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCektakDosenActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(32, 32, 32)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel2)
          .addComponent(jLabel3)
          .addComponent(jLabel4)
          .addComponent(jLabel5))
        .addGap(58, 58, 58)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(btnCektakDosen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(tfJumlahSKS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
              .addComponent(tfKodeMatakuliah, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(tfMatakuliah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
              .addComponent(tfDosenPengajar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
            .addGap(27, 27, 27)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(41, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(jLabel1)
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(tfKodeMatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3)
              .addComponent(tfMatakuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(tfDosenPengajar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel5)
              .addComponent(tfJumlahSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(btnCektakDosen))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(29, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnCektakDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCektakDosenActionPerformed
    // TODO add your handling code here:
    Data_Matkul dataMatkul = new Data_Matkul("IF001", "OOP", "Pak Yosep Agus Pranoto, Pak Deddy Rudistiar", 4);
    tfKodeMatakuliah.setText(dataMatkul.kode_mk);
    tfMatakuliah.setText(dataMatkul.nama_mk);
    tfDosenPengajar.setText(dataMatkul.dosen_pengampu);
    tfJumlahSKS.setText(Integer.toString(dataMatkul.jumlah_sks));

    
    tfHasil.setText("-------------------------------------\n");
    tfHasil.append("KODE MK        : " + dataMatkul.kode_mk + "\n");
    tfHasil.append("NAMA MK        : " + dataMatkul.nama_mk + "\n");
    tfHasil.append("DOSEN PENGAJAR : " + dataMatkul.dosen_pengampu + "\n");
    tfHasil.append("JUMLAH SKS     : " + dataMatkul.jumlah_sks + "\n");
    
  }//GEN-LAST:event_btnCektakDosenActionPerformed

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
      java.util.logging.Logger.getLogger(GUI_Matkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(GUI_Matkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(GUI_Matkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(GUI_Matkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new GUI_Matkul().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCektakDosen;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField tfDosenPengajar;
  private javax.swing.JTextArea tfHasil;
  private javax.swing.JTextField tfJumlahSKS;
  private javax.swing.JTextField tfKodeMatakuliah;
  private javax.swing.JTextField tfMatakuliah;
  // End of variables declaration//GEN-END:variables
}
