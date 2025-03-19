
package Vista;

import java.util.Scanner;


public class vista {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("1. Ver asientos");
        System.out.println("2. Reservar asiento");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public int pedirAsiento() {
        System.out.print("Seleccione el número de asiento a reservar: ");
        return scanner.nextInt() - 1; 
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
