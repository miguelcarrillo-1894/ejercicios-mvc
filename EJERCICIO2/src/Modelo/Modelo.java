/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author SENA
 */
public class Modelo {
      public String[] ejecutar(int n) {
           
         String[] resultado = new String[n];
        
        
        for (int i = 1; i <= n; i++) {
          
            if (i % 3 == 0 && i % 5 == 0) {
                resultado[i - 1] = "FizzBuzz";
            }
            
            else if (i % 3 == 0) {
                resultado[i - 1] = "Fizz";
            }
          
            else if (i % 5 == 0) {
                resultado[i - 1] = "Buzz";
            }
            
            else {
                resultado[i - 1] = Integer.toString(i);
            }
        }
        
     
        return resultado;
    }
    }
