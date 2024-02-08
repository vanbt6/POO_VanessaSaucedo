package edu.vanessa_saucedo.reto3.numero.ui;

import edu.vanessa_saucedo.reto3.numero.process.ConteoNumeros;
import java.util.Scanner;
public class Cli {
    public static void LaunchApp(){
        Scanner scanner = new Scanner(System.in);
        int filas, columnas;
        /**
         * Ciclo para pedir número de columnas y filas hasta que ambos datos
         * sean iguales
         */
        do {
            System.out.println("Ingresa el número de filas: ");
            filas = scanner.nextInt();
            System.out.println("Ingresa el número de columnas: ");
            columnas = scanner.nextInt();
            if (filas != columnas) {
                System.out.println("-----El número de filas y columnas debe ser igual.-----\nInténtelo de nuevo.");
            }
        }while (filas != columnas);
        //Declaracion de arreglo
        int[][] numeros = new int[filas][columnas];
        ConteoNumeros.getNumeros(numeros, filas, columnas);
        System.out.println("------------------------\n");
        System.out.println("Conteo por filas:");
        ConteoNumeros.conteoFilas(numeros);
        System.out.println("\n------------------------");
        System.out.println("Conteo por columnas");
        ConteoNumeros.conteoColumnas(numeros);
        System.out.println("------------------------\n");
        int suma = ConteoNumeros.sumaNumeros(numeros);
        System.out.println("La suma total de todos los valores es: " + suma);



    }

}
