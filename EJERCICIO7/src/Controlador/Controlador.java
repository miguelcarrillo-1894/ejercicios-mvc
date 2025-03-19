/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
     private Modelo modelo;
     private Vista vista;
     
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista= vista;
    }

    public void verificarAire(double temperatura, double humedad) {
        boolean encender = (temperatura > 28 && humedad > 60) || (temperatura > 30);
        modelo.setAireEncendido(encender);
        String estado = encender ? "Aire encendido" : "Aire apagado";
        modelo.agregarRegistro("Temperatura: " + temperatura + "°C, Humedad: " + humedad + "%. " + estado);
    }

    public void mostrarRegistros() {
        for (String registro : modelo.getRegistros()) {
            System.out.println(registro);
        }
    }
    
    public void ejecutar(){
         while (true) {
            double temperatura = vista.leerTemperatura();
            double humedad = vista.leerHumedad();
            verificarAire(temperatura, humedad);
            vista.mostrarEstadoAire(modelo.isAireEncendido());
            System.out.println("Presione 1 para salir.");
            int x = vista.Cancelarprograma();
            if(x==1){
                System.out.println("saliendo....");
                break;
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
    public void menu(){
        int opcion;
       
        do{
        vista.menu();
        opcion=vista.Cancelarprograma();
            switch(opcion){
                case 1:
                    ejecutar();
                    break;
                case 2:
                    mostrarRegistros();
                    break;
                case 3:
                    System.out.println("saliendo del programa....");
                    break;
                default:
                    System.out.println("seleccione una opcion de acuerdo al menu");
                    break;
            }
        }while(opcion!=3);
    }
    
}
