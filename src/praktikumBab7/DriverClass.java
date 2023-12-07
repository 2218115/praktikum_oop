package praktikumBab7;

public class DriverClass {
  public static void main(String []args) {
    Manusia manusia = new Manusia();
    
    Buah apel = new Apel();
    Buah pisang = new Pisang();
    
    manusia.makanBuah(apel);
    manusia.makanBuah(pisang);
  }
}
