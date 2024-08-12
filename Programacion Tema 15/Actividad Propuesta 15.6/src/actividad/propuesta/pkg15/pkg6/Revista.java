package actividad.propuesta.pkg15.pkg6;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Revista implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String titulo;
    private double precio;
    private int mesPubli;
    private int numPag;

    public Revista() {
    }

    public Revista(String titulo, double precio, int mesPubli, int numPag) {
        this.titulo = titulo;
        this.precio = precio;
        this.mesPubli = mesPubli;
        this.numPag = numPag;
    }
    
    

   

    public int getMesPubli() {
        return mesPubli;
    }

    public void setMesPubli(int mesPubli) {
        this.mesPubli = mesPubli;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
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
        return "Revista{" + "id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", mesPubli=" + mesPubli + ", numPag=" + numPag + '}';
    }

    

    

}
