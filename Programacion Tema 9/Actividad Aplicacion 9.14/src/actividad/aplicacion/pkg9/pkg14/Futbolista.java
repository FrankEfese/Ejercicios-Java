package actividad.aplicacion.pkg9.pkg14;

import java.util.Objects;

public class Futbolista implements Comparable {

    String dni;
    String nombre;
    int edad;
    int numGoles;

    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", numGoles=" + numGoles + '}';
    }

    @Override
    public boolean equals(Object obj) {

        Futbolista f = (Futbolista) obj;

        return this.dni.equals(f.dni);
    }

    @Override
    public int compareTo(Object o) {

        Futbolista f = (Futbolista) o;

        return this.dni.compareTo(f.dni);
    }

}
