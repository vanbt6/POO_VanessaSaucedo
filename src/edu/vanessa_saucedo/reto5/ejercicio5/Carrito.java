package edu.vanessa_saucedo.reto5.ejercicio5;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;
    private  int cantidad;
    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public void modificarCant(Producto producto, int cantidad) {
        producto.setStock(cantidad);
    }
}
