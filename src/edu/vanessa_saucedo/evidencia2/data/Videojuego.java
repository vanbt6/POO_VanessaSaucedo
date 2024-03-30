package edu.vanessa_saucedo.evidencia2.data;

public class Videojuego extends Producto{

    private double costoPorDia;

    public Videojuego(String nombre, String genero, boolean estreno, double costoPorDia) {
        super(nombre, 0, genero, estreno);
        this.costoPorDia = costoPorDia;
    }

    @Override
    public double calcularCosto() {
        return getPrecioBase() + (10 * costoPorDia);
    }

    @Override
    public String toString() {
        return "Videojuego/Videogame: " + ","+ this.getGenero();
    }
}
