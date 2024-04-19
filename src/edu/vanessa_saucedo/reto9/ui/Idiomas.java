package edu.vanessa_saucedo.reto9.ui;

public class Idiomas {
    public static String MENU;
    public static String LIBRO_SELECCIONADO;
    public static String LISTA_PALABRAS;
    public static String VECES;
    public static String RICITOS;
    public static String CENICIENTA;
    public static String BLANCANIEVES;
    public static String TRES_CERDITOS;
    public static String ERROR_LIBRO;
    public static String TOTAL_VOCALES;
    public static String CRITERIO_VOCALES;
    public static String PALABRAS_VOCAL;
    public static String PALABRAS_IMPAR;
    public static String PALABRA_LARGA;
    public static String PALABRA_CORTA;
    public static Idiomas getInstance(String idioma){
        Textos opcion = Textos.valueOf(idioma);
        switch (opcion){
            //Idioma Español
            case Textos.ESP:
                MENU="Favor de escoger un libro: \n1.Ricitos de Oro \n2.Cenicienta \n3.Blancanieves " +
                        "\n4.Los 3 cerditos \n5.Rapunzel";
                LIBRO_SELECCIONADO= "Su libro que selecciono fue: ";
                LISTA_PALABRAS = "La lista de palabras mas Repetidas son: ";
                VECES = "veces";
                RICITOS = "Ricitos de Oro";
                CENICIENTA = "Cenicienta";
                BLANCANIEVES = "Blancanieves";
                TRES_CERDITOS = "Los 3 cerditos";
                ERROR_LIBRO = "Libro no disponible";
                TOTAL_VOCALES = "Total de vocales en el libro: ";
                CRITERIO_VOCALES = "¿Hay alguna palabra que cumpla el criterio de comenzar con vocal y terminar " +
                        "con una, que contenga al menos 5 letras?: ";
                PALABRAS_VOCAL="---Palabras que empiezan con vocal alfabeticamente---:";
                PALABRAS_IMPAR ="---Palabras que contienen un número impar de letras---:" ;
                PALABRA_LARGA = "---La palabra mas larga es---: ";
                PALABRA_CORTA = "---La palabra mas corta es---: ";
                break;
                // Idioma Ingles
            case Textos.ENG:
                MENU="Please choose a book: \n1.Goldilocks \n2.Cinderella \n3.Snow White " +
                        "\n4.The 3 little pigs \n5.Rapunzel";
                LIBRO_SELECCIONADO = "Your book that you selected was: ";
                LISTA_PALABRAS = "The list of most repeated words are: ";
                VECES = "times";
                RICITOS = "Goldilocks";
                CENICIENTA = "Cinderella";
                BLANCANIEVES = "Snow White";
                TRES_CERDITOS = "The 3 little pigs";
                ERROR_LIBRO = "Book not available";
                TOTAL_VOCALES = "Total vowels in the book: ";
                CRITERIO_VOCALES = "Is there any word that meets the criteria of beginning with a vowel and ending " +
                        "with one, containing at least 5 letters?: ";
                PALABRAS_VOCAL="---Words that begin with a vowel alphabetically---:";
                PALABRAS_IMPAR ="---Words that contain an odd number of letters---:" ;
                PALABRA_LARGA = "---The longest word is---: ";
                PALABRA_CORTA = "---The shortest word is---: ";
                break;
            default:
                throw new IllegalArgumentException("Idioma no disponible");
        }
        return null;
    }

}
/**
 * Representante de valores cualitativos (categorias)
 */
enum Textos{
    ESP,ENG
}
