/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import Modelo.Modelo;
import Vista.Vista;
import Controlador.Controlador;
public class EJERCICIO4 {

  
    public static void main(String[] args) throws InterruptedException {
      Modelo modelo = new Modelo();
     Vista vista= new Vista();
    Controlador controlador = new Controlador(modelo,vista);
      controlador.Ejecutar();
    }
    
}
