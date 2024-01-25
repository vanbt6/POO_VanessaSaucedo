package edu.vanessa_saucedo.reto1.process;

import java.util.Scanner;

/**
 * Esta clase sirve para realizar calculos de masa corporal,
 * inlcuye los metodos de:
 * indice de masa corporal
 * masa corporal magra
 * metabolismo basal
 */
public class CalculadoraMasaCorporal {
    /**
     *Este metodo sirve para calcular el Indice de masa
     *corporal en base a su peso y estatura
     * @param estatura estatura en cm
     * @param peso peso en kg
     * @return indice de masa corporal
     */
    public static double calcularIndiceMasaCorporal(double estatura, double peso){

        //Esta variable convierte la estatura de cm a metros
        double estaturaMetros=estatura/100;
        return peso/Math.pow(estaturaMetros,2);
    }

    /**
     * Aqui muestra el tipo de indice de masa corporal
     * dependiendo el resultado de la operación
     * @param imc indice de masa corporal
     */
    public static double clasificarIndiceMasaCorporal(double imc){
        if (imc<=18.9){
            System.out.println("Peso bajo " );
        }else if(imc<=24.99){
            System.out.println("Peso normal " );
        }else if(imc<=29.99){
            System.out.println("Sobrepeso " );
        }else if(imc<=34.99 ){
            System.out.println("obesidad leve ");
        }else if(imc<=39.99 ){
            System.out.println("obesidad media ");
        }else if(imc>=40.00 ){
            System.out.println("obesidad mórbida ");
        }
        return imc;
    }


    /**
     * Este metodo sirve para calcular la masa corporal
     * magra en base a su peso, estatura y sexo
     * @param estatura estatura en cm
     * @param peso peso en kg
     * @param sexo para determinar el tipo de operacion
     * a realizar
     * @return masa corporal magra
     */
    public static double calcularMasaCorporalMagra(double estatura, double peso, String sexo){
        /*
         * mcm (masa corporal magra) declarado como 0.0
         * para despues darle el nuevo valor del resultado
         * dependiendo el sexo ingresado
         */
        double mcm = 0.0;
        if (sexo.equals("mujer")){
            mcm= (1.07 * peso)-148*((Math.pow(peso,2))/(Math.pow(estatura,2)));
        }else if (sexo.equals("hombre")){
            mcm= (1.10 * peso)-128*((Math.pow(peso,2))/(Math.pow(estatura,2)));
        }
        return mcm;
    }

    /**
     * Este metodo sirve para calcular el metabolismo basal
     * en base a su peso, estatura, sexo y edad
     * @param estatura estatura en cm
     * @param peso peso en kg
     * @param sexo para determinar la operación
     * a realizar
     * @param edad necesario para el calculo
     * @return metabolismo basal
     */
    public static double calcularMetabolismoBasal(double estatura, double peso, double edad, String sexo){
        /*
         * geb (metabolismo basal) declarado como 0.0
         * para despues darle el nuevo valor del resultado
         * dependiendo el sexo ingresado
         */
        double geb = 0.0;
        if (sexo.equals("mujer")){
            geb = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
        }else if(sexo.equals("hombre")){
            geb= 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
        }
        return geb;
    }
}
