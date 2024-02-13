package edu.vanessa_saucedo.reto3.numero.process;
import java.util.Random;
/**
 *Esta clase sirve para los procedimientos del conteo
 * de números impares y pares en el arreglo; contiene
 * los metodos de:
 * obtener numeros random, mostrar el arreglo,
 * conteo de pares e impares y sumar todos los valores
 */
public class ConteoNumeros { ;
    /**
     * Es para generar números random del 1-100 y
     * agregarlos al arreglo
     * @param numeros arreglo
     * @param filas del arreglo
     * @param columnas del arreglo
     */
    public static void getNumeros(int[][] numeros, int filas, int columnas){
        Random random = new Random();
        //va por cada fila del arreglo
        for (int i = 0; i < filas; i++) {
            //va por cada columna del arrreglo
            for (int j = 0; j < columnas; j++) {
                // Generar números aleatorios del 1 al 100
                numeros[i][j] = random.nextInt(100) + 1;
            }
        }
        //mando llamar al mismo tiempo para mostrar el arreglo
        mostrarArreglo(numeros,filas,columnas);
    }
    /**
     * Es para mostrar el arreglo
     * @param numeros arreglo
     * @param filas del arreglo
     * @param columnas del arreglo
     */
    public static void mostrarArreglo(int[][] numeros, int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

    }
    /**
     * Metodo para el conteo de pares e impares por
     * cada una de las filas
     * @param numeros arreglo
     */
    public static void conteoFilas(int[][] numeros){
        for (int i = 0; i < numeros.length; i++){
            int pares = 0;
            int impares = 0;
            //numeros[i] es para saber a que fila estamos accediendo
            for (int j = 0; j < numeros[i].length; j++){
                if (numeros[i][j] % 2 == 0){
                    pares++;
                }else{
                    impares++;
                }
            }
            System.out.printf("Pares: %d , Impares: %d ; en la fila: %d\n", pares, impares, i+1);
        }

    }
    /**
     * Metodo para el conteo de pares e impares por
     * cada una de las columnas
     * @param numeros arreglo
     */
    public static void conteoColumnas(int[][] numeros){
        //es para obtner el número de columnas del arregñp
        int index = numeros[0].length;
        for (int j = 0; j < index; j++){
            int pares = 0;
            int impares = 0;
            for (int i = 0; i < numeros.length; i++){
                if (numeros[i][j] % 2 ==0){
                    pares++;
                }else{
                    impares++;
                }
            }
            System.out.printf("Pares: %d , Impares: %d ; en la columna: %d\n", pares, impares,j+1);
        }
    }

    /**
     * Metodo para sumar todos los valores del
     * numero
     * @param numeros arreglo
     * @return suma total de los valores
     */
    public static int sumaNumeros(int[][] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                suma += numeros[i][j];
            }
        }
        return suma;
    }

}
