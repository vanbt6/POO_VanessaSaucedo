package edu.vanessa_saucedo.reto9.process;

import edu.vanessa_saucedo.reto9.ui.Idiomas;

import java.util.*;

/**
 * Esta clase es para Administrar las palabras de los libros, cuenta con los metodos de
 * setLibrosDisponibles, contarPalabras y ordenarFrecuencia
 */
public class AdministradorDePalabras {
    private static final Map<String, String> librosDisponibles = new HashMap<>();

    /**
     * Metodo para guardar los libros disponibles a buscar sus palabras mas repetidas y
     * mandar a llamar todos los demas metodos de conteo y separacion de palabras
     * @param libroSeleccionado tipo String
     */
    public static void setLibrosDisponibles(String libroSeleccionado){
        //Se agregan los archivos a la lista
        librosDisponibles.put("1", "src/edu/vanessa_saucedo/reto9/resources/RicitosDeOro.txt");
        librosDisponibles.put("2", "src/edu/vanessa_saucedo/reto9/resources/Cenicienta.txt");
        librosDisponibles.put("3", "src/edu/vanessa_saucedo/reto9/resources/Blancanieves.txt");
        librosDisponibles.put("4", "src/edu/vanessa_saucedo/reto9/resources/LosTresCerditos.txt");
        librosDisponibles.put("5", "src/edu/vanessa_saucedo/reto9/resources/Rapunzel.txt");

        String filePath = librosDisponibles.get(libroSeleccionado);
        List<String> palabras = LimpiadorDePalabras.obtenerPalabras(filePath) ;
        Map<String, Integer> frecuenciaPalabras = contarPalabras(palabras);
        List<Map.Entry<String, Integer>> listaOrdenada = ordenarFrecuencia(frecuenciaPalabras);
        imprimirPalabras(listaOrdenada);
        FiltreoDePalabras.contarVocales(palabras);
        System.out.println(Idiomas.PALABRAS_VOCAL);
        FiltreoDePalabras.imprimirPalabrasVocales(palabras);
        System.out.println(Idiomas.PALABRAS_IMPAR);
        FiltreoDePalabras.imprimirPalabrasImpares(palabras);
        System.out.println(Idiomas.PALABRA_LARGA );
        FiltreoDePalabras.palabraMasLarga(palabras);
        System.out.println(Idiomas.PALABRA_CORTA);
        FiltreoDePalabras.palabraMasCorta(palabras);
        FiltreoDePalabras.criterioVocales(palabras);

    }

    /**
     * Metodo para mostrar las palabras mas repetidas en la consola
     * @param listaOrdenada List Map, lista ya ordenada de las palbras mas repetidas
     */
    public static void imprimirPalabras(List<Map.Entry<String, Integer>> listaOrdenada){
        int contador = 0;
        for (Map.Entry<String, Integer> entrada : listaOrdenada) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " "+ Idiomas.VECES);
            contador++;
            if (contador == 10) break;
        }

    }

    /**
     * Este metodo sirve para ver con que tanta frecuencia aparecen en la lista de palabras,
     * cada una de las palabras
     * @param palabras lista de todas las palabras del libro
     * @return el total de frecuiencia con la que aparecen
     */
    public static Map<String, Integer> contarPalabras(List<String> palabras){
        Map<String, Integer> frecuencia = new HashMap<>();
        for(String palabra : palabras){
            /**Es para que al ir palabra por palabra va aumentando su aparicion en la lista de palabras
             * ".getOrDefault" = se utiliza para obtener el valor asociado con palabra en frecuencia, si
             * ya existe ahi se le aumenta 1
             */
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }
        return frecuencia;
    }

    /**
     * Metodo para ordenar las palabras, su cantidad de veces repetidas de mayor a menor
     * @param frecuencia Map tipo String y con valores tipo Integer
     * @return la lista de palabras ordenada de mayor a menor
     */
    public static List<Map.Entry<String, Integer>> ordenarFrecuencia(Map<String, Integer> frecuencia){
        //entrySet es para devolver un clave-valor de la lista
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(frecuencia.entrySet());
        //Metodo para comparar los valores de los elementos de la lista y ordenarlos de manera descendente
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        return listaOrdenada;
    }


}
