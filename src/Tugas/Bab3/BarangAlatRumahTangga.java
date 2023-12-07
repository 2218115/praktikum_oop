package Tugas.Bab3;

public class BarangAlatRumahTangga extends Barang {
  String bukuManual;
  String garansi;
  
  public BarangAlatRumahTangga(String bukuManual, String garansi, String kodeBarang, String kategori, String pemasok, String pabrikan, String nama, int jumlah) {
    super(kodeBarang, kategori, pemasok, pabrikan, nama, jumlah);
    this.bukuManual = bukuManual;
    this.garansi = garansi;
  }

  public String getBukuManual() {
    return bukuManual;
  }

  public String getGaransi() {
    return garansi;
  }

  public void setBukuManual(String bukuManual) {
    this.bukuManual = bukuManual;
  }

  public void setGaransi(String garansi) {
    this.garansi = garansi;
  }
  
}

