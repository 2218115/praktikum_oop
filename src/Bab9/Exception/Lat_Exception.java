/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9.Exception;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author makrusali
 */
public class Lat_Exception {
   public static void main(String[] args) {
    int a, b, hasil;
    
    try {
          Scanner keyboard = new Scanner(System.in);
    System.out.println("========== PROGRAM PEMBAGIAN ========");
     System.out.println("Masukkan angka ke 1 = ");
     a = Integer.parseInt(keyboard.next());
     System.out.println("Masukkan angka ke 2 = ");
     b = Integer.parseInt(keyboard.next());
     hasil = a / b;
     System.out.println(Integer.toString(hasil));

    } catch(ArithmeticException c) {
      JOptionPane.showMessageDialog(null, "Nilai pembagi tidak boleh 0", "warning", 2);
    } catch(NumberFormatException d) {
      JOptionPane.showMessageDialog(null, "Input yang anda masukkan huruf bukan angka !!", "warning", 2);
    } finally {
      System.out.println("Sudah menjalankan program");
    }
  }
  
}
