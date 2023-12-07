package Tugas.Bab5;

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
   
}
