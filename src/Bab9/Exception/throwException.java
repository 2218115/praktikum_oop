/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9.Exception;

import java.util.Scanner;

/**
 *
 * @author makrusali
 */
public class throwException {
  

  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jmlKaki;
    System.out.println("Berapa jumlah kaki kerbau?");
    try {
      System.out.print("Jumlah kaki: ");
      jmlKaki = input.nextInt();
      if (jmlKaki != 4) {
        throw new NullPointerException("terjadi kesalahan Nih!");
      } else {
        System.out.println("Benar jumlah kaki kerbau 4");
      }
    } catch(NullPointerException e) {
      e.printStackTrace();
    }
  }
}
