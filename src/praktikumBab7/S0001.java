package praktikumBab7;

public class S0001 extends Pembayaran {
  public String nama, alamat;
  public int saldo;
  public String kode;
  double diskon, bayar, total;
  
  public S0001() {
    this.nama = "Ali";
    this.kode = "S0001";
    this.saldo = 500000;
    this.alamat = "Blitar";
  }
  
  public double hasil() {
    return diskon;
  }

  @Override
  double cekKode(String input) {
    if (input.compareTo(kode) == 0) {
      diskon = 0.1;
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
    System.out.println("Member S0001 dengan diskon 10%");
  }
}
