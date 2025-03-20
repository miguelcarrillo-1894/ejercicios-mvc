
package ejercicio8;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;


public class EJERCICIO8 {

    
    public static void main(String[] args) {
         Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.ejecutar();
    }
    
}
