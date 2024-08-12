package actividad.resuelta.pkg11.pkg8;

import java.io.Serializable;

public class Socio implements Serializable {

    String dni;
    String nombre;

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Socio{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }

}
