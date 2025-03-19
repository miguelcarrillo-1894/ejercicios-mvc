
package ejercicio1;

import Modelo.modelo;
import Vista.vista;
import Controlador.controlador;
public class EJERCICIO1 {

 
    public static void main(String[] args) {
        vista vista = new vista();
        modelo modelo = new modelo(5);  
        controlador controlador = new controlador(modelo, vista);
        controlador.ejecutar();
    }
    
}
