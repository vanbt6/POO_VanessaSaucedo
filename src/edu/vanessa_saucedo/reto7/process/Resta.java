package edu.vanessa_saucedo.reto7.process;

/**
 * Clase especial para la resta
 */
public class Resta extends OperacionAritmetica {

    /**
     * Metodo extendido de la super Clase Operacion aritmetica
     * para calcular la resta
     */
    @Override
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }
}
