/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9.Exception;

/**
 *
 * @author makrusali
 */
public class Login {
  private String username, password;
  public String nama;
  public Login() {
    nama = "M. Mahairul Makrus Ali";
    username = "makrusali";
    password = "cobacoba";
  }
  
  public String getUsername() {
    return this.username;
  }
  
  public void setUsername(String username) {
    this.username = username;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  boolean cekLogin(String username, String password) {
    if (username.equals(getUsername()) && password.equals(getPassword())) {
      return true;
    }
    return false;
  }
}
