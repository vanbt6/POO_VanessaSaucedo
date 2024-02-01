package edu.vanessa_saucedo.reto2.promedios.ui;

import edu.vanessa_saucedo.reto2.promedios.process.CalculadorPromedio;

import java.util.Scanner;
public class CLI {
    /**
     * Este metodo es para pedir la cantidad de
     * calificaciones a ingresar y mostrar el resultado
     */
    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de calificaciones a ingresar: ");
        int cantidadCalificaciones = scanner.nextInt();

        // declarar un arreglo para almacenar las calificaciones
        double[] calificaciones = new double[cantidadCalificaciones];

        // bucle de ingreso de calificaciones según la cantidad elegida
        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.println("Por favor ingrese la calificación num: " + (i + 1));
            calificaciones[i] = scanner.nextDouble();
        }

        double promedio = CalculadorPromedio.calcularPromedio(calificaciones);

        System.out.println("El promedio final es: " + promedio);
    }


}
