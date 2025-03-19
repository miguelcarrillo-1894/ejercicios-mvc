
package Vista;

import java.util.ArrayList;
import java.util.Scanner;


public class Vista {
        public void mostrarMenu() {
        System.out.println("1. Realizar calculo");
        System.out.println("2. Revisar historial");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
      public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public void mostrarHistorial(ArrayList<String> resultados) {
        System.out.println("Historial de cálculos:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}
