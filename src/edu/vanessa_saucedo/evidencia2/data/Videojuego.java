package edu.vanessa_saucedo.evidencia2.data;

public class Videojuego extends Producto {

    private double costoPorDia;

    /**
     * Constructor para obtener todas los atributos del producto
     *
     * @param nombre      del videojuego
     * @param genero      del videojuego
     * @param estreno     si es estreno o no
     * @param costoPorDia del uso del videojuego
     */
    public Videojuego(String nombre, String genero, boolean estreno, double costoPorDia) {
        super(nombre, 0, genero, estreno);
        this.costoPorDia = costoPorDia;
    }

    /**
     * Metodo para obtener el costo total
     * @return el precio base + costo por dia
     */
    @Override
    public double calcularCosto() {
        return getPrecioBase() + (10 * costoPorDia);
    }

    @Override
    public String toString() {
        return "Videojuego/Videogame: " + this.getNombre()+ "," + this.getGenero();
    }

}
