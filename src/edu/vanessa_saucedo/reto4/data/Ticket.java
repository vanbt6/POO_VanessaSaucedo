package edu.vanessa_saucedo.reto4.data;

import java.util.ArrayList;

/**
 * Esta clase sirve para generar el ticket de venta
 * con los datos del pasajero y el boleto
 */
public class Ticket {

    /**
     * Genera el ticket del comprador con los datos guardados
     * en la clase "Boleto"
     * @param boleto variable para usar metodos de esa clase
     */
    public static void generarTicket(Boleto boleto) {
        System.out.println("----- Ticket de Venta -----");
        //Le sumo 1 a la cantidad de boletos ingresadas por el usuario (incluyo al comprador)
        int boletosTotales = boleto.boletos + 1;
        System.out.println("Cantidad de boletos: " + boletosTotales);
        System.out.printf("Importe de venta: $ "+ boleto.calcularPrecio());
        System.out.println("\nNombre del comprador: " + boleto.comprador);
        System.out.println("Pasajeros adicionales: "+ boleto.boletos);

    }
}
