package edu.vanessa_saucedo.reto7.process;

/**
 * Clase especial para calcular el Logaritmo
 */
public class Logaritmo extends Division{

    /**
     * Metodo extendido de la clase division y operacion aritmetica
     * para calcular el logaritmo
     */
    @Override
    public double calcular(double num1, double num2) {
        double logaritmo = 0;
        double argumento = num1;
        while (argumento > 1) {
            argumento = super.calcular(argumento, num2);
            logaritmo++;
        }
        return logaritmo;
    }
}
