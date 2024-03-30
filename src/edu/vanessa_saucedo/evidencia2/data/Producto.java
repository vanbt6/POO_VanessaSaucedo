package edu.vanessa_saucedo.evidencia2.data;


import edu.vanessa_saucedo.evidencia2.ui.Idiomas;

public abstract class Producto {
    private String nombre;
    private double precio;
    private String genero;
    private boolean estreno;

    //Constructor para asignar los atributos
    public Producto(String nombre, double precio, String genero, boolean estreno) {
        this.nombre = nombre;
        this.precio = precio;
        this.genero = genero;
        this.estreno = estreno;
    }

    //Metodo para obtener el precio base de los productos
    public double getPrecioBase(){
        return 5.0;
    }

    //Metodo para saber si el producto es estreno o no
    public boolean isEstreno(){
        return estreno;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getGenero() {
      return  this.genero;
    }

    //Metodo abstracto para calcular los costos
    public abstract double calcularCosto();


}