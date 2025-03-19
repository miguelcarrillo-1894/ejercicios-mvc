/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Vista {
       private Scanner scanner;
    public Vista(){
    this.scanner= new Scanner(System.in);

 
   }
        public void mostrarInstrucciones() {
        System.out.println("Este es el juego FizzBuzz. Se imprimen los números del 1 al n");

     }
  public int pedirrango(){
           System.out.println("dime el numero n");
           int n= scanner.nextInt();
        return n;
     }
}
