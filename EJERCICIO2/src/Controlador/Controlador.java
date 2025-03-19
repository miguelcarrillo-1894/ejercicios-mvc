/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author SENA
 */
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
