
package Modelo;

import java.util.ArrayList;


public class Modelo {
    private ArrayList<String> resultados;

    public Modelo() {
        resultados = new ArrayList<>();
    }

    public double calcular(double num1, double num2, String operacion) {
        double resultado = 0;
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
        resultados.add(num1 + " " + operacion + " " + num2 + " = " + resultado);
        return resultado;
    }

    public ArrayList<String> getResultados() {
        return resultados;
    }



}
