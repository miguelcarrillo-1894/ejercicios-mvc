
package Vista;

import java.util.ArrayList;
import java.util.Scanner;


public class Vista {
     private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int obtenerTemperatura() {
        System.out.print("Ingrese la temperatura actual: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarRegistros(ArrayList<String> registros) {
        System.out.println("Registros de temperatura:");
        for (String registro : registros) {
            System.out.println(registro);
        }
    }
    public void mostrarMenu(){
         System.out.println("1. Controlar temperatura");
            System.out.println("2. Ver registros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
    }
}
