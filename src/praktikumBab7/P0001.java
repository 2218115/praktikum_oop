package praktikumBab7;

public class P0001 extends Pembayaran {
  public String nama, alamat;
  public int saldo;
  public String kode;
  double diskon, bayar, total;
  
  public P0001() {
    this.nama = "Mahairul";
    this.kode = "P0001";
    this.saldo = 3000000;
    this.alamat = "Blitar";
  }
  
  public double hasil() {
    return diskon;
  }

  @Override
  double cekKode(String input) {
    if (input.compareTo(kode) == 0) {
      diskon = 0.3;
    } else {
      diskon = 0;
    }
    return diskon;
  }

  @Override
  double hitPembayaran(double bayar) {
    diskon = bayar * diskon;
    total = bayar - diskon;
    return total;
  }
  
  double potSaldo() {
    return this.saldo - total;
  }

  @Override
  void tampilkanMember() {
    System.out.println("Member P0001 dengan diskon 30%");
  }
}
