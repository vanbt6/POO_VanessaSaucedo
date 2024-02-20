package edu.vanessa_saucedo.evidencia1.data;


import edu.vanessa_saucedo.evidencia1.process.ProcesadorMedicamento;

/**
 * Clase para guiardar los datos/variables en base al objeto
 * medicamento
 */
public class Medicamento {
    String nombreQuimico;
    String nombreGenerico;
    String nombreRegistrado;
    String formaFarmaceutica;
    double precioPublico;
    double precioVenta;

    //Metodo para generar un objeto de cada una de las variables y obtenerla
    public Medicamento (String nombreQuimico, String nombreGenerico, String nombreRegistrado,
                        String formaFarmaceutica, double precioPublico ){
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.formaFarmaceutica = formaFarmaceutica;
        this.precioVenta= ProcesadorMedicamento.calcularPrecioVenta(precioPublico, formaFarmaceutica);

    }

    @Override
    public String toString() {
        return String.format("Nombre Químico: %s \n" +
                "Nombre Genérico: %s \n" +
                "Nombre Registrado: %s \n" +
                "Forma Farmacéutica: %s \n" +
                "Precio Público: %.2f \n" +
                "Precio Venta %.2f: ", nombreQuimico, nombreGenerico, nombreRegistrado,
                formaFarmaceutica, precioPublico, precioVenta);
    }
}
