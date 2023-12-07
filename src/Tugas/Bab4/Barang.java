package Tugas.Bab4;

public class Barang {
    // kode barang di atur private
    private String kodeBarang;
    String kategori;
    String pemasok;
    String pabrikan;
    String nama;
    int jumlah;
    
    public Barang() {
      // konstruktor default ketika tanpa di beri nilai parameter
      kategori = "Tidak Dikategorikan";
      pemasok = "Belum di isi";
      pabrikan = "Belum di isi";
      nama = "Belum di isi";
      jumlah = 0;
      kodeBarang = "NULL";
    }
    
    public Barang(String kategori, String pemasok, String pabrikan, String nama, int jumlah) {
      // konstruktor ketika di beri nilai parameter
      this.kategori = kategori;
      this.pemasok = pemasok;
      this.pabrikan = pabrikan;
      this.nama = nama;
      this.jumlah = jumlah;
    }
    
    void setKodeBarang(String kodeBarang) {
      this.kodeBarang = kodeBarang;
    }
    
    String getKodeBarang() {
      return kodeBarang;
    }
    
    void setKategori(String inputKategori) {
        kategori = inputKategori;
    }
    
    void setPemasok(String inputPemasok) {
        pemasok = inputPemasok;
    }
    
    void setPabrikan(String inputPabrikan) {
        pabrikan = inputPabrikan;
    }
    
    void setNama(String inputNama) {
        nama = inputNama;
    }
    
    void setJumlah(int inputJumlah) {
        jumlah = inputJumlah;
    }
    
    String getKategori() {
        return kategori;
    }
    
    String getPemasok() {
        return pemasok;
    }
    
    String getPabrikan() {
        return pabrikan;
    }
    
    String getNama() {
        return nama;
    }
    
    int getJumlah() {
        return jumlah;
    }
    
    boolean isKosong() {
        if (jumlah == 0) { 
            return true; // kalo jumlah 0, berarti kosong
        } else {
            return false;
        }
    }
}
