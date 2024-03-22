package edu.vanessa_saucedo.reto7.process;

/**
 * Clase especial para la division
 */
public class Division extends Resta{

    /**
     * Metodo extendido de la clase resta y operacion aritmetica
     * para calcular la division
     */
    @Override
    public double calcular(double num1, double num2) {
        double cociente = 0;
        while (num1 >= num2){
            num1= super.calcular(num1, num2);
            cociente ++;
        }
        return cociente;
    }
}
