package Tugas.Bab7;

public class BarangAlatRumahTangga extends Barang {
  String bukuManual;
  String garansi;
  
  public BarangAlatRumahTangga(String bukuManual, String garansi, String kategori, String pemasok, String pabrikan, String nama, int jumlah) {
    super(kategori, pemasok, pabrikan, nama, jumlah);
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
  
  // override fungsi getFields pada class induk
  // di override karena pada class ini kebutuhan tidak sama
  // dengan class indukan
  @Override
  public String[] getFields() {
    String []fields = new String[8];
      
      fields[0] = getKodeBarang();
      fields[1] = this.kategori;
      fields[2] = this.pemasok;
      fields[3] = this.pabrikan;
      fields[4] = this.nama;
      fields[5] = Integer.toString(this.jumlah);
      fields[6] = "Bk. Manual: " + this.bukuManual;
      fields[7] = "Garansi   : " + this.garansi;
      
      return fields;
  }
  
}