/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9.Exception;

/**
 *
 * @author makrusali
 */
public class throwsException {
   static void Error() throws ClassNotFoundException {
    System.out.println("Ada yang error Nih!");
    throw new ClassNotFoundException("Error sudah saya tangkap");
  }
  
  public static void main(String[] args) {
    try {
      throwsException.Error();
    } catch(Exception e) { 
      e.printStackTrace();
    }
  }
}
