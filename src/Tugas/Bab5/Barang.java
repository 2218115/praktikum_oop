package Tugas.Bab5;

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
    
    void setJumlah(int jumlah, String satuan) {
      if (satuan == "Satuan") {
        this.jumlah = jumlah;
      } else if (satuan == "Pululan") {
        this.jumlah = jumlah * 10;
      } else if (satuan == "Ratusan") {
        this.jumlah = jumlah * 100;
      }
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
    
    // fungsi untuk mendapatkan semua fields
    // ini digunakan ketika ingin menampilkan ke dalam table
    String[] getFields() {
      String []fields = new String[6];
      
      fields[0] = this.kodeBarang;
      fields[1] = this.kategori;
      fields[2] = this.pemasok;
      fields[3] = this.pabrikan;
      fields[4] = this.nama;
      fields[5] = Integer.toString(this.jumlah);
      
      return fields;
    }
}
