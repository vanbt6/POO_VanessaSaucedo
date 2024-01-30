package edu.vanessa_saucedo.reto1;

import edu.vanessa_saucedo.reto1.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try{
            CLI.showMenu();
        }catch (Exception e ){
            System.out.println("Error inesperado"+e);
        }
    }
}
