package edu.vanessa_saucedo.evidencia1.process;

import edu.vanessa_saucedo.evidencia1.data.Medicamento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase para crear los procedimientos rqueridos para los medicamentos
 * incluye los metodos de: clacular el precio de venta y generar reporte final
 */
public class ProcesadorMedicamento {
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el usuario");
        String usuario = scanner.next();
        System.out.println("Ingresa la contraseña");
        String password = scanner.next();
        String userCorrecto = "usuario1";
        String passwordCorrecto = "password123";

        // Verificar si el usuario y contraseña son los correctos
        if(!(usuario.equals(userCorrecto) && password.equals(passwordCorrecto))) {
            System.out.println("Usuario o contraseña incorrectos, intente de nuevo");
            login(); // Llamada para volver a solicitar credenciales
        }
    }

    public static String calcularEstado(int formaFarmaceutica){
        if (formaFarmaceutica > 0 && formaFarmaceutica < 10){
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
        System.out.println("Reporte generado por: " );
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
