package edu.vanessa_saucedo.reto4.process;

import edu.vanessa_saucedo.reto4.data.Boleto;
import edu.vanessa_saucedo.reto4.data.Ticket;
import java.util.ArrayList;

import java.util.Scanner;

/**
 * Esta clase sirve para realizar todos los procesos de venta
 * del uruario; contiene los metodos de:
 * realizar venta, generar venta y mostrar lista de la venta
 */

public class ProcesadorVentas {

    static ArrayList<Boleto> listaVentas = new ArrayList<>();

    /**
     * Este metodo sirve para pedirle los datos al usuario
     * y segun la cantidad de boletos adicionales, pedirle el nombre
     * de esos pasajeros extra
     */

    public static void realizarVenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese boletos Adicionales:");
        int cantBoletos = Integer.parseInt(scanner.nextLine());

        //Pide los nombres de los Pasajeros adicionales
        ArrayList<String> pasajeros = new ArrayList<>();
        for (int i = 1; i <= cantBoletos ; i++) {
            System.out.println("Ingrese el nombre completo del pasajero adicional " + i + ":");
            //guarda el nombre del pasajero adicional en el ArrayList
           pasajeros.add(scanner.nextLine());
        }
        generarVenta(nombre,cantBoletos,pasajeros,listaVentas);
    }

    /**
     * Este metodo funciona para guardar los datos ingresados
     * en el array list de lista de ventas y llamar al metodo para generar
     * el ticket
     * @param nombre del comprador
     * @param cantBoletos requeridos por el comprador
     * @param pasajeros adicionales (ArrayList)
     * @param listaVentas (ArrayList)
     */
    public static void generarVenta(String nombre, int cantBoletos, ArrayList<String> pasajeros,
                                    ArrayList<Boleto> listaVentas){
        Boleto boleto = new Boleto(nombre,cantBoletos,pasajeros);
        listaVentas.add(boleto);
        Ticket.generarTicket(boleto);

    }

    /**
     * Metodo para mostrar la Lista de ventas con todos
     * los datos obtenidos
     */
    public static void mostrarListaVentas() {
        System.out.println("----- Lista de Pasajeros -----");
        //Al igual que en ticket manda a llamar los datos y metodos de la clase Boleto
        for (Boleto boleto : listaVentas){
            System.out.println("Nombre del comprador: "+ boleto.comprador);
            System.out.println("Pasajeros adicionales: "+ boleto.pasajeros);
            //Total de boletos (incluyo al comprador)
            int boletosTotales = boleto.boletos + 1;
            System.out.println("Cantidad de Boletos: "+ boletosTotales);
            System.out.println("Monto total de ventas: $"+boleto.calcularPrecio());
        }


    }
}
