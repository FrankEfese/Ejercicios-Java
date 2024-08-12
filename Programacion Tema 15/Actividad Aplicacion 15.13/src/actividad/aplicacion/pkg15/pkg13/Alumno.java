package actividad.aplicacion.pkg15.pkg13;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Alumno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private int telefono;

    @OneToOne(mappedBy = "alumno", cascade = CascadeType.PERSIST)
    Portatil portatil;

    public Alumno() {
    }

    public Alumno(String nombre, int telefono, Portatil portatil) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.portatil = portatil;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Portatil getPortatil() {
        return portatil;
    }

    public void setPortatil(Portatil portatil) {
        this.portatil = portatil;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }

}
