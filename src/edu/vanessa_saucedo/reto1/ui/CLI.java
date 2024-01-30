package edu.vanessa_saucedo.reto1.ui;

import edu.vanessa_saucedo.reto1.process.CalculadoraMasaCorporal;

import java.util.Scanner;

public class CLI {
    /**
     * Este metodo sirve para mostrar el menú de
     * opciones al usuario de los distintos
     * procedimientos de calculo y en base a su
     * eleción se realiza el metodo seleccionado
     */
    public static void showMenu(){
        System.out.println("Elige alguna de estas opciones:");
        System.out.println("A. Cálculo de masa corporal (índice de masa corporal) ");
        System.out.println("B. Cálculo de masa corporal magra");
        System.out.println("C. Cálculo de metabolismo basal (gasto energético basal)" );
        System.out.println("D. Salir" );
        System.out.print("Ingrese la opción deseada: ");
        /*
         * Mando a llamar al metodo donde se ejcuta
         * la pedida de datos al usuario
         */
        launchCalculadora();



    }
    /**
     * Este metodo sirve para ejecutar la opcion elegida
     * por el usuario y dependiendo el caso, procesar y mostrar
     * los resultados correspondientes
     */
    public static void launchCalculadora(){
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();
        int estatura;
        double peso;
        String sexo;
        switch (opcion){
            case "A":
                System.out.println("Ingresa estatura en cm:");
                estatura = scanner.nextInt();
                System.out.println("Ingresa peso en kg:");
                peso = scanner.nextDouble();
                double imc = CalculadoraMasaCorporal.calcularIndiceMasaCorporal(estatura,peso);
                CalculadoraMasaCorporal.clasificarIndiceMasaCorporal(imc);
                System.out.println(" Su Indice de Masa Corporal es:"+ imc);
                break;
            case "B":
                System.out.println("Ingresa tu sexo: ");
                sexo = scanner.nextLine();
                System.out.println("Ingresa estatura en cm:");
                estatura = scanner.nextInt();
                System.out.println("Ingresa peso en kg:");
                peso = scanner.nextDouble();
                double mcm = CalculadoraMasaCorporal.calcularMasaCorporalMagra(estatura,peso,sexo);
                System.out.println("Su Masa Corporal Magra es:" + mcm + "kg");
                break;
            case "C":
                System.out.println("Ingresa tu sexo: ");
                sexo = scanner.nextLine();
                System.out.println("Ingresa tu edad: ");
                int edad = scanner.nextInt();
                System.out.println("Ingresa estatura en cm:");
                estatura = scanner.nextInt();
                System.out.println("Ingresa peso en kg:");
                peso = scanner.nextDouble();
                double geb = CalculadoraMasaCorporal.calcularMetabolismoBasal(estatura,peso,edad,sexo);
                System.out.println("Su Metabolismo Basal es de: " + geb);
                break;
            case "D":
                System.out.println("Programa terminado");
                break;
        }
    }
}
