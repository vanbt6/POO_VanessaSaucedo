package edu.vanessa_saucedo.reto9.process;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Esta clase es para limpiar las plabras del libro, cuenta con el metodo de obtenerPalabras
 */
public class LimpiadorDePalabras {
    /**
     * Este metodo es para leer el contenido del libro e ignorar los caracteres especiales
     * (limpiar el texto)
     * @param filePath tipo String, obteniendo el libro seleccionado por usuario
     * @return la lista de palabras del libro
     */
    public static List<String> obtenerPalabras(String filePath){
        try (Stream<String> lines = Files.lines(Paths.get(filePath))){
            return lines
                    // Divide cada línea en palabras
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    // Elimina caracteres especiales
                    .map(word -> word.replaceAll("[^a-zA-ZñÑáéíóúüÁÉÍÓÚÜ]", ""))
                    // Filtra las palabras vacías
                    .filter(word -> !word.isEmpty())
                    // Recolecta las palabras en una lista
                    .collect(Collectors.toList());
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
