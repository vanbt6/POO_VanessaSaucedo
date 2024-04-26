package edu.vanessa_saucedo.reto9.test;

import edu.vanessa_saucedo.reto9.process.FiltreoDePalabras;
import edu.vanessa_saucedo.reto9.process.LimpiadorDePalabras;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ImprimirPalabrasImparesTest {

    /**
     * Test para rectificar que el metodo funcione bien y sea compilable, solo muestre
     * las palabras con cantidad de letras impares, resultado esperado: test pasable
     */
    @Test
    public void imprimirPalabrasImparesTest(){
        //llamamos al archivo que vamos a usar y usamos el metodo de limpieza para leerlo y limpiarlo
        String filePath = "src/edu/vanessa_saucedo/reto9/resources/PalabrasImpares.txt";
        List<String> palabras = LimpiadorDePalabras.obtenerPalabras(filePath);

        // Crea un nuevo sistema de salida para capturar la salida de la impresión
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Llama al método imprimirPalabrasImpares con las palabras del archivo
        FiltreoDePalabras.imprimirPalabrasImpares(palabras);
        // Obtener la salida del método
        String salidaActual = outputStream.toString();
        // es para separar todas las palabras en lineas y remplazar los \n a espacios o saltos de linea
        String salidaEsperada = "dos\nferrocarril\ncasador\noso\nxochitl\nuno\ncinco\n".replaceAll("\r", "").toLowerCase();
        salidaActual = salidaActual.replaceAll("\r", "").toLowerCase();
        // Verificar que la cantidad de letras de las palabras sean impares
        assertEquals(salidaEsperada, salidaActual);
        System.setOut(System.out);
    }

    /**
     * Test para que al darle una lista vacia no muestre ningun resultado ya que no
     * existe ninguna palabra, resultado esperado: test pasable y compilable
     */
    @Test
    public void imprimirPalabrasImparesVaciaTest(){
        try {
            List<String> palabras = Collections.emptyList();
            //Son para redirigir la salida estandar, lo que usualmente se imprime en consola
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            // Redirige la salida estándar a outputStream
            System.setOut(printStream);
            // Llama al método que imprime las palabras vocales
            FiltreoDePalabras.imprimirPalabrasImpares(palabras);
            // Restablece la salida estándar
            System.setOut(System.out);
            // Verifica que no haya habido salida en la consola
            assertTrue(outputStream.toString().isEmpty());

        } catch (Exception e) {
            // Maneja cualquier excepción que pueda ocurrir
            e.printStackTrace();
        }
    }

    /**
     * Test para verificar que no imprima palabras con cantidad de letras pares, solo
     * incluye una palabra con letras impares; resultado esperado: test pasable, solo imprime
     * Cinco
     */
    @Test
    public void imprimirPalabrasParesTest(){
        //llamamos al archivo que vamos a usar y usamos el metodo de limpieza para leerlo y limpiarlo
        String filePath = "src/edu/vanessa_saucedo/reto9/resources/PalabrasPares.txt";
        List<String> palabras = LimpiadorDePalabras.obtenerPalabras(filePath);

        // Crea un nuevo sistema de salida para capturar la salida de la impresión
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Llama al método imprimirPalabrasImpares con las palabras del archivo
        FiltreoDePalabras.imprimirPalabrasImpares(palabras);
        //Verificar si la salida si es cinco, ya que es la unica palabra con cant. de letras impares
        assertTrue(outputStream.toString().contains("Cinco"));
    }

    /**
     * Test para verificar que elimine las palabras repetidas, resultado esperado: exitoso test
     * pasable, solo imprime dos, carro y oso
     */
    @Test
    public void imprimirPalabrasImparRepetidasTest(){
        List<String> palabras = Arrays.asList("dos","carro","casa","carro","carro","oso");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // Llama al método imprimirPalabrasImpares con las palabras del archivo
        FiltreoDePalabras.imprimirPalabrasImpares(palabras);
        String salidaActual=outputStream.toString();
        String salidaEsperada = "dos\ncarro\noso\n".replaceAll("\r","").toLowerCase();
        salidaActual = salidaActual.replaceAll("\r","").toLowerCase();
        assertEquals(salidaEsperada, salidaActual);
        System.setOut(System.out);
    }

    /**
     * Test con una lista de palabras nulas, resultado esperado: test pasable
     * pero con excepcion ya que la lista esta null
     */
    @Test
    public void imprimirPalabrasImparNulaTest(){
        try {
            List<String> palabras = null;

            // Llama al método que deseas probar
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));
            FiltreoDePalabras.imprimirPalabrasImpares(palabras);
            String salidaActual=outputStream.toString();

            // Comprueba que la salida sea la esperada
            assertEquals(salidaActual, outputStream.toString());
        } catch (Exception e) {
        // Maneja cualquier excepción que pueda ocurrir
        e.printStackTrace();
        }

    }
}
