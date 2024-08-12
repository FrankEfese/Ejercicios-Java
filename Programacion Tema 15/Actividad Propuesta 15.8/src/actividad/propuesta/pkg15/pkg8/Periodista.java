package actividad.propuesta.pkg15.pkg8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Periodista implements Serializable {
    
    @Id
    
    private String dni;
    private String nombre;
    private int numTelef;
    
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "p")
    List<Articulo> articulos;

    public Periodista() {
    }

    public Periodista(String dni, String nombre, int numTelef, List<Articulo> articulos) {
        this.dni = dni;
        this.nombre = nombre;
        this.numTelef = numTelef;
        this.articulos = articulos;
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

    public int getNumTelef() {
        return numTelef;
    }

    public void setNumTelef(int numTelef) {
        this.numTelef = numTelef;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Periodista{" + "dni=" + dni + ", nombre=" + nombre + ", numTelef=" + numTelef + '}';
    }

   
    
    
}
