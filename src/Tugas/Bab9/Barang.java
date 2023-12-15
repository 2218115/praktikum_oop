package Tugas.Bab9;

import Tugas.Bab8.*;

public abstract class Barang {
  private int id;
  private String kodeBarang;
  private String kategori;
  private String pemasok;
  private String pabrikan;
  private String nama;
  private int jumlah;
  
  public Barang() {
    
  }
  
  public Barang(String kategori, String pemasok, String pabrikan, String nama, int jumlah) {
    this.kategori = kategori;
    this.pemasok = pemasok;
    this.pabrikan = pabrikan;
    this.nama = nama;
    this.jumlah = jumlah;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
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
    if (satuan.equals("Satuan")) {
      this.jumlah = jumlah;
    } else if (satuan.equals("Puluhan")) {
      this.jumlah = jumlah * 10;
    } else if (satuan.equals("Ratusan")) {
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
  abstract String[] getFields();
}
