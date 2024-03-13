package edu.vanessa_saucedo.reto6;

import edu.vanessa_saucedo.reto6.data.Categoria;
import edu.vanessa_saucedo.reto6.data.Empleado;
import edu.vanessa_saucedo.reto6.ui.Cli;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<Empleado> empleados = new ArrayList<>();
        //se crea un constructor por categoria y sus datos correspondientes
        Categoria empleadoVentas = new Categoria("Empleado Ventas", "EV", 100.00, 50.00);
        Categoria administrador = new Categoria("Administrador", "ADM", 180.00, 100.00);
        Categoria gerente = new Categoria("Gerente", "GER", 250.00, 150.00);
        Cli.launchApp(empleados, empleadoVentas, administrador, gerente);

    }
}
