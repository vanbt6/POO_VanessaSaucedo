package edu.vanessa_saucedo.reto7.process;

/**
 * Clase especial para calcular el Logaritmo
 */
public class Logaritmo extends OperacionAritmetica{

    /**
     * Metodo extendido de la clase division y operacion aritmetica
     * para calcular el logaritmo
     */
    @Override
    public double calcular(double num1, double num2) {
        double logaritmoNumero = Math.log(num1);
        double logaritmoBase = Math.log(num2);

        Division division = new Division();
        return division.calcular(logaritmoNumero, logaritmoBase);
    }
}
