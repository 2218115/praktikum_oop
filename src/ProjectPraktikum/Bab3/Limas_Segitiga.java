/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab3;

/**
 *
 * @author makrusali
 */
public class Limas_Segitiga extends Segitiga {
  double tinggiLimas;
  double vol;
  
  double VolumeLimas() {
    vol = (0.333 * Luas()) * tinggiLimas;
    return vol;
  }
  
}
