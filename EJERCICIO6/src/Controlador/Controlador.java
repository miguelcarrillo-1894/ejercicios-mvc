
package Controlador;


import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
  private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutar() {
        while (true) {
            boolean esNoche = vista.pedirEsNoche();
            boolean hayMovimiento = vista.pedirMovimiento();

            if (esNoche && hayMovimiento) {
                modelo.setLucesEncendidas(true);
            } else {
                modelo.setLucesEncendidas(false);
            }

            vista.mostrarEstadoLuces(modelo.isLucesEncendidas());

            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

