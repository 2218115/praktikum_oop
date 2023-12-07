package Bab8.Interface;

public class Payment extends Purchase implements Cash, Credit, EMoney {
  double total, creditBalance, emoneyBalance, cashBalance;
  
  public Payment(double setTotal) {
    this.creditBalance = 1000000;
    this.emoneyBalance = 500000;
    this.cashBalance = 1500000;
    this.total = setTotal;
  }
  
  @Override
  public void titlePurchase(int numberPurchase) {
    System.out.println("Pembelian ke - " + numberPurchase);
  }
  
  @Override
  public double cashProces() {
    total = cashBalance - this.total;
    return total;
  }
  
  @Override
  public double creditProses() {
    total = creditBalance - this.total;
    return total;
  }
  
  @Override
  public double emoneyProses() {
    total = emoneyBalance - this.total;
    return total;
  }
}
