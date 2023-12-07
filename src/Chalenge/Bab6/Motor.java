package Chalenge.Bab6;

public class Motor extends Kendaraan {
  public Motor() {
    jenisMesin = "4 Tak";
    jumlahRoda = 2;
    jenisKendaraan = "Motor";
  }
  
  @Override
  void maju() {
    System.out.println(jenisKendaraan + " Maju...");
  }

  @Override
  void matikan() {
    System.out.println(jenisKendaraan + " Dimatikan...");
  }

  @Override
  void nyalakan() {
    System.out.println(jenisKendaraan + " Ngengg dinyalakan...");
  }
}
