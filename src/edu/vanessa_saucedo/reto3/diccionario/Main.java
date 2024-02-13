package edu.vanessa_saucedo.reto3.diccionario;

import edu.vanessa_saucedo.reto3.diccionario.process.DiccionarioPalabras;
import edu.vanessa_saucedo.reto3.diccionario.ui.Cli;

public class Main {
    public static void main(String[] args){
        String[] palabras = {"Arrebol","Aurora","Beldad","Bonhomía", "Compasión",
                "Complicidad", "Desenlace", "Etéreo", "Efímero", "Elocuencia"};
        String[] significado ={"Color rojo,especialmente el de las nubes", "Hermosura del rostro.",
                "Belleza o hermosura", "Sencillez", "Sentimiento de pena", "Cualidad de cómplice.",
                "Final de una acción o de un suceso","Vago o sutil", "Pasajero de corta duración.", "Eficaz para deleitar"};
        DiccionarioPalabras diccionario = new DiccionarioPalabras(palabras,significado);
        Cli.launchDiccionario(diccionario);
    }
}
