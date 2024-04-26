package edu.vanessa_saucedo.reto9.test;
import edu.vanessa_saucedo.reto9.process.FiltreoDePalabras;
import edu.vanessa_saucedo.reto9.process.LimpiadorDePalabras;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ContarVocalesTest {

    /**
     * Test de contar vocales de una lista vacia, resultado esperado = 0
     */
    @Test
    public void contarVocalesListaVaciaTest(){
        List<String> palabras = Collections.emptyList();
        assertEquals(0, FiltreoDePalabras.contarVocales(palabras));
    }

    /**
     * Test para ver si cuenta bien todas las vocales aunque se repitan,
     * resultado esperado = 7 veces la a
     */
    @Test
    public void contarVocalesUnaVocalTest(){
        List<String> palabras = Arrays.asList("Navaja" ,"casa", "cama");
        assertEquals(7,FiltreoDePalabras.contarVocales(palabras));
    }

    /**
     * Test para solo palabras con consonantes (onomatopeyas),
     * resultado esperado = 0
     */
    @Test
    public void contarVocalesConsonantesTest(){
        String filePath = "src/edu/vanessa_saucedo/reto9/resources/Onomatopeyas.txt";
        List<String> palabras = LimpiadorDePalabras.obtenerPalabras(filePath);
        assertEquals(0,FiltreoDePalabras.contarVocales(palabras));
    }

    /**
     * Test de vocales con acentos a ver si son aceptadas,
     * resultado esperado = 12
     */
    @Test
    public void contarVocalesAcentosTest(){
        List<String> palabras = Arrays.asList("Mamá", "Papá", "árbol", "avión", "envió");
        assertEquals(12, FiltreoDePalabras.contarVocales(palabras));
    }

    /**
     * Test de lista con palabras nulas, resulado esperado = 9
     */
    @Test
    public void contarVocalesNullTest(){
        List<String> palabras = Arrays.asList("perro", null, "pollo", "murcielago", null);
        assertEquals(9,FiltreoDePalabras.contarVocales(palabras));

    }

}
