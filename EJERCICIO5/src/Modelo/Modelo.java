
package Modelo;

import java.util.ArrayList;


public class Modelo {
      private boolean alarmaActivada;
    private ArrayList<String> registros;

    public Modelo() {
        this.alarmaActivada = false;
        this.registros = new ArrayList<>();
    }

    public boolean isAlarmaActivada() {
        return alarmaActivada;
    }

    public void setAlarmaActivada(boolean activada) {
        this.alarmaActivada = activada;
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public ArrayList<String> getRegistros() {
        return registros;
    }
    
}
