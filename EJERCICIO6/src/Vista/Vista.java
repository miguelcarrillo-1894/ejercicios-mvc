
package Vista;


import java.util.Scanner;

public class Vista {
     private Scanner scanner = new Scanner(System.in);

    public boolean pedirEsNoche() {
        System.out.print("¿Es de noche? (true/false): ");
        return scanner.nextBoolean();
    }

    public boolean pedirMovimiento() {
        System.out.print("¿Hay movimiento en la habitación? (true/false): ");
        return scanner.nextBoolean();
    }

    public void mostrarEstadoLuces(boolean encendidas) {
        String estado = encendidas ? "ENCENDIDAS" : "APAGADAS";
        System.out.println("Estado de las luces: " + estado);
    }
}

