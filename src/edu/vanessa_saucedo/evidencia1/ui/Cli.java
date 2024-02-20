package edu.vanessa_saucedo.evidencia1.ui;

import edu.vanessa_saucedo.evidencia1.data.Medicamento;
import edu.vanessa_saucedo.evidencia1.process.ProcesadorMedicamento;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase de interfaz de pedida de datos al usuario
 */

public class Cli {
    static Scanner scanner = new Scanner(System.in);

    public static void launchApp(ArrayList<Medicamento> medicamentos){
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

            System.out.println("Ingrese el tipo de presentación (solido/solido semisolido/solido liquido):");
            String formaFarmaceutica = scanner.nextLine();

            //ingresa las variables al ArrayList
            Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado,
                    formaFarmaceutica, precioPublico);
            medicamentos.add(medicamento);
        }
    }
}
