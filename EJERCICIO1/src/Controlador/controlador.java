
package Controlador;

import Modelo.modelo;
import Vista.vista;


public class controlador {
    private modelo modelo;
    private vista vista;

    public controlador(modelo modelo, vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    modelo.mostrarAsientos();
                    break;
                case 2:
                    if (modelo.hayDisponibilidad()) {
                        int asiento = vista.pedirAsiento();
                        if (modelo.reservarAsiento(asiento)) {
                            vista.mostrarMensaje("Asiento reservado exitosamente.");
                        } else {
                            vista.mostrarMensaje("Este asiento ya está reservado o no existe.");
                        }
                    } else {
                        vista.mostrarMensaje("No hay asientos disponibles.");
                    }
                    break;
                case 0:
                    vista.mostrarMensaje("Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
