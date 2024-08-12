package actividad.propuesta.pkg15.pkg1;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Persona_ActPro_151 implements Serializable {

    @Id
    private String dni;
    private String nombre;
    private int edad;

    public Persona_ActPro_151() {
    }

    public Persona_ActPro_151(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona_ActPro_151{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}
