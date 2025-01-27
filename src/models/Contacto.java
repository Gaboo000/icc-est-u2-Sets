package models;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    // Opcional: puedes sobreescribir toString() para imprimir el contacto de forma
    // amigable
    @Override
    public String toString() {
        return nombre + " " + apellido + " - " + telefono;
    }

    // Opcional: sobreescribir equals() y hashCode() para definir cuándo dos
    // Contacto son iguales

    // En este caso, podríamos definir que dos Contacto son iguales si tienen el
    // mismo nombre y apellido.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // referencias de memora
            return true;
        if (obj == null) // obj es null
            return false;
        if (getClass() != obj.getClass())
            return false;

        Contacto other = (Contacto) obj;
        return nombre.equals(other.nombre)
                && apellido.equals(other.apellido);
    }

    // @Override
    // public int hashCode() {
    // // Por simplicidad, combinamos los hash de nombre y apellido
    // return nombre.hashCode() + apellido.hashCode();
    // }



    
}