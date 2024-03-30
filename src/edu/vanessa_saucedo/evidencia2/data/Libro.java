package edu.vanessa_saucedo.evidencia2.data;

public class Libro extends Producto{
    private double costoPorDia;

    public Libro(String nombre, String genero, boolean estreno, double costoPorDia) {
        super(nombre, 0, genero, estreno);
        this.costoPorDia = costoPorDia;
    }

    @Override
    public double calcularCosto() {
        double costoTotal = getPrecioBase(); // Precio base común a todos los libros

        // Costo adicional por día de lectura según el tipo de libro
        switch (getGenero()) {
            case "Novela":
                costoTotal += 2 * costoPorDia;
                break;
            case "Tecnología":
                costoTotal += 3 * costoPorDia;
                break;
            default:
                costoTotal += costoPorDia;
                break;
        }

        // Si es un estreno, agregar 0.50 centavos adicionales
        if (isEstreno()) {
            costoTotal += 0.50;
        }

        return costoTotal;
    }

    @Override
    public String toString() {
        return "Libro/Book: " + ","+ this.getGenero();
    }
}
