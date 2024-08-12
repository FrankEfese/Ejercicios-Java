package actividad.propuesta.pkg15.pkg7;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Dueño implements Serializable {

    @Id
    private String id;
    private String nombre;
    private int edad;

    @OneToOne(optional = false)
    private Mascota mascota;

    public Dueño() {
    }

    public Dueño(String id, String nombre, int edad, Mascota mascota) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.mascota = mascota;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Due\u00f1o{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", mascota=" + mascota + '}';
    }

}
