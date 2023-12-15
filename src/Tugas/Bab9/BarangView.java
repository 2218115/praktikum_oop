package Tugas.Bab9;

import java.util.List;
import java.util.Random;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

// Class barang view akan menangani hal2 yang berkaitan dengan tampilan
public class BarangView  {
  
  private JTable tbInformasiBarang;
  private JFrame parent;
  private JTextField tfInput1;
  private JTextField tfInput2;
  private JTextField tfPemasok;
  private JTextField tfPabrikan;
  private JTextField tfNama;
  private JTextField tfJumlah;
  private JTextField tfSearch;
  private JComboBox<String> cbKategori;
  private JComboBox<String> cbSatuan;
  private JLabel lb1;
  private JLabel lb2;
  
  public void setViewComponents(JFrame parent, JTable tbInformasiBarang, JComboBox<String> cbKategori, JTextField tfInput1, JTextField tfInput2, JTextField tfPemasok, JTextField tfPabrikan, JTextField tfNama, JTextField tfJumlah, JComboBox<String> cbSatuan, JTextField tfSearch, JLabel lb1, JLabel lb2) {
    this.tbInformasiBarang = tbInformasiBarang;
    this.parent = parent;
    this.cbKategori = cbKategori;
    this.cbSatuan = cbSatuan;
    this.tfInput1 = tfInput1;
    this.tfInput2 = tfInput2;
    this.tfPemasok = tfPemasok;
    this.tfPabrikan = tfPabrikan;
    this.tfNama = tfNama;
    this.tfJumlah = tfJumlah;
    this.tfSearch = tfSearch;
    this.lb1 = lb1;
    this.lb2 = lb2;
  }
  
  public void initME() {
    clearTable();
    cbKategori.setSelectedIndex(1);
    cbKategori.setEnabled(false);
    lb1.setText("Dok. Datasheet");
    lb2.setText("Teg. Kerja");
    tfInput1.setEnabled(true);
    tfInput2.setEnabled(true);
  }
  
  public void initRT() {
    clearTable();
    cbKategori.setSelectedIndex(2);
    cbKategori.setEnabled(false);
    lb1.setText("Bk. Manual");
    lb2.setText("Garansi");
    tfInput1.setEnabled(true);
    tfInput2.setEnabled(true);
  }
  
  public void init() {
    clearTable();
    lb1.setText("-");
    lb2.setText("-");
    tfInput1.setEnabled(false);
    tfInput2.setEnabled(false);
  }
  
  public void onCbKategoriChange() {
    int kategoriTerpilih = cbKategori.getSelectedIndex();
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
  }
  
  public String getSelectedKodeBarang() {
    int selected = tbInformasiBarang.getSelectedRow();
    DefaultTableModel tableModel = (DefaultTableModel)tbInformasiBarang.getModel();
    return (String)tableModel.getValueAt(selected, 0);
  }
  
  public String getSearchQuery() {
    return this.tfSearch.getText();
  }
  
  // fungsi untuk memproduksi kodebarang secara acak
  public String generateKodeBarang(String namaBarang) {
    Random randomer = new Random();
    int randomNumber = randomer.nextInt(1000);
    return namaBarang.substring(0, 2).toUpperCase() + randomNumber;
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
  
  public void clearTable() {
      DefaultTableModel tableModel = (DefaultTableModel)tbInformasiBarang.getModel();
      int row = tableModel.getRowCount();
      while(row > 0) {
        tableModel.removeRow(row - 1);
        row = tableModel.getRowCount();
      }
    }
  
  public Barang getBarangFromInput() throws NumberFormatException {
    
    Barang b = null;
    
    int indexKategoriBarangTerpilih = cbKategori.getSelectedIndex();
    if (indexKategoriBarangTerpilih == 0) {
      JOptionPane.showMessageDialog(parent, "Kategori Barang harus di pilih");
      return b;
    }
   
    String kategoriBarangTerpilih = cbKategori.getItemAt(indexKategoriBarangTerpilih);
    String pemasok = tfPemasok.getText();
    String pabrikan = tfPabrikan.getText();
    String nama = tfNama.getText();
    int jumlah = Integer.parseInt(tfJumlah.getText());
    String satuan = cbSatuan.getItemAt(cbSatuan.getSelectedIndex());
    String input1 = tfInput1.getText();
    String input2 = tfInput2.getText();
        
    // generate fake kodeBarang
    String fakeKodeBarang = generateKodeBarang(nama);
        
    if (indexKategoriBarangTerpilih == 1) {
        b = new BarangMikroElektronik(input1, Double.parseDouble(input2), kategoriBarangTerpilih, pemasok, pabrikan, nama, jumlah);
    } else {
        b = new BarangAlatRumahTangga(input1, input2, kategoriBarangTerpilih, pemasok, pabrikan, nama, jumlah); 
    }
    
    b.setJumlah(jumlah, satuan);
    b.setKodeBarang(fakeKodeBarang);
    clearInput();

    return b;
  }

  public void showBarangInTable(List<Barang> barangs) {
    clearTable();
    DefaultTableModel tableModel = (DefaultTableModel)tbInformasiBarang.getModel();
    for (Barang ba : barangs) {
      if (ba instanceof BarangMikroElektronik) {
        // lakukan down casting
        BarangMikroElektronik bme = (BarangMikroElektronik)ba;
        tableModel.addRow(bme.getFields());
      } else if (ba instanceof BarangAlatRumahTangga) {
        // lakukan down casting
        BarangAlatRumahTangga bart = (BarangAlatRumahTangga)ba;
        tableModel.addRow(bart.getFields());
      }
    }
  }
}
