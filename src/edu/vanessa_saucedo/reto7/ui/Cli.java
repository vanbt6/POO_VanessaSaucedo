package edu.vanessa_saucedo.reto7.ui;
import edu.vanessa_saucedo.reto7.process.*;

import java.util.Scanner;

public class Cli {
    private static final Scanner scanner = new Scanner(System.in);
    private static double num1;
    private static double num2;
    private static Idiomas idiomas = new Espanol();

    public static void showMenu(){
        System.out.println("Escoga un idioma (Choose a language:): ");
        System.out.println("A. Español (Spanish)");
        System.out.println("B. Ingles (English)");
        String idioma = scanner.nextLine();

        switch (idioma){
            case "A":
                idiomas = new Espanol();
                break;
            case "B":
                idiomas = new Ingles();

                break;
        }
        System.out.println(idiomas.MENU);
    }

    public static void launchCalculadora(){
        showMenu();
        int opcion = scanner.nextInt();
        OperacionAritmetica operacion = null;
        switch (opcion){
            case 1:
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                num1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
                num2 = scanner.nextDouble();
                operacion = new Suma();
                break;
            case 2:
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                num1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
                num2 = scanner.nextDouble();
                operacion = new Resta();
                break;
            case 3:
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                num1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
                num2 = scanner.nextDouble();
                operacion = new Multiplicacion();
                break;
            case 4:
                System.out.println(idiomas.INGRESAR_DIVIDIENDO);
                num1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_DIVISOR);
                num2 = scanner.nextDouble();
                operacion = new Division();
                break;
            case 5:
                System.out.println(idiomas.INGRESAR_DIVIDIENDO);
                num1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_DIVISOR);
                num2 = scanner.nextDouble();
                operacion = new Modulo();
                break;
            case 6:
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                num1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_POTENCIA);
                num2 = scanner.nextDouble();
                operacion = new Potencia();
                break;
            case 7:
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                num1 = scanner.nextDouble();

                System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
                num2 = scanner.nextDouble();
                operacion = new Logaritmo();
                break;
        }
        if (operacion != null) {
            printResult(operacion,num1,num2);
            System.out.println(idiomas.FINAL);
        } else {
            System.out.println(idiomas.OPCION_INVALIDA);

        }
    }

    public static void printResult(OperacionAritmetica operacion, double num1, double num2 ){
        System.out.println(idiomas.RESULTADO_UNO + operacion.getClass().getSimpleName() + idiomas.RESULTADO_DOS
                + operacion.calcular(num1,num2));
    }
}
