
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.util.Scanner;


public class Controlador {
     private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
           vista.mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 :
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.print("Ingrese la operación (+, -, *, /): ");
                    String operacion = scanner.next();
                    double resultado = modelo.calcular(num1, num2, operacion);
                    vista.mostrarResultado(resultado);
                break;
                case 2 :
                    vista.mostrarHistorial(modelo.getResultados());
                break;
                case 0 : 
                    System.out.println("Saliendo...");
                break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }
}
