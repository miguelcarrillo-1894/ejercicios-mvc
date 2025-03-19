
package Controlador;

import Modelo.Modelo;
import Vista.Vista;


public class Controlador {
      private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        vista.mostrarInstrucciones();
          int rango = vista.pedirrango();
          
         
         for (String res : modelo.ejecutar(rango)) {
            System.out.println(res);
        }
    }
}
