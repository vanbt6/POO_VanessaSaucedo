package edu.vanessa_saucedo.reto9.process;

import edu.vanessa_saucedo.reto9.ui.Idiomas;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class FiltreoDePalabras {

    /**
     * Metodo que toma una lista de palabras, las convierte en un flujo de caracteres Unicode
     * filtra solo las vocales y luego cuenta el número total de vocales presentes en todas las palabras.
     *
     * @param palabras lista de palabras ya limpia, sin caracteres especiales
     * @return
     */
    public static long contarVocales(List<String> palabras){
        palabras = palabras.stream().filter(Objects::nonNull).collect(Collectors.toList());
        //convierte la lista en un flujo de elementos stream
        long totalVocales = palabras.stream()
                //Se hace un mapeo de cada palabra a un steam de enteros que representa los valores
                .flatMapToInt(CharSequence::chars)
                //Cada valor entero se corresponde a su respectivo caracter Unicode
                //La lambda hace que cada valor entero se convierta en un caracter
                .mapToObj(c -> (char) c)
                //Filtro para mantener solo las vocales; "indexOf" devuelve la posición del caracter
                .filter(c -> "aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(c) != -1)
                .count();
        System.out.println(Idiomas.TOTAL_VOCALES + totalVocales);
        return totalVocales;
    }

    /**
     * Metodo para imprimir palabras que comienzan con Vocal
     * @param palabras lista de palabras limpia (sin caracteres especiales)
     */
    public static void imprimirPalabrasVocales(List<String> palabras){
        palabras.stream()
                //filtra las palabras en las que la primera letra sea una vocal
                .filter(p -> p.length() > 0 && "aeiouAEIOU".indexOf(p.charAt(0)) != -1)
                .sorted(String::compareToIgnoreCase)
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * Metodo para poder imprimir las palabras con total de letras impares
     * @param palabras lista de palabras limpia (sin caracteres especiales)
     */
    public static void imprimirPalabrasImpares (List<String> palabras){
        palabras.stream()
                //filtra las palabras que solo tienen un número impar de letras
                .filter(p -> p.length() % 2 != 0 )
                //elimina las palabras repetidas
                .distinct()
                .forEach(System.out::println);

    }

    /**
     * Metodo para mostrar la palabra mas larga
     * @param palabras lista de palabras limpia (sin caracteres especiales)
     */
    public static void palabraMasLarga(List<String> palabras){
        Optional<String> palabraMasLarga = palabras.stream()
                //para encontrar el maximo de longitud de alguna palabra
                .max(Comparator.comparingInt(String::length));
        palabraMasLarga.ifPresent(System.out::println);
    }

    /**
     * Metodo para mostrar la palabra mas corta
     * @param palabras lista de palabras limpia (sin caracteres especiales)
     */
    public static void palabraMasCorta(List<String> palabras){
        Optional<String> palabraMasCorta = palabras.stream()
                //para encontrar el minimo de longitud de una palabra
                .min(Comparator.comparingInt(String::length));
        palabraMasCorta.ifPresent(System.out::println);
    }

    /**
     * Metodo para buscar si hay alguna palabra que cumpla con el criterio de
     * comenzar con vocal y terminar con una, que contenga por lo menos 5 letras
     * @param palabras lista de palabras limpia (sin caracteres especiales)
     */
    public static void criterioVocales(List<String> palabras){
        Optional<String> criterioVocal = palabras.stream()
                // Encuentra si el criterio se cumple: comienza y termina con vocal y tiene al menos 5 letras
                .filter(p -> p.matches("^[aeiouAEIOU].*[aeiouAEIOU]$") && p.length() >= 5)
                // Encuentra la primera palabra que cumple con el criterio
                .findFirst();
        // Verifica si se encontró una palabra que cumple con el criterio y la imprime
        if (criterioVocal.isPresent()) {
            System.out.println(Idiomas.CRITERIO_VOCALES + criterioVocal.get());
        } else {
            System.out.println(Idiomas.CRITERIO_ERROR);
        }

    }


}
