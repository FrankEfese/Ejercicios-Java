package actividad.resuelta.pkg9.pkg7;

import java.time.LocalDate;

public class Socio implements Comparable {

    int id;
    String nombre;
    LocalDate fecha;

    public Socio(int id, String nombre, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    @Override
    public int compareTo(Object o) {
        Socio s = (Socio) o;

        return this.id - s.id;
    }

    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }

}
