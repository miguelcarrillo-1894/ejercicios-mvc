/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {
     private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarRegistros(ArrayList<String> registros) {
        System.out.println("--- Registros de Acceso ---");
        for (String registro : registros) {
            System.out.println(registro);
        }
    }

    public boolean ingresarBoolean(String mensaje) {
        System.out.print(mensaje + " (true/false): ");
        return scanner.nextBoolean();
    }
}
