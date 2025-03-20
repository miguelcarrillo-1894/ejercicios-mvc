
package Modelo;

import java.util.ArrayList;


public class Modelo {
     private boolean aireEncendido;
    private ArrayList<String> registros;

    public Modelo() {
        this.aireEncendido = false;
        this.registros = new ArrayList<>();
    }

    public boolean isAireEncendido() {
        return aireEncendido;
    }

    public void setAireEncendido(boolean encendido) {
        this.aireEncendido = encendido;
    }

    public void agregarRegistro(String registro) {
        registros.add(registro);
    }

    public ArrayList<String> getRegistros() {
        return registros;
    }
}
