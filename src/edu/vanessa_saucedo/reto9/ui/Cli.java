package edu.vanessa_saucedo.reto9.ui;

import edu.vanessa_saucedo.reto9.process.AdministradorDePalabras;

import java.util.Scanner;

public class Cli {
    private static final Scanner scanner = new Scanner(System.in);
    private static String libroSeleccionado;
    public static void menuIdiomas(){
        System.out.println("Escoga un idioma (Choose a language:): ");
        System.out.println("A. Español (Spanish)");
        System.out.println("B. Ingles (English)");
        String idiomaSeleccionado = scanner.nextLine();
        Idiomas idiomas = Idiomas.getInstance(idiomaSeleccionado);
        System.out.println(idiomas.MENU);
        libroSeleccionado = scanner.nextLine();
        launchContador();
    }

    public static void launchContador(){
        switch (libroSeleccionado){
            case "1":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.RICITOS);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "2":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.CENICIENTA);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "3":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.BLANCANIEVES);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "4":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.TRES_CERDITOS);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "5":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + "Rapunzel");
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            default:
                System.out.println(Idiomas.ERROR);
        }
        AdministradorDePalabras.setLibrosDisponibles(libroSeleccionado);
    }

}
