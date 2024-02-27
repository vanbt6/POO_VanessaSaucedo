package edu.vanessa_saucedo.evidencia1;

import edu.vanessa_saucedo.evidencia1.data.Medicamento;
import edu.vanessa_saucedo.evidencia1.ui.CLI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        try{
            //arrayList para los medicamentos
            ArrayList<Medicamento> medicamentos = new ArrayList<>();
            CLI.launchApp(medicamentos);
        }catch (Exception e){
            System.out.println("Error inesperado");
        }
    }
}
