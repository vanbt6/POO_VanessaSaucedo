package edu.vanessa_saucedo.evidencia1.process;

import edu.vanessa_saucedo.evidencia1.data.Medicamento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase para crear los procedimientos requeridos para los medicamentos
 * incluye los metodos de: login, calcular el estado del medicamento,
 * calcular el precio de venta y generar reporte final
 */
public class ProcesadorMedicamento {
    static String userCorrecto = "usuario1";
    static String passwordCorrecto = "password123";

    //Metodo para hacer el login de usuario
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el usuario");
        String usuario = scanner.next();
        System.out.println("Ingresa la contraseña");
        String password = scanner.next();

        // Verificar si el usuario y contraseña son los correctos
        if(!(usuario.equals(userCorrecto) && password.equals(passwordCorrecto))) {
            System.out.println("Usuario o contraseña incorrectos, intente de nuevo");
            login(); // Llamada para volver a solicitar credenciales
        }
    }

    /**
     * Metodp para asignar el estado del medicamento ingresado por
     * usuario
     * @param formaFarmaceutica en numero entero
     * @return Forma farmaceutica
     */

    public static String calcularEstado(int formaFarmaceutica) {
        if (formaFarmaceutica > 0 && formaFarmaceutica < 10) {
            return "solido";
        } else if (formaFarmaceutica > 9 && formaFarmaceutica < 14) {
            return "semisolido";
        } else {
            return "liquido";
        }
    }
    /**
     * Metodo para generar el precio de venta del medicamento
     * @param precioPublico double
     * @param formaFarmaceutica string
     * @return el precio de Venta a farmacias
     */
    public static double calcularPrecioVenta(double precioPublico, String formaFarmaceutica) {
        double precioVenta = 0.0;
        if (formaFarmaceutica.equalsIgnoreCase("solido")) {
            precioVenta = precioPublico * 1.09;
        } else if (formaFarmaceutica.equalsIgnoreCase("semisolido")) {
            precioVenta = precioPublico * 1.12;
        } else if (formaFarmaceutica.equalsIgnoreCase("liquido")) {
            precioVenta = precioPublico * 1.13;
        }
        return precioVenta;
    }

    /**
     * Metodo para genrar el reporte final
     * @param medicamentos arrayList
     */
    public static void generarReporte(ArrayList<Medicamento> medicamentos){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("---Reporte Final---");
        System.out.println("Reporte generado por: " + userCorrecto);
        System.out.println("Fecha de generación de reporte: " + dtf.format(now));
        System.out.println("Cantidad de productos en la lista: " + medicamentos.size());

        if (medicamentos.isEmpty()) {
            System.out.println("No hay medicamentos registrados.");
        } else {
            System.out.println("Lista de medicamentos:");
            for (Medicamento medicamento : medicamentos) {
                System.out.println(medicamento.toString());
            }
        }

    }
}
