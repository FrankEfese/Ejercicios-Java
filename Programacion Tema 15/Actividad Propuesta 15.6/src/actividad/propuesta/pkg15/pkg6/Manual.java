package actividad.propuesta.pkg15.pkg6;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Manual implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String titulo;
    private double precio;

    public Manual() {
    }

    public Manual(int id, String titulo, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
    }

    public Manual(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Manual{" + "id=" + id + ", titulo=" + titulo + ", precio=" + precio + '}';
    }

}
