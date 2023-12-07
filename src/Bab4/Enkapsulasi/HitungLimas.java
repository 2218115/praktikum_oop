package Bab4.Enkapsulasi;

public class HitungLimas {
  private double LuasAlas;
  public double Tinggi;
  double volume;

    
  public double getLuasAlas() {
    return LuasAlas;
  }

  public void setLuasAlas(double LuasAlas) {
    this.LuasAlas = LuasAlas;
  }
  
  double volumeLimas() {
    volume = (1.0/3.0) * LuasAlas * Tinggi;
    return volume;
  }
}
