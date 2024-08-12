package actividad.resuelta.pkg15.pkg1;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class AlumnoT15 implements Serializable {

    @Id
    private int id;
    private String nombre;
    private String direccion;
    private double notaMedia;

    public AlumnoT15(int id, String nombre, String direccion, double notaMedia) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.notaMedia = notaMedia;
    }

    public AlumnoT15() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "AlumnoT15{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", notaMedia=" + notaMedia + '}';
    }

}
