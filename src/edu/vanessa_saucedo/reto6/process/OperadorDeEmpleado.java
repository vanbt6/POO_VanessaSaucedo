package edu.vanessa_saucedo.reto6.process;

import edu.vanessa_saucedo.reto6.data.Categoria;
import edu.vanessa_saucedo.reto6.data.Empleado;

import java.util.ArrayList;

/**
 * Esta clase es para generar las operaciones del total de sueldos,
 * el total de horas y mostrar el reporte final; incluye los metodos de:
 * -Calcular el total de sueldos y horas trabajadas
 * -Mostrar el reporte final
 */

public class OperadorDeEmpleado{

    /**
     * Este metodo sirve para generar la suma y el total de todos los sueldos base, por horas
     * extra y el total de estas mismas horas
     * @param empleados arrayList
     * @param cantEmpleados a registrar
     */
    public static void calcularTotalSueldos(ArrayList<Empleado> empleados, int cantEmpleados) {
        double totalNomina = 0;
        double totalSueldoNormal = 0;
        double totalHorasExtras = 0;
        int totalPersonasHorasExtras = 0;
        double totalHorasLaboradas = 0;

        //Por cada empleado ingresado en el ArrayList, hace todas estas sumas
        for (Empleado empleado : empleados) {
            int horasTrabajadas = empleado.getHorasTrabajadas();
            double horasExtras = empleado.getHorasExtras();
            Categoria categoria = empleado.getCategoria();

            double sueldoNormal = horasTrabajadas * categoria.getSueldoBase();
            double pagoHorasExtras = horasExtras * categoria.getPagoHoraExtra();
            totalHorasLaboradas += horasTrabajadas + horasExtras;

            totalNomina += sueldoNormal + pagoHorasExtras;
            totalSueldoNormal += sueldoNormal;
            totalHorasExtras += pagoHorasExtras;

            //Si no hay horas extra, se suman a personas sin horas extra
            if (horasExtras > 0) {
                totalPersonasHorasExtras++;
            }
        }
        //resta para sacar las personas con horas extra
        int totalPersonasSinHorasExtras = cantEmpleados - totalPersonasHorasExtras;

        mostrarReporteFinal(totalNomina, totalSueldoNormal,
                totalHorasExtras, totalPersonasHorasExtras, totalPersonasSinHorasExtras, totalHorasLaboradas);
    }

    public static void mostrarReporteFinal(double totalNomina, double totalSueldoNormal, double totalHorasExtras,
                                           int totalPersonasHorasExtras, int totalPersonasSinHorasExtras,
                                           double totalHorasLaboradas){
        System.out.println("\n--- Reporte de Nómina ---");
        System.out.println("Total de la nómina de la empresa: $" + totalNomina);
        System.out.println("Total a pagar por sueldo normal: $" + totalSueldoNormal);
        System.out.println("Total a pagar por horas extras: $" + totalHorasExtras);
        System.out.println("Total de horas laboradas en la empresa: " + totalHorasLaboradas);
        System.out.println("Total de personas que tienen horas extras: " + totalPersonasHorasExtras);
        System.out.println("Total de personas que no tienen horas extras: " + totalPersonasSinHorasExtras);

    }





}
