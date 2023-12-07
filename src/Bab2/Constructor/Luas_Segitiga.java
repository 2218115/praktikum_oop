/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2.Constructor;

/**
 *
 * @author makrusali
 */
public class Luas_Segitiga {
  int alas;
  int tinggi;
  double luas;
  
  public Luas_Segitiga() {
    this.alas = 10;
  }
  
  double Luas() {
    luas = (alas * tinggi) / 2;
    return luas;
  }
}
