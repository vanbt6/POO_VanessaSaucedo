package edu.vanessa_saucedo.reto7.process;

/**
 * Clase especial para la multiplicación
 */
public class Multiplicacion extends OperacionAritmetica{

    /**
     * Metodo extendido de la clase suma y operacion aritmetica
     * para calcular la multiplicacion
     */
    @Override
    public double calcular(double num1, double num2) {
        double resultado=0;
        for (int i = 0; i < num2; i++){
            resultado= new Suma().calcular(resultado,num1);
        }
        return resultado;
    }
}
