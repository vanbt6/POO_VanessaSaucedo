package edu.vanessa_saucedo.reto2.cajas.ui;

import edu.vanessa_saucedo.reto2.cajas.process.CalculadorCompraVenta;

import java.util.Scanner;
public class CLI {
    /**
     * Variables globales para poder usarlas en
     * cualquier metodo
     */
    static Scanner scanner = new Scanner(System.in);
    static int opcion;
    static double totalIngresos;
    static int totalVentas;
    static int totalCompras;
    static double totalEgresos;
    static double montoTotal;
    static int totalOperaciones;
    public static void showMenu(){
        CalculadorCompraVenta.iniciarSesion();
        do {
            System.out.println("Elige alguna de estas opciones:");
            System.out.println("1. Comprar cajas de papel ");
            System.out.println("2. Vender cajas de papel");
            System.out.println("3. Mostrar reporte" );
            System.out.println("4. Salir de programa" );
            System.out.print("Ingrese la opción deseada: ");
            launchCalculador();
        }while (opcion != 4);

    }

    public static void launchCalculador(){
        opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingresa número de cajas a comprar :");
                int cajasCompradas = scanner.nextInt();
                System.out.println("Ingresa costo de las cajas a comprar:");
                double costoCompradas = scanner.nextDouble();
                double montoCompras=CalculadorCompraVenta.comprarCajas(cajasCompradas,costoCompradas);
                System.out.printf("La compra realizada por %d cajas al precio de %.2f es igual a %.2f%n",
                        cajasCompradas,costoCompradas,montoCompras);
               //va sumando la cantidad y costo ingresado por el usuario
                totalCompras += cajasCompradas;
                totalIngresos += costoCompradas;
                montoTotal += montoCompras;
                totalOperaciones += 1;

                break;
            case 2:
                System.out.println("Ingresa número de cajas a vender :");
                int cajasVendidas = scanner.nextInt();
                System.out.println("Ingresa costo de las cajas a vender:");
                double costoVendidas = scanner.nextDouble();
                double montoVendidas=CalculadorCompraVenta.venderCajas(cajasVendidas,costoVendidas);
                System.out.printf("La venta realizada por %d cajas al precio de %.2f es igual a %.2f%n",
                        cajasVendidas,costoVendidas,montoVendidas);
                //va sumando la cantidad y costo ingresado por el usuario
                totalVentas += cajasVendidas;
                totalEgresos += costoVendidas;
                montoTotal += montoVendidas;
                totalOperaciones += 1;

                break;
            case 3:
                System.out.println("Cantidad total de ventas: " + totalVentas);
                System.out.println("Cantidad total de compras: " + totalCompras);
                System.out.println("Ingresos generados por ventas: " + totalEgresos);
                System.out.println("Egresos generados por compras: " + totalIngresos);
                System.out.println("Monto en la caja: " + montoTotal);
                totalOperaciones += 1;
                break;
            case 4:
                System.out.println("Cantidad total de operaciones realizadas: " + totalOperaciones);
                System.out.println("Cantidad total de ventas: " + totalVentas);
                System.out.println("Cantidad total de compras: " + totalCompras);
                System.out.println("Monto en la caja: " + montoTotal);
                System.out.println("Ingresos generados por ventas: " + totalIngresos);
                System.out.println("Egresos generados por compras: " + totalEgresos);
                System.out.println("Gracias, hasta luego \n Programa terminado.");
                break;
            default:
                System.out.println("Opcion invalida, intente de nuevo");
                showMenu();
                break;
        }
    }
}
