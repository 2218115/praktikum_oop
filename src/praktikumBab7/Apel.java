package praktikumBab7;

public class Apel extends Buah {
  public Apel() {
    this.nama = "Apel";
  }
  
  @Override
  void makanBuah() {
    System.out.println(nama + " Di makan dengan di kupas kulitnya atau di makan langsung (digigit)");
  }
}

