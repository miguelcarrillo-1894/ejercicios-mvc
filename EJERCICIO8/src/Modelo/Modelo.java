
package Modelo;

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
