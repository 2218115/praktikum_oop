package ProjectPraktikum.Bab6;

public class Gaji_reward extends Gaji_abs_reward {
  double menit;
  double tunj_bonus;
  double gajipokok;
  double tunj_anak;
  double anak;
  
  double lembur() {
    double jam = menit / 60.0;
    double hasilLembur = jam * 25000;
    tunj_bonus = tunjanganAnak() + hasilLembur;
    
    return tunj_bonus;
  }
  
  double tunjanganAnak() {
    double persentase = 0;
    if (anak == 1) {
      persentase = 0.1;
    } else if (anak > 1) {
      persentase = 0.2;
    } 
    tunj_anak = persentase * gajipokok;
    
    return tunj_anak;
  }
}
