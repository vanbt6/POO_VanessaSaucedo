package edu.vanessa_saucedo.reto7;
import edu.vanessa_saucedo.reto7.ui.Cli;
public class Main {
    public static void main(String[] args) {
        try {
            Cli.launchCalculadora();
        }catch (Exception e){
            System.out.println("Ocurrrió un error inesperado");
        }
    }
}
