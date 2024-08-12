package actividad.aplicacion.pkg13.pkg16;

import java.time.LocalDate;
import java.util.Objects;

public class Socio implements Comparable<Socio> {

    String dni;
    String nombre;
    LocalDate fechaNac;
    LocalDate fechaAlta;
    double cuota;
    int numFam;

    public Socio(String dni, String nombre, LocalDate fechaNac, LocalDate fechaAlta, double cuota, int numFam) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.fechaAlta = fechaAlta;
        this.cuota = cuota;
        this.numFam = numFam;
    }

    @Override
    public String toString() {
        return "Socio{" + "dni=" + dni + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", fechaAlta=" + fechaAlta + ", cuota=" + cuota + ", numFam=" + numFam + '}';
    }

   

    @Override
    public boolean equals(Object obj) {

        Socio b = (Socio) obj;

        return this.dni.equals(b.dni);
    }

    @Override
    public int compareTo(Socio o) {

        return this.dni.compareTo(o.dni);
    }

}
