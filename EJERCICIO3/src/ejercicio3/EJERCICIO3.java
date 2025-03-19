/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author SENA
 */
public class EJERCICIO3 {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
    
}
