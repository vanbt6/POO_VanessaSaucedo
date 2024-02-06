package edu.vanessa_saucedo.reto2.promedios.process;

import java.util.Scanner;

/**
 * Esta clase sirve para realizar el calculo del promedio
 * del alumno; incluye el metodo de calcularPromedio
 */
public class CalculadorPromedio {

    /**
     * metodo para calcular el promedio del alumno
     * segun la cantidad de calificaciones deseadas
     * @param calificaciones arreglo
     * @return promedio
     */
    public static double calcularPromedio(double[] calificaciones){
        //variable suma declarada en 0
        double suma = 0;
        //va leyendo cada elemento en el arreglo de calificaciones
        for (double calificacion : calificaciones){
            //se van sumando las calificaciones ingresadas
            suma += calificacion;
        }
        //divide la suma entre la longitud del arreglo
        return suma/calificaciones.length;

    }

}
