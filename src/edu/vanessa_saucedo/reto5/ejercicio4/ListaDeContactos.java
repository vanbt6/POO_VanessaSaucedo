package edu.vanessa_saucedo.reto5.ejercicio4;

import java.util.ArrayList;

public class ListaDeContactos {
    ArrayList <Contacto> contactos;

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }
}
