package edu.vanessa_saucedo.reto7.process;

/**
 * Clase especial para la Raiz
 */
public class Raiz extends Multiplicacion {

    /**
     * Metodo extendido de la clase Multiplicación y operacion aritmetica
     * para calcular la raiz
     */
    @Override
    public double calcular(double num1, double num2) {
        double raiz;
        double pruebaPotecncias = 0;
        double validacion = 0;
        double aproximacion = 1;

        while (pruebaPotecncias < num1) {
            validacion = aproximacion;
            pruebaPotecncias = 1;
            for (int i = 0; i < num2; i++) {
                pruebaPotecncias = super.calcular(pruebaPotecncias, aproximacion);
            }
            aproximacion++;
        }
        raiz = validacion;

        return raiz;
    }
}
