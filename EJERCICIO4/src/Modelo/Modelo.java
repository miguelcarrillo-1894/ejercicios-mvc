
package Modelo;

import java.util.ArrayList;


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
