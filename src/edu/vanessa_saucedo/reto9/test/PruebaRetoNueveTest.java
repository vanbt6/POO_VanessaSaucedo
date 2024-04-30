package edu.vanessa_saucedo.reto9.test;

import edu.vanessa_saucedo.reto9.process.AdministradorDePalabras;
import edu.vanessa_saucedo.reto9.process.LimpiadorDePalabras;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PruebaRetoNueveTest {

    /**
     * Test para verificar el caso de que el libro estuviera vacio, resultado esperado:
     * test pasable pero ningun resultado esperado ya que bien se sabe que es un libro vacio,
     * por lo cual la lista del metodo estara vacia.
     *
     */
    @Test
    public void obtenerPalabrasLibroVacioTest(){
        //Recopilacion de datos, archivo vacio
        String filePath = "src/edu/vanessa_saucedo/reto9/resources/LibroVacio.txt";
        //ejecucion del codigo, llamando al metodo
        List<String> palabras = LimpiadorDePalabras.obtenerPalabras(filePath);
        //Evaluacion de resultados, comparacion
        assertTrue("La lista de palabras debería estar vacía para un libro vacío", palabras.isEmpty());
    }

    /**
     * Test para verificar que el filtro de limpieza de palabras funcione, resultado
     * esperado: 6 palabras, pero con los signos especiales eliminados
     */
    @Test
    public void obtenerPalabrasFiltroTest(){
        //Recopilacion de datos, archivo con palabras y signos especiales
        String filePath = "src/edu/vanessa_saucedo/reto9/resources/PalabrasConSignos.txt";
        //ejecucion del codigo, llamando al metodo
        List<String> palabras = LimpiadorDePalabras.obtenerPalabras(filePath);
        //evaluacion de resultados
        assertEquals("La lista de palabras debería contener 6 palabras después de eliminar caracteres especiales", 6, palabras.size());
        assertEquals("La primera palabra debería ser: 'Hla' ", palabras.get(0), "Hla");
        assertEquals("La segunda palabra debería ser: 'perro' ", palabras.get(1), "perro");
        assertEquals("La tercera palabra debería ser: 'gto' ", palabras.get(2), "gto");
        assertEquals("La cuarta palabra debería ser: 'casa' ", palabras.get(3), "casa");
        assertEquals("La quinta palabra debería ser: 'pati' ", palabras.get(4), "pati");
        assertEquals("La sexta palabra debería ser: 'migo' ", palabras.get(5), "migo");
    }

    /**
     * Test para verificar el comportamiento del libro si no contiene ninguna palabra que cumpla
     * con los criterios del filtro; resultado esperado: test pasable, lista vacia ya que no hay ninguna palabra
     * despues del filtro
     */
    @Test
    public void obtenerPalabrasSoloSignosTest(){
        //Recopilacion de datos, archivo con solo signos especiales
        String filePath = "src/edu/vanessa_saucedo/reto9/resources/SignosEspaciales.txt";
        //ejecucion del codigo, llamada del metodo
        List<String> palabras = LimpiadorDePalabras.obtenerPalabras(filePath);
        //evaluacion de resultado, debe estar vacia ya que no hay ninguna palabra
        assertTrue("La lista de palabras debe estar vacia",palabras.isEmpty());
    }

    /**
     * Test para verificar si el conteo de palabras es funcional y correcto;
     * resultado esperado: funcional, test pasando con exito, se esperan 3 palabras
     */
    @Test
    public void contarPalabrasTest(){
        //Recopilacion de datos, lista de palabras aleatorias para su conteo
        List<String> palabras = Arrays.asList("hola","casa","hola","perro","hola","perro","hola");
        //ejecucion del codigo, llamando al metodo
        Map<String,Integer> frecuencia = AdministradorDePalabras.contarPalabras(palabras);
        //evaluacion de resultados
        assertEquals(3,frecuencia.size());
    }

    /**
     * Test para verificar si el metodo de ordenar la frecuencia de las palabras
     * se acomoda de manera descendente y correcta; resultado esperado: test exitoso
     * y verifica que realmente hay un acomodo segun sus frecuencias
     */
    @Test
    public void ordenarFrecuenciaTest(){
        //Recopilacion de datos, lista de palabra y su frecuencia
        Map<String,Integer> frecuencia = new HashMap<>();
        frecuencia.put("hola", 4);
        frecuencia.put("casa",1);
        frecuencia.put("perro",2);
        frecuencia.put("oso",6);
        //ejecucion del codigo, se llama al metodo
        List<Map.Entry<String, Integer>> listaOrdenada = AdministradorDePalabras.ordenarFrecuencia(frecuencia);
        //evaluacion de resultados
        assertEquals(4,listaOrdenada.size());
        // Verificar el orden de las palabras según sus frecuencias
        assertEquals("oso", listaOrdenada.get(0).getKey());
        assertEquals(6, (int) listaOrdenada.get(0).getValue());
        assertEquals("hola", listaOrdenada.get(1).getKey());
        assertEquals(4, (int) listaOrdenada.get(1).getValue());
        assertEquals("perro", listaOrdenada.get(2).getKey());
        assertEquals(2, (int) listaOrdenada.get(2).getValue());
        assertEquals("casa", listaOrdenada.get(3).getKey());
        assertEquals(1, (int) listaOrdenada.get(3).getValue());
    }


}
