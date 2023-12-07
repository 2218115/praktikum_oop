package Chalenge.Bab6;

public class Mobil extends Kendaraan { 
  
  
  public Mobil() {
    jenisMesin = "Turbo V8";
    jumlahRoda = 4;
    jenisKendaraan = "Mobil";
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
    System.out.println(jenisKendaraan + " Brum Brum dinyalakan...");
  }
}
