
package ejercicio7;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;


public class EJERCICIO7 {

    
    public static void main(String[] args) {
       Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.menu();
       
    }
    
}
