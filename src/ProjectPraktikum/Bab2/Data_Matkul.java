package ProjectPraktikum.Bab2;

public class Data_Matkul {
  String kode_mk;
  String nama_mk;
  String dosen_pengampu;
  int jumlah_sks;
  
  Data_Matkul(String kd, String mk, String dsn, int jml_sks) {
    this.kode_mk =  kd;
    this.nama_mk = mk;
    this.dosen_pengampu = dsn;
    this.jumlah_sks = jml_sks;
  }
}
