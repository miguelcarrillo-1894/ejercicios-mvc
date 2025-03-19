
package ejercicio2;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;


public class EJERCICIO2 {

   
    public static void main(String[] args) {
         
          Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo, vista);
         controlador.iniciar();
  
   
    }
    
}
