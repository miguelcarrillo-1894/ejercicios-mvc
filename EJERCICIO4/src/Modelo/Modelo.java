/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class Modelo {
 
    private ArrayList<String> registros;

    public Modelo() {
        registros = new ArrayList<>();
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public ArrayList<String> obtenerRegistros() {
        return registros;
    }
}
