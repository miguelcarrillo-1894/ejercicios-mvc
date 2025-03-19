
package Modelo;


public class modelo {
    private int capacidad;
    private boolean[] asientos;

    public modelo(int capacidad) {
        this.capacidad = capacidad;
        this.asientos = new boolean[capacidad];
    }

    public boolean reservarAsiento(int asiento) {
        if (asiento >= 0 && asiento < capacidad && !asientos[asiento]) {
            asientos[asiento] = true;
            return true;
        }
        return false;
    }

    public boolean hayDisponibilidad() {
        for (boolean asiento : asientos) {
            if (!asiento) return true;
        }
        return false;
    }

    public void mostrarAsientos() {
        for (int i = 0; i < capacidad; i++) {
            System.out.println("Asiento " + (i + 1) + ": " + (asientos[i] ? "Reservado" : "Disponible"));
        }
    }
}
