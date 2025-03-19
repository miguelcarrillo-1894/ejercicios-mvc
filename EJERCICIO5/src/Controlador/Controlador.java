/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;



import Modelo.Modelo;
import Vista.Vista;
import java.util.ArrayList;

import java.util.ArrayList;

public class Controlador {
    private boolean alarmaActiva;
    private ArrayList<String> registros;
    private Vista vista;

    public Controlador() {
        this.alarmaActiva = false;
        this.registros = new ArrayList<>();
        this.vista = new Vista();
    }

    public void mostrarMenu() {
        vista.mostrarMenu();
    }

    public void activarAlarma() {
        alarmaActiva = true;
        registros.add("Alarma activada");
        vista.mostrarMensaje("Alarma activada.");
    }

    public void desactivarAlarma() {
        alarmaActiva = false;
        registros.add("Alarma desactivada");
        vista.mostrarMensaje("Alarma desactivada.");
    }

    public void detectarIntruso(boolean esNoche, boolean sensor1, boolean sensor2, boolean sensor3) {
        int detectados = 0;
        if (sensor1) detectados++;
        if (sensor2) detectados++;
        if (sensor3) detectados++;

        if (alarmaActiva && esNoche && detectados >= 2) {
            registros.add("¡Intruso detectado! La alarma está activada.");
            vista.mostrarMensaje("¡Intruso detectado! La alarma está activada.");
        } else {
            registros.add("Sin intrusos detectados.");
            vista.mostrarMensaje("Sin intrusos detectados.");
        }
    }

    public void mostrarRegistros() {
        vista.mostrarRegistros(registros);
    }

    public void ejecutar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.obteneropcion();
            switch (opcion) {
                case 1 -> activarAlarma();
                case 2 -> desactivarAlarma();
                case 3 -> {
                    boolean[] datos = vista.simularMovimiento();
                    detectarIntruso(datos[0], datos[1], datos[2], datos[3]);
                }
                case 4 -> mostrarRegistros();
                case 0 -> vista.mostrarMensaje("Salir del programa");
                default -> vista.mostrarMensaje("Seleccione una de las opciones asignadas.");
            }
        } while (opcion != 0);
    }
}

