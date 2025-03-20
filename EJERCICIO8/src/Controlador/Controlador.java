
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

    public void verificarAcceso() {
        boolean tieneMembresia = vista.ingresarBoolean("¿Tiene membresía?");
        boolean esEmpleado = vista.ingresarBoolean("¿Es empleado?");
        boolean horarioAtencion = vista.ingresarBoolean("¿Está en horario de atención?");

        if ((tieneMembresia && horarioAtencion) || esEmpleado) {
            vista.mostrarMensaje("Acceso permitido.");
            modelo.agregarRegistro("Acceso permitido.");
        } else {
            vista.mostrarMensaje("Acceso denegado.");
            modelo.agregarRegistro("Acceso denegado.");
        }
    }

    public void mostrarRegistros() {
        vista.mostrarRegistros(modelo.getRegistros());
    }

    public void ejecutar() {
        int opcion;
        do {
            vista.mostrarMensaje("\n--- Control de Acceso a la Tienda ---");
            vista.mostrarMensaje("1. Verificar acceso");
            vista.mostrarMensaje("2. Ver registros");
            vista.mostrarMensaje("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 : 
                    verificarAcceso(); 
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
