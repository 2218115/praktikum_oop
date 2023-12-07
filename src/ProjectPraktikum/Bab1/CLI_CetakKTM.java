/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab1;

/**
 *
 * @author makrusali
 */
public class CLI_CetakKTM {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.dataNIM("2218115");
        mhs.dataNama("M. Mahairul Makrus Ali");
        mhs.dataJenisKelamin("Laki-Laki");
        mhs.dataProdi("Teknik Informatika");
        mhs.dataAngkatan("2022");
        mhs.dataAlamat("Malang");
        System.out.println("Kartu Tanda Mahasiswa ITN Malang");
        System.out.println("----------------------------------------------");
        System.out.println("NIM                     : " + mhs.cetakNIM());
        System.out.println("Nama                    : " + mhs.cetakNama());
        System.out.println("Jenis Kelamin           : " + mhs.cetakJenisKelamin());
        System.out.println("Prodi                   : " + mhs.cetakProdi());
        System.out.println("Angkatan                : " + mhs.cetakAngkatan());
        System.out.println("Alamat                  : " + mhs.cetakAlamat());
    }
}
