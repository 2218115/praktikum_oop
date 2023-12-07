/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab7;

/**
 *
 * @author makrusali
 */
public class Data_Matkul {
  String kode_mk;
  String nama_mk;
  String dosen_pengampu;
  int jumlah_sks;
  
  public Data_Matkul() {
    
  }
  
  Data_Matkul(String kd, String mk, String dsn, int jml_sks) {
    this.kode_mk =  kd;
    this.nama_mk = mk;
    this.dosen_pengampu = dsn;
    this.jumlah_sks = jml_sks;
  }
}
