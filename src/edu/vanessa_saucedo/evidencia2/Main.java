package edu.vanessa_saucedo.evidencia2;

import edu.vanessa_saucedo.evidencia2.data.Producto;
import edu.vanessa_saucedo.evidencia2.process.CalculadoraDeCostos;
import edu.vanessa_saucedo.evidencia2.ui.Cli;

import java.util.List;

public class Main {
    public static void main(String[] args){
        //Declarar las listas que se usaran en la Calculadora
        List<Producto> productos = CalculadoraDeCostos.crearProductos();
        List<Producto> consumoUsuario = CalculadoraDeCostos.generarConsumoAleatorio(productos);
       Cli.launchReporte(consumoUsuario);
    }
}
