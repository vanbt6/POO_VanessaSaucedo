package edu.vanessa_saucedo.reto9.process;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        List<String> palabras = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNext()) {
                //Sirve para eliminar/ignorar los caracteres especiales y espacios e incluir acentos
                String palabra = scanner.next().toLowerCase().replaceAll("[^a-zA-ZñÑ´¨]", "");
                palabras.add(palabra);
            }
            scanner.close();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return palabras;
    }
}
