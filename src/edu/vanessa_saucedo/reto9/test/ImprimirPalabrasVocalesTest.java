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

public class ImprimirPalabrasVocalesTest {

    /**
     * Test de solo palabras que comienzan con consonantes
     * resultado esperado = una excepcion ya que el archivo no contiene
     * palabras que empiecen con vocal
     */
    @Test
    public void imprimirPalabrasSinVocales(){
        try {
            //llamamos al archivo que vamos a usar y usamos el metodo de limpieza para leerlo y limpiarlo
            String filePath = "src/edu/vanessa_saucedo/reto9/resources/PalabrasConsonates.txt";
            List<String> palabras = LimpiadorDePalabras.obtenerPalabras(filePath);
            //Son para redirigir la salida estandar, lo que usualmente se imprime en consola
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            // Redirige la salida estándar a outputStream
            System.setOut(printStream);
            // Llama al método que imprime las palabras vocales
            FiltreoDePalabras.imprimirPalabrasVocales(palabras);
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
     * Test de impresion de palabras que empiecen con vocal pero
     * la lista de palabras esta vacia, resultado esperado = vacio
     */
    @Test
    public void imprimirPalabrasVocalesVaciasTest(){
        try {
            List<String> palabras = Collections.emptyList();
            //Son para redirigir la salida estandar, lo que usualmente se imprime en consola
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            // Redirige la salida estándar a outputStream
            System.setOut(printStream);
            // Llama al método que imprime las palabras vocales
            FiltreoDePalabras.imprimirPalabrasVocales(palabras);
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
     * Test para que si muestre las palabras que comienzan con vocal sin
     * importar si son mayusculas o minusculas, resultado esperado:
     * que pase ya que sin importar si son mayusculas o minusculas debe funcionar
     */
    @Test
    public void imprimirVocalesMayusMinusTest(){
        try {
            List<String> palabras = Arrays.asList("Arbol","avion","estacionamineto","Iker","Oso");
            //Son para redirigir la salida estandar, lo que usualmente se imprime en consola
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            //Redirige la salida estándar a outputStream
            System.setOut(printStream);
            // Llama al método que imprime las palabras vocales
            FiltreoDePalabras.imprimirPalabrasVocales(palabras);
            // Captura la salida
            String actualOutput = outputStream.toString();
            // Restablece la salida estándar
            System.setOut(System.out);

            // Divide la salida en líneas
            String[] lines = actualOutput.split(System.getProperty("line.separator"));
            // Verifica que cada palabra esté presente en alguna línea
            for (String palabra : palabras) {
                boolean found = false;
                for (String line : lines) {
                    if (line.contains(palabra)) {
                        found = true;
                        break;
                    }
                }
                //es para verificar si el test pasa exitosamente o no
                assertTrue(found);
            }
        } catch (Exception e) {
            // Maneja cualquier excepción que pueda ocurrir
            e.printStackTrace();
        }
    }

    /**
     * Test para que imprima palabras que empiezan con vocal pero en
     * caso de una repetida, se elimine en automatico. Resultado esperado:
     * funcional y compilable
     */
    @Test
    public void imprimirVocalesSinRepetirTest(){
        //Son para redirigir la salida estandar, lo que usualmente se imprime en consola
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        List<String> palabras = Arrays.asList("arbol", "oso", "espejo", "arbol", "oso", "uva");
        // Llamar al método que queremos probar
        FiltreoDePalabras.imprimirPalabrasVocales(palabras);
        // Obtener la salida del método
        String salidaActual = outputStream.toString();
        // es para separar todas las palabras en lienas y remplazar los \n a espacios o saltos de linea
        //ya que generaba problemas al comparar
        String salidaEsperada = "arbol\nespejo\noso\nuva\n".replaceAll("\r", "").toLowerCase();
        salidaActual = salidaActual.replaceAll("\r", "").toLowerCase();

        // Verificar que las palabras comienzan con una vocal y están ordenadas alfabéticamente
        assertEquals(salidaEsperada, salidaActual);

        // Restaurar la salida estándar
        System.setOut(System.out);
    }

    /**
     * Test para rectificar que el metodo cumpla su funcion y si muestre
     * las palabras que comienzan con vocal y de manera ordenada, resultado esperado:
     * funcional y compilable
     */
    @Test
    public void imprimirPalabrasVocalesTest(){
        //Son para redirigir la salida estandar, lo que usualmente se imprime en consola
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        //creamos la lista de palabras
        List<String> palabras = Arrays.asList("Arbol", "escuela", "oso", "uva","Angela");
        //llamamos al metodo
        FiltreoDePalabras.imprimirPalabrasVocales(palabras);

        // Obtener la salida del método
        String salidaActual = outputStream.toString();
        // es para separar todas las palabras en lineas y remplazar los \n a espacios o saltos de linea
        //ya que generaba problemas al comparar
        String salidaEsperada = "Angela\nArbol\nescuela\noso\nuva\n".replaceAll("\r", "").toLowerCase();
        salidaActual = salidaActual.replaceAll("\r", "").toLowerCase();

        // Verificar que las palabras comienzan con una vocal y están ordenadas alfabéticamente
        assertEquals( salidaEsperada, salidaActual);

        // Restaurar la salida estándar
        System.setOut(System.out);
    }
}
