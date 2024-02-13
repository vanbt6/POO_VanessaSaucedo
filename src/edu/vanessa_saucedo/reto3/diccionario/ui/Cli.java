package edu.vanessa_saucedo.reto3.diccionario.ui;

import edu.vanessa_saucedo.reto3.diccionario.process.DiccionarioPalabras;

import java.util.Scanner;
public class Cli {
    static int opcion;
    static Scanner scanner = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("--------Menú----------");
        System.out.println("1. Enlistar palabras del diccionario ");
        System.out.println("2. Buscar significado de palabra en el diccionario ");
        System.out.println("3. Detalle del diccionario " );
        System.out.println("4. Salir de programa" );

        System.out.print("Ingrese la opción deseada: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

    }

    public static void launchDiccionario(DiccionarioPalabras diccionarioPalabras){
        showMenu();
        switch (opcion){
            case 1:
                System.out.println("Palbras del diccionario:");
                diccionarioPalabras.enlistarPalabras();
                showMenu();
                break;
            case 2:
                diccionarioPalabras.enlistarPalabras();
                System.out.println("Ingrese la palabra a buscar significado: ");
                String palabra = scanner.next();
                diccionarioPalabras.buscarPalabras(palabra);
                showMenu();
                break;
            case 3:
                System.out.println("Lista de palabras con cantidad de caracteres:");
                diccionarioPalabras.detallesPalabras();
                showMenu();
                break;
            case 4:
                System.out.println("----Gracias, hasta luego---- \n ----Programa terminado.----");
                break;
            default:
                System.out.println("Opcion no valida");
                showMenu();

        }
    }

}
