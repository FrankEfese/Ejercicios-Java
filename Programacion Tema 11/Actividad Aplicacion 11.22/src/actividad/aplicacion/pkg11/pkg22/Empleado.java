package actividad.aplicacion.pkg11.pkg22;

import java.io.Serializable;

public class Empleado implements Serializable {

    String dni;
    String nombre;
    double sueldo;

    public Empleado(String dni, String nombre, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

}
