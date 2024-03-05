package edu.vanessa_saucedo.reto5.ejercicio5;

import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private ArrayList<Producto> productos;
    private int cantidad;
    private double total;

    public Pedido(int numeroPedido, ArrayList<Producto> productos, int cantidad, double total) {
        this.numeroPedido = numeroPedido;
        this.productos = productos;
        this.cantidad = cantidad;
        this.total = total;
    }

    public void procesarCompra() {
        // metodo para procesar la compra y realizar el total sin impuesto
    }

    public double totalImpuesto() {
        //metodo para generar el total con impuesto
        return total;
    }

    public void mostrarTicket() {
        // metodo para mostrar el ticket de compra
    }
}
