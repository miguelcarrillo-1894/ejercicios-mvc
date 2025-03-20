
package Vista;

import java.util.Scanner;


public class Vista {
     private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public double leerTemperatura() {
        System.out.print("Ingrese la temperatura (°C): ");
        return scanner.nextDouble();
    }

    public double leerHumedad() {
        System.out.print("Ingrese la humedad (%): ");
        return scanner.nextDouble();
    }

    public void mostrarEstadoAire(boolean encendido) {
        System.out.println(encendido ? "Aire acondicionado encendido." : "Aire acondicionado apagado.");
    }
    
    public int Cancelarprograma(){
         int x=scanner.nextInt();
        return x;
    }
    public void menu(){
        System.out.println("1. Ejecutar sistema.");
        System.out.println("2. Revisar registros.");
        System.out.println("3. Salir.");
      
    }
}
