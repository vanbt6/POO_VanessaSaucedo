package edu.vanessa_saucedo.evidencia1.ui;

import edu.vanessa_saucedo.evidencia1.data.Medicamento;
import edu.vanessa_saucedo.evidencia1.process.ProcesadorMedicamento;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase de interfaz de pedida de datos al usuario
 */

public class CLI {
    static Scanner scanner = new Scanner(System.in);

    public static void launchApp(ArrayList<Medicamento> medicamentos){
        ProcesadorMedicamento.login();
        while (true) {
            System.out.println("Ingrese el nombre químico del medicamento (o 'salir' para terminar):");
            String nombreQuimico = scanner.nextLine();

            if (nombreQuimico.equalsIgnoreCase("salir")) {
                ProcesadorMedicamento.generarReporte(medicamentos);
                break;
            }

            System.out.println("Ingrese el nombre genérico:");
            String nombreGenerico = scanner.nextLine();

            System.out.println("Ingrese el nombre registrado:");
            String nombreRegistrado = scanner.nextLine();

            System.out.println("Ingrese el precio al público:");
            double precioPublico = Double.parseDouble(scanner.nextLine());

            System.out.println("""
                    1.polvos
                    2. granulados
                    3.cápsulas
                    4.comprimidos
                    5.sellos
                    6.tabletas
                    7.supositorios
                    8.óvulos
                    9.implantes
                    10.pomadas
                    11.pastas
                    12.cremas
                    13.geles
                    14.soluciones
                    15.suspensiones
                    16.emulsiones
                    17.jarabes
                    18.elixires
                    19.lociones
                    20.linimentos
                    121.inyectables
                    """);
            int formaFarmaceuticaN = scanner.nextInt();
            String formaFarmaceutica = ProcesadorMedicamento.calcularEstado(formaFarmaceuticaN);

            //ingresa las variables al ArrayList
            Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado,
                    formaFarmaceutica, precioPublico);
            medicamentos.add(medicamento);
        }
    }
}
