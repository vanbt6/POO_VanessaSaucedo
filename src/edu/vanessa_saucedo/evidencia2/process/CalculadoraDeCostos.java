package edu.vanessa_saucedo.evidencia2.process;

import edu.vanessa_saucedo.evidencia2.data.*;
import edu.vanessa_saucedo.evidencia2.ui.Idiomas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

/**
 * Clase para calcular los costos y crear de manera random la lista
 * de productos adquiridos por el usuario
 */
public class CalculadoraDeCostos {
    private static final Scanner scanner = new Scanner(System.in);

    //Para generar la lista de manera random
    private static Random random = new Random();

    private static String usuarioCorrecto = "usuario123";
    private static String contrasenaCorrecta = "1234";

    /**
     * Metodo oara inciar sesion
     * @param idiomas para mostrar el mensaje de incorrecto en el idioma elegido
     */
    public static void iniciarSesion(Idiomas idiomas){
        System.out.println(idiomas.USUARIO);
        String usuario = scanner.nextLine();
        System.out.println(idiomas.CONTRASENA);
        String contrasena= scanner.nextLine();
        if(!(usuario.equals(usuarioCorrecto)&&contrasena.equals(contrasenaCorrecta))){
            System.out.println(idiomas.SESION_INCORRECTA);
            iniciarSesion(idiomas);
        }
    }

    /**
     * Metodo para crear la cantidad de uso de cada uno de los productos, su estreno, su cantidad de
     * reproducción, etc.
     * @return la lista de productos generados
     */
    public static List<Producto> crearProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Cancion("XT4SIS ", " Pop", false, random.nextInt(10)));
        productos.add(new Cancion("Molinos de Viento", " Rock", true, random.nextInt(10)));
        productos.add(new Videojuego("Alice Madness Return ", " Aventura/Adventure", false, random.nextInt(10)));
        productos.add(new Libro("La cancion del Lobo", " Novela/Novel", true, random.nextInt(10)));
        productos.add(new Libro("El futuro de la humanidad", " Tecnología/Technology", true, random.nextInt(10)));
        productos.add(new Pelicula("La sociedad de la nieve", " Drama", false));
        productos.add(new Pelicula("Son como niños 2 ", " Comedia/Comedy", true));
        return productos;
    }

    /**
     * Para generar de manera random la cantidad del consumo
     * @param productosDisponibles lista de productos generados
     * @return el consumo
     */
    public static List<Producto> generarConsumoAleatorio(List<Producto> productosDisponibles) {
        List<Producto> consumo = new ArrayList<>();
        int cantidadConsumida = random.nextInt(10) + 1; // Generar una cantidad aleatoria entre 1 y 10
        for (int i = 0; i < cantidadConsumida; i++) {
            Producto productoConsumido = productosDisponibles.get(random.nextInt(productosDisponibles.size()));
            consumo.add(productoConsumido);
        }
        return consumo;
    }

    /**
     * Metodo para generar el costo en base al consumo aleatorio
     * @param consumoUsuario lista de consumo aleatorio
     * @return costo total de todos los productos
     */
    public static double calcularCostoTotal(List<Producto> consumoUsuario) {
        double costoTotal = 0;
        for (Producto producto : consumoUsuario) {
            costoTotal += producto.calcularCosto();
        }
        return costoTotal;
    }
}
