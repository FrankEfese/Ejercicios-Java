package actividad.resuelta.pkg15.pkg3;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Estrellas_AR153 implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private int duracion;
    private int intensidad;
    private boolean verdoso;

    public Estrellas_AR153() {
    }

    public Estrellas_AR153(int duracion, int intensidad, boolean verdoso) {
        this.duracion = duracion;
        this.intensidad = intensidad;
        this.verdoso = verdoso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    public boolean isVerdoso() {
        return verdoso;
    }

    public void setVerdoso(boolean verdoso) {
        this.verdoso = verdoso;
    }

    @Override
    public String toString() {
        return "Estrellas_AR153{" + "id=" + id + ", duracion=" + duracion + ", intensidad=" + intensidad + ", verdoso=" + verdoso + '}';
    }

}
