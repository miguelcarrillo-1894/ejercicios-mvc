/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author SENA
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
          Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo, vista);
         controlador.iniciar();
  
   
    }
    
}
