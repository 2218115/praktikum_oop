package Bab8.Interface;

public class Main {
  public static void main(String[] args) {
    Payment pay1 = new Payment(750000);
    pay1.titlePurchase(1);
    System.out.println("credit Balance: " + pay1.creditBalance);
    System.out.println("Emoney Balance: " + pay1.emoneyBalance);
    System.out.println("Cash Balance: " + pay1.cashBalance);
    System.out.println("====================================");
    System.out.println("total Payment: " + pay1.total);
    System.out.println("=====================================");
    System.out.println("payment With credit, Ending Balance: " + pay1.creditProses());
    System.out.println("payment With Emoney, Ending Balance: " + pay1.emoneyProses());
    System.out.println("payment With Cash, Ending Balance: " + pay1.cashProces());
  }
}
