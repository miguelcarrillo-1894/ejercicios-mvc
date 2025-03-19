
package Vista;

import java.util.Scanner;


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
