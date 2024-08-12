package actividad.propuesta.pkg15.pkg8;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Articulo implements Serializable{
    
    
    @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String titulo;
    private int anioPubli;
    private int numPalabras;
    
    @ManyToOne
    Periodista p;

    public Articulo(String titulo, int anioPubli, int numPalabras, Periodista p) {
        this.titulo = titulo;
        this.anioPubli = anioPubli;
        this.numPalabras = numPalabras;
        this.p = p;
    }

    public Articulo() {
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

    public int getAnioPubli() {
        return anioPubli;
    }

    public void setAnioPubli(int anioPubli) {
        this.anioPubli = anioPubli;
    }

    public int getNumPalabras() {
        return numPalabras;
    }

    public void setNumPalabras(int numPalabras) {
        this.numPalabras = numPalabras;
    }

    public Periodista getP() {
        return p;
    }

    public void setP(Periodista p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Articulo{" + "id=" + id + ", titulo=" + titulo + ", anioPubli=" + anioPubli + ", numPalabras=" + numPalabras + ", p=" + p + '}';
    }
    
    
    
}
