package praktikumBab7;

public class DriverPembayaran {
  public static void main(String[] args) {
    Pembayaran payment;
    payment = new G0001();
    payment.tampilkanMember();
    
    if (payment instanceof P0001) {
      P0001 p0001 = (P0001)payment;
      
      System.out.println("Jenis Member: " + p0001.member(p0001));
      System.out.println("Total Pembelian: " + p0001.hitPembayaran(500000));
      System.out.println("Sisal saldo: " + p0001.potSaldo());
    } else if (payment instanceof G0001) {
      G0001 g0001 = (G0001)payment;
      
      System.out.println("Jenis Member: " + g0001.member(g0001));
      System.out.println("Total Pembelian: " + g0001.hitPembayaran(500000));
      System.out.println("Sisal saldo: " + g0001.potSaldo());
    } else if (payment instanceof S0001) {
      S0001 s0001 = (S0001)payment;
      
      System.out.println("Jenis Member: " + s0001.member(s0001));
      System.out.println("Total Pembelian: " + s0001.hitPembayaran(500000));
      System.out.println("Sisal saldo: " + s0001.potSaldo());
    }
  }
}
