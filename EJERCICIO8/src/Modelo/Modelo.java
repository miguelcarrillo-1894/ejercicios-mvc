/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;

public class Modelo {
    private boolean accesoPermitido;
    private ArrayList<String> registros;

    public Modelo() {
        this.accesoPermitido = false;
        this.registros = new ArrayList<>();
    }

    public boolean isAccesoPermitido() {
        return accesoPermitido;
    }

    public void setAccesoPermitido(boolean accesoPermitido) {
        this.accesoPermitido = accesoPermitido;
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public ArrayList<String> getRegistros() {
        return registros;
    }
}
