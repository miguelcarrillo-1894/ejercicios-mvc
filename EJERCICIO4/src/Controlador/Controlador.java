
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.util.Scanner;


public class Controlador {
    private Modelo modelo;
    private Vista vista;
    private Scanner scanner;
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.scanner= new Scanner(System.in);
    }

    public void controlarTemperatura() throws InterruptedException  {
        int temperatura = vista.obtenerTemperatura();
        String estado;

        if (temperatura < 10) {
            estado = "Calefactor activado";
        } else if (temperatura <= 25) {
            estado = "Sistema inactivo";
        } else {
            estado = "Ventilador activado";
        }

        String registro = "Temperatura: " + temperatura + "°C - " + estado;
        modelo.agregarRegistro(registro);
        vista.mostrarMensaje(registro);
        Thread.sleep(5000); 
    }

    public void mostrarRegistros() {
        vista.mostrarRegistros(modelo.obtenerRegistros());
    }
    
    public void Ejecutar () throws InterruptedException {
      int opcion;
        do {
           vista.mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 :
                    controlarTemperatura();
                    break;
                case 2 :
                    mostrarRegistros();
                    break;
                case 0 : 
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default :
                    vista.mostrarMensaje("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
}
}
