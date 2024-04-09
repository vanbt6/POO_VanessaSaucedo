package edu.vanessa_saucedo.reto9;


import edu.vanessa_saucedo.reto9.ui.Cli;

public class Main {
    public static void main(String[] args){
        try {
            Cli.menuIdiomas();
        }catch (Exception e){
            System.out.println("Ocurrrió un error inesperado");
        }

    }
}
