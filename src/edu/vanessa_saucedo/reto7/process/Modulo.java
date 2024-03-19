package edu.vanessa_saucedo.reto7.process;

/**
 * Clase especial para dar el residuo de una division
 */
public class Modulo extends Resta{

    /**
     * Metodo extendido de la clase suma y operacion aritmetica
     * para calcular la multiplicacion
     */
    @Override
    public double calcular(double num1, double num2) {
        while (num1 >= num2 ){
            num1 = super.calcular(num1, num2);
        }
        return num1;
    }
}
