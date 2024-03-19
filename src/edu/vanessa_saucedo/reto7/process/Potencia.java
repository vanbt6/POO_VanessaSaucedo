package edu.vanessa_saucedo.reto7.process;

/**
 * Clase especial para la potencia
 */
public class Potencia extends Multiplicacion{

    /**
     * Metodo extendido de la clase multiplicación y operacion aritmetica
     * para calcular la potencia
     */
    @Override
    public double calcular(double num1, double num2) {
        double resultado = 1;
        for(int i = 0; i < num2; i++){
            resultado = super.calcular(resultado,num1);
        }
        return resultado;
    }
}
