
package Vista;



import java.util.ArrayList;
import java.util.Scanner;


public class Vista {
    
    private Scanner scanner;

    public Vista() {
       
        this.scanner = new Scanner(System.in);
    }


    public void mostrarMenu() {
    
        
            System.out.println("\n--- Detección de Intrusos ---");
            System.out.println("1. Activar alarma");
            System.out.println("2. Desactivar alarma");
            System.out.println("3. Simular detección de movimiento");
            System.out.println("4. Ver registros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
       
    }
    public int obteneropcion(){
        int opcion= scanner.nextInt();
        return opcion;
    }
     public void activarAlarma() {
        System.out.println("Alarma activada.");
    }

    public void desactivarAlarma() {
        System.out.println("Alarma desactivada.");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarRegistros(ArrayList<String> registros) {
        System.out.println("--- Registros ---");
        for (String registro : registros) {
            System.out.println(registro);
        }
    }

    public boolean[] simularMovimiento() {
        boolean[] datos = new boolean[4];
        System.out.print("¿Es de noche? (true/false): ");
        datos[0] = scanner.nextBoolean();
        System.out.print("¿Sensor 1 detecta movimiento? (true/false): ");
        datos[1] = scanner.nextBoolean();
        System.out.print("¿Sensor 2 detecta movimiento? (true/false): ");
        datos[2] = scanner.nextBoolean();
        System.out.print("¿Sensor 3 detecta movimiento? (true/false): ");
        datos[3] = scanner.nextBoolean();
        return datos;
    }

   
}
