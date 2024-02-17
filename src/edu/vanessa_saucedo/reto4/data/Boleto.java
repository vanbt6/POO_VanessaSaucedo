package edu.vanessa_saucedo.reto4.data;

import java.util.ArrayList;

/**
 * Esta clase sirve para guardar los datos de
 * cada boleto
 */
public class Boleto {
     public String comprador;
     public int boletos;

     //ArrayList para los pasajeros adicionales
    public ArrayList<String> pasajeros;

    //permite crear un objeto comprador, boletos y pasajeros, con lo que ingrese el usuario
    public Boleto(String comprador, int boletos, ArrayList<String> pasajeros) {
        this.comprador = comprador;
        this.boletos = boletos;
        this.pasajeros = pasajeros;
    }

    /**
     * Permite crear el total del importe de la venta
     * @return importe total
     */
    public double calcularPrecio(){
        return boletos * 1250.50;
    }
}
