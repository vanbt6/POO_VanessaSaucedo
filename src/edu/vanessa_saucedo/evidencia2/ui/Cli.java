package edu.vanessa_saucedo.evidencia2.ui;

import edu.vanessa_saucedo.evidencia2.data.Producto;
import edu.vanessa_saucedo.evidencia2.process.CalculadoraDeCostos;

import java.util.List;
import java.util.Scanner;

public class Cli {
    private static final Scanner scanner = new Scanner(System.in);
    private static Idiomas idiomas = new Espanol();

    /**
     * Metodo para escoger el idioma del programa e iniciar sesion
     */
    public static void menuIdiomas(){
        System.out.println("Favor de escoger un idioma (please choose a language):");
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
            default:
                System.out.println("Opción no válida, se utilizará el idioma por defecto.");
        }
        CalculadoraDeCostos.iniciarSesion(idiomas);
    }

    /**
     * Metodo para mostrar solo el reporte de consumo del usuario
     * @param consumoUsuario lista de sus consumos total
     */
    public static void launchReporte(List<Producto> consumoUsuario){
        menuIdiomas();
        System.out.println(idiomas.BIENVENIDA);
        System.out.println(idiomas.LISTA_CONSUMO);
        for (Producto producto : consumoUsuario) {
            System.out.println(producto);
        }
        double costo = CalculadoraDeCostos.calcularCostoTotal(consumoUsuario);
        System.out.println(idiomas.REPORTE + "$" + costo);


    }
}
