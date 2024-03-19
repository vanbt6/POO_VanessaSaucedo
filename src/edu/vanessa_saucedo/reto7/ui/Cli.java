package edu.vanessa_saucedo.reto7.ui;
import edu.vanessa_saucedo.reto7.process.*;

import java.util.Scanner;

public class Cli {
    private static final Scanner scanner = new Scanner(System.in);
    private static double num1;
    private static double num2;

    public static void showMenu(){
        System.out.println("---Calculadora---");

        System.out.println("Elige una opción: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Modulo");
        System.out.println("6. Potencia");
        System.out.println("7. Logaritmo");
        System.out.println("Ingrese el numero de la opción deseada: ");

    }

    public static void launchCalculadora(){
        showMenu();
        int opcion = scanner.nextInt();
        OperacionAritmetica operacion = null;
        switch (opcion){
            case 1:
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();
                operacion = new Suma();
                break;
            case 2:
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();
                operacion = new Resta();
                break;
            case 3:
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();
                operacion = new Multiplicacion();
                break;
            case 4:
                System.out.println("Ingrese el dividendo:");
                num1 = scanner.nextDouble();

                System.out.println("Ingrese el divisor:");
                num2 = scanner.nextDouble();
                operacion = new Division();
                break;
            case 5:
                System.out.println("Ingrese el dividendo:");
                num1 = scanner.nextDouble();

                System.out.println("Ingrese el divisor:");
                num2 = scanner.nextDouble();
                operacion = new Modulo();
                break;
            case 6:
                System.out.println("Ingrese el número:");
                num1 = scanner.nextDouble();

                System.out.println("Ingrese a que potencia lo desea elevar:");
                num2 = scanner.nextDouble();
                operacion = new Potencia();
                break;
            case 7:
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();
                operacion = new Logaritmo();
                break;
            default:
                System.out.println("Opcion no valida, intenta de nuevo");
        }
        if (operacion != null) {
            System.out.println("El resultado es: " + operacion.calcular(num1, num2));
            System.out.println("\nPrograma Terminado :)");
        } else {
            System.out.println("Opción no válida, intenta de nuevo");
        }
    }
}
