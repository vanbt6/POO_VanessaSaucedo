package edu.vanessa_saucedo.reto4.ui;

import edu.vanessa_saucedo.reto4.process.ProcesadorVentas;

import java.util.Scanner;

public class Cli {
    public static void showMenu(){
        System.out.println("----Elige una opción----");
        System.out.println("1. Realizar venta de boleto ");
        System.out.println("2. Mostrar datos de la lista de ventas ");
        System.out.println("3. Finalizar programa ");

    }

    public static void launchApp(){
        int opcion;
        Scanner scanner = new Scanner(System.in);
        showMenu();
        do {
            System.out.print("\nIngrese la opción deseada: ");
            opcion = scanner.nextInt();
            switch (opcion){
            case 1:
                ProcesadorVentas.realizarVenta();
                break;
            case 2:
                ProcesadorVentas.mostrarListaVentas();
                break;
            case 3:
                System.out.println("---Programa terminado---\n---Buen día :)---");
                break;
            }
        }while (opcion != 3);
    }
}
