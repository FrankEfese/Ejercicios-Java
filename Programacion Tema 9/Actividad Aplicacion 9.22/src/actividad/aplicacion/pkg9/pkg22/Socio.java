package actividad.aplicacion.pkg9.pkg22;

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

    int edad() {

        return fecha.getYear();

    }

    @Override
    public int compareTo(Object o) {
        Socio s = (Socio) o;

        return this.edad() - s.edad();
    }

    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }

}
