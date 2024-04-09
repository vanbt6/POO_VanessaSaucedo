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
    public static Idiomas getInstance(String idioma){
        Textos opcion = Textos.valueOf(idioma);
        switch (opcion){
            //Idioma Español
            case Textos.A:
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
                break;
                // Idioma Ingles
            case Textos.B:
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
                break;
            default:
                throw new IllegalArgumentException("Idioma no disponible");
        }
        return null;
    }

}
/**
 * Referencias de los idiomas A(Español) B(Ingles)
 */
enum Textos{
    A,B
}
