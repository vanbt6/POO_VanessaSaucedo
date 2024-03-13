package edu.vanessa_saucedo.reto6.data;

/**
 * Clase para el objeto Empleado
 */
public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double horasExtra;

    //Creando refrencia a un objeto tipo categoria
    private Categoria categoria;

    /**
     * Constructor para inicializar los atributos
     * @param nombre del empleado
     * @param horasTrabajadas las que usualmente labora
     * @param horasExtra generadas por el empleado
     * @param categoria en la que trabaja
     */
    public Empleado(String nombre, int horasTrabajadas, int horasExtra, Categoria categoria) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtra = horasExtra;
        this.categoria = categoria;
    }


    /**
     * Matodo para mostrar los datos del usuario
     * @return sus datos ingresados
     */
    @Override
    public String toString() {
        return  "----Datos de Empleado----" +
                "\nNombre: " + this.nombre  +
                "\nHoras Trabajadas: " + this.horasTrabajadas +
                "\nHoras Extra: " + this.horasExtra +
                //para obtener solo el nombre
                "\nCategoria: " + this.categoria.getNombre() ;
    }

    //getters() y setters()
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getHorasExtras() {
        return horasExtra;
    }
    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }
}
