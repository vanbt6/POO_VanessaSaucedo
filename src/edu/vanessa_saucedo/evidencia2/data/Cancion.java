package edu.vanessa_saucedo.evidencia2.data;

public class Cancion extends Producto{
    private double costoPorReproduccion;
    public Cancion(String nombre, String genero, boolean estreno, double costoReproduccion) {
        super(nombre, 0, genero, estreno);
        this.costoPorReproduccion = costoReproduccion;
    }

    @Override
    public double calcularCosto() {
        double costoTotal = getPrecioBase();
        if (isEstreno()) {
            costoTotal += (costoPorReproduccion + 1.50) ;
        } else {
            costoTotal += costoPorReproduccion ;
        }
        return costoTotal;
    }

    @Override
    public String toString() {
        return "Canción/Song: " + ","+ this.getGenero();
    }
}
