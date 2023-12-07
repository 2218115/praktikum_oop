package Chalenge.Bab6;

public class DriverClass {
  public static void main(String[] args) {
    Mobil mobil = new Mobil();
    mobil.nyalakan();
    mobil.maju();
    mobil.matikan();
    
    Motor motor = new Motor();
    motor.nyalakan();
    motor.maju();
    motor.matikan();

  }
}
