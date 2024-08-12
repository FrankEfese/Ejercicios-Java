package actividad.resuelta.pkg12.pkg11;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Socio implements Comparable<Socio> , Serializable{

    String dni;
    String nombre;
    LocalDateTime fecha;

    public Socio(String dni, String nombre, LocalDateTime fecha) {
        this.dni = dni;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Socio{" + "dni=" + dni + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }

    @Override
    public int compareTo(Socio o) {

        return this.dni.compareTo(o.dni);

    }

}
