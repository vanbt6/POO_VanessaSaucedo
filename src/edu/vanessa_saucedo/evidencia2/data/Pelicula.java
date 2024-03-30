package edu.vanessa_saucedo.evidencia2.data;

public class Pelicula extends Producto{
    /**
     * Constructor para obtener todas los atributos del producto
     *
     * @param nombre      de la pelicula
     * @param genero      de la pelicula
     * @param estreno     si es estreno o no
     */
    public Pelicula(String nombre, String genero, boolean estreno) {

        super(nombre, 0, genero, estreno);
    }

    @Override
    public double calcularCosto() {
        /**
         * En base a si es estreno o no regresa el costo, si es
         * verdadero es 15 o si es falso es 7
         */
        return isEstreno() ? 15 : 7;
    }

    @Override
    public String toString() {
        return "Pelicula/Movie:" + this.getNombre() + ","+ this.getGenero();
    }
}
