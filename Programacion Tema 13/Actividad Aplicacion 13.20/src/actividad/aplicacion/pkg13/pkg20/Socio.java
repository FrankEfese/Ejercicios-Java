package actividad.aplicacion.pkg13.pkg20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    int edad() {

        return LocalDate.now().getYear() - this.fechaNac.getYear();

    }

    int atiguedad() {

        return (int) ChronoUnit.MONTHS.between(this.fechaAlta, LocalDate.now());

    }

}
