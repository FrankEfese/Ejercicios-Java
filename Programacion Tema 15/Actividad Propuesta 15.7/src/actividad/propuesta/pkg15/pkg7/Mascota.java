package actividad.propuesta.pkg15.pkg7;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String raza;

    public Mascota() {
    }

    public Mascota(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", raza=" + raza + '}';
    }

}
