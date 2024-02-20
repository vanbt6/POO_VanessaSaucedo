package edu.vanessa_saucedo.evidencia1;

import edu.vanessa_saucedo.evidencia1.data.Medicamento;
import edu.vanessa_saucedo.evidencia1.ui.Cli;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //arrayList para los medicamentos
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        Cli.launchApp(medicamentos);

    }
}
