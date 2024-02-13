package edu.vanessa_saucedo.reto3.diccionario.process;
import java.util.Arrays;

/**
 * Esta clase es para crear todos los procedimientos
 * de la actividad del diccionario; incluye el metodo de:
 * enlistar, buscar, mostrar significado y detalle
 */
public class DiccionarioPalabras {
    //arreglos de palabras y su significado de las mismas :)
    private   String[] palabras;
    private  String[] significado;
    public DiccionarioPalabras(String[] palabras, String[] significado){
        this.palabras = palabras;
        this.significado = significado;
    }

    /**
     * Este metodo es para mostrar todas las palabras del arreglo
     */
    public  void enlistarPalabras() {
        //Muestra cada una de las palabras en el arreglo
        Arrays.stream(palabras).forEach(System.out::println);
    }

    /**
     * Este metodos tiene la funcion de buscar las palabras en el arreglo
     * y mostrar su respectivo significado
     * @param palabra a buscar
     */
    public  void buscarPalabras(String palabra){
        /**
         * declaro una variable llamada lugar y le doy el valor de -1, para rectificar si
         * la palabra ingresada esta en el arreglo o no
         */
        int lugar = -1;
        for (int i=0; i < palabras.length; i++){
            // equalsIgnoreCase es para ignorar minusculas y mayusculas a la hora de comparar
            if (palabras[i].equalsIgnoreCase(palabra)) {
                //a lugar le damos el valor del espacio de la palabra ingresada
                lugar = i;
                break;
            }
        }
        //manda a llamar el metodo de mostrar significado
        mostrarSignificado(palabra,lugar);
    }

    /**
     * Este metodo sirve para mostrar el significado de la palbra ingresada por usuario
     * @param palabra a buscar
     * @param lugar en el arreglo
     */
    public  void mostrarSignificado(String palabra,int lugar){
        //aqui compara si el lugar de la palabra no existe en el arreglo
        if (lugar != -1) {
            /**
             * Si existe esze lugar, se muestra el significado tomando el mismo lugar del arreglo "significados"
             */
            System.out.println("El significado de " + palabra + " es : " + significado[lugar]);
        } else {
            //si no existe, manda un mensaje al usuario
            System.out.println("La palabra no existe en el diccionario.");
        }
    }

    /**
     * Metodo para mostrar la cantidad de caracteres de cada una de las palabras y
     * de su significado
     */
    public  void detallesPalabras(){
        System.out.println("Cantidad de palabras en el diccionario: " + palabras.length);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("- " + palabras[i] + " cantidad de caracteres: " + palabras[i].length() + " cantidad de" +
                    " caracteres de su significado: " + significado[i].length() );
        }
    }

}
