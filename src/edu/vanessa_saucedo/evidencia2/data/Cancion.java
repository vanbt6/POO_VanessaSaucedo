package edu.vanessa_saucedo.evidencia2.data;

public class Cancion extends Producto{
    private double costoPorReproduccion;

    /**
     * Constructor para obtener todas los atributos del producto
     *
     * @param nombre      de la cancion
     * @param genero      de la cancion
     * @param estreno     si es estreno o no
     * @param costoReproduccion de la cancion
     */
    public Cancion(String nombre, String genero, boolean estreno, double costoReproduccion) {
        super(nombre, 0, genero, estreno);
        //asignar el costo por reproducción
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
        return "Canción/Song: " + this.getNombre()+ ","+ this.getGenero();
    }
}
