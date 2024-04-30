package edu.vanessa_saucedo.reto9.test;
import edu.vanessa_saucedo.reto9.process.FiltreoDePalabras;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FiltreoDePalabrasTest {

    /**
     * Test para rectificar que funciona el metodo de saber
     * la palabra mas larga, resultado esperado: test pasable y exitoso
     */
    @Test
    public void palabraMasLargaTest(){
        // Lista de palabras para el caso de prueba
        List<String> palabras = Arrays.asList("parangaricutirmicuaro", "hola", "mundo", "manzanillo");
        // Captura la salida llamando al método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        FiltreoDePalabras.palabraMasLarga(palabras);

        // Verifica si la salida contiene la palabra más larga esperada
        assertTrue(outContent.toString().contains("parangaricutirmicuaro"));
    }

    /**
     * Test para rectificar que funciona el metodo de saber
     * la palabra mas corta, resultado esperado: test pasable y exitoso
     */
    @Test
    public void palabraMasCortaTest(){
        // Lista de palabras para el caso de prueba
        List<String> palabras = Arrays.asList("parangaricutirmicuaro", "hola", "mundo", "manzanillo");
        // Captura la salida llamando al método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        FiltreoDePalabras.palabraMasCorta(palabras);

        // Verifica si la salida contiene la palabra más corta esperada
        assertTrue(outContent.toString().contains("hola"));
    }

    /**
     * Test para rectificar que funciona el metodo del criterio de la
     * palabra que comienza con vocal, termina con una vocal y tiene por lo menos 5
     * letras; resultado esperado: test pasable y exitoso
     */
    @Test
    public void criterioVocalesTest(){
        // Lista de palabras para el caso de prueba
        List<String> palabras = Arrays.asList("osito", "naranja", "azul", "ojo", "casita");

        // Captura la salida real llamando al método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        FiltreoDePalabras.criterioVocales(palabras);

        // Verifica si la salida coincide con la esperada
        assertTrue(outContent.toString().contains("osito"));
    }
}
