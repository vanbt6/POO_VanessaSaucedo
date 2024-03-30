package edu.vanessa_saucedo.evidencia2.process;

import edu.vanessa_saucedo.evidencia2.data.*;
import edu.vanessa_saucedo.evidencia2.ui.Idiomas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class CalculadoraDeCostos {
    private static final Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static String usuarioCorrecto = "usuario123";
    private static String contrasenaCorrecta = "1234";
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

    public static List<Producto> crearProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Cancion("Canción 1 ", " Pop", false, random.nextInt(10)));
        productos.add(new Cancion("Canción 2 ", " Rock", true, random.nextInt(10)));
        productos.add(new Videojuego("Videojuego 1 ", " Aventura/Adventure", false, random.nextInt(10)));
        productos.add(new Libro("Libro 1 ", " Novela/Novel", true, random.nextInt(10)));
        productos.add(new Libro("Libro 2 ", " Tecnología/Technology", true, random.nextInt(10)));
        productos.add(new Pelicula("Película 1 ", " Drama", false));
        productos.add(new Pelicula("Película 2 ", " Comedia/Comedy", true));
        return productos;
    }

    public static List<Producto> generarConsumoAleatorio(List<Producto> productosDisponibles) {
        List<Producto> consumo = new ArrayList<>();
        int cantidadConsumida = random.nextInt(10) + 1; // Generar una cantidad aleatoria entre 1 y 10
        for (int i = 0; i < cantidadConsumida; i++) {
            Producto productoConsumido = productosDisponibles.get(random.nextInt(productosDisponibles.size()));
            consumo.add(productoConsumido);
        }
        return consumo;
    }

    public static double calcularCostoTotal(List<Producto> consumoUsuario) {
        double costoTotal = 0;
        for (Producto producto : consumoUsuario) {
            costoTotal += producto.calcularCosto();
        }
        return costoTotal;
    }
}
