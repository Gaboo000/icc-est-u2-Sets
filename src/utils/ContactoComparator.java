package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        int comp = c1.getNombre().compareTo(c2.getNombre());
        if (comp == 0) {
            comp = c1.getApellido().compareTo(c2.getApellido());
            if (comp == 0) {
                comp = c1.getTelefono().compareTo(c2.getTelefono());
            }
        }
        return comp;
    }
}

