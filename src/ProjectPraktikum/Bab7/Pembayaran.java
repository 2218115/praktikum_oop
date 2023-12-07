package ProjectPraktikum.Bab7;

public abstract class Pembayaran {
  abstract double hitPembayaran(double bayar);
  abstract double cekKode(String input);
  abstract void tampilkanMember();
  
  String member(G0001 member) {
    return "Gold";
  }
  
  String member(P0001 member) {
    return "Platinum";
  }
  
  String member(S0001 member) {
    return "Silver";
  }
}
