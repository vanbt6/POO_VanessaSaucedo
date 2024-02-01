package edu.vanessa_saucedo.reto2.cajas.process;

import java.util.Scanner;

/**
 * Esta clase es para realizar las operaciones de compra
 * y venta, incluye los metodos de comprar cajas y vender
 * cajas
 */
public class CalculadorCompraVenta {
    public static void iniciarSesion(){
        String usuarioCorrecto = "usuario";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el usuario: ");
        String usuario = scanner.next();
        System.out.println("Ingresa la contraseña: ");
        String contraseña = scanner.next();
        if(!(usuario.equals(usuarioCorrecto)&&contraseña.equals(password))){
            System.out.println("Sesion incorrecta, intente de nuevo");
            iniciarSesion();
        }
    }
    /**
     * Este metodo es para calcular el total de las cajas
     * vendidas
     * @param cajasCompradas cantidad de cajas compradas
     * @param costoCompradas costo de c/u
     * @return monto total de la compra
     */
    public static double comprarCajas(double cajasCompradas, double costoCompradas){
        return cajasCompradas*costoCompradas;
    }

    /**
     * Este metodo es para calcular el total de cajas
     * compradas
     * @param cajasVendidas cantidad de cajas vendidas
     * @param costoVendidas costo de c/u
     * @return monto total de la venta
     */
    public static double venderCajas(double cajasVendidas, double costoVendidas){

        return cajasVendidas*costoVendidas;
    }

}
