package Tugas.Bab7;

import Tugas.Bab6.*;


public class BarangMikroElektronik extends Barang {
  String dokumenDatasheet;
  double teganganKerja;
  
  public BarangMikroElektronik(String dokumenDatasheet, double teganganKerja, String kategori, String pemasok, String pabrikan, String nama, int jumlah) {
    super(kategori, pemasok, pabrikan, nama, jumlah);
    this.dokumenDatasheet = dokumenDatasheet;
    this.teganganKerja = teganganKerja;
  }

  public String getDokumenDatasheet() {
    return dokumenDatasheet;
  }

  public double getTeganganKerja() {
    return teganganKerja;
  }

  public void setDokumenDatasheet(String dokumenDatasheet) {
    this.dokumenDatasheet = dokumenDatasheet;
  }

  public void setTeganganKerja(int teganganKerja) {
    this.teganganKerja = teganganKerja;
  }

  @Override
  String[] getFields() {
    String []fields = new String[8];
      
      fields[0] = getKodeBarang();
      fields[1] = this.kategori;
      fields[2] = this.pemasok;
      fields[3] = this.pabrikan;
      fields[4] = this.nama;
      fields[5] = Integer.toString(this.jumlah);
      fields[6] = "Datasheet : " + this.dokumenDatasheet;
      fields[7] = "Teg. Kerja: " + Double.toString(this.teganganKerja);
      
      return fields;
  }
  
}
