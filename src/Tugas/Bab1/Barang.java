package Tugas.Bab1;

public class Barang {
    String kategori;
    String pemasok;
    String pabrikan;
    String nama;
    int jumlah;
    
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
