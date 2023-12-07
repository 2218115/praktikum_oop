package praktikumBab7;

public class Pisang extends Buah {
  public Pisang() {
    this.nama = "Pisang";
  }
  
  @Override
  void makanBuah() {
    System.out.println(nama + " Di makan dengan di kupas kulit pisang sebelum dimakan");
  }
}