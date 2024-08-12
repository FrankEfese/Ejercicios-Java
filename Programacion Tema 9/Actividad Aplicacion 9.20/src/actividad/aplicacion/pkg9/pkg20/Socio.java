package actividad.aplicacion.pkg9.pkg20;

import java.time.LocalDate;

public class Socio implements Comparable {

    int id;
    String nombre;
    int edad;

    public Socio(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
        Socio s = (Socio) o;

        return this.edad - s.edad;
    }

    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}
