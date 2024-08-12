package actividad.aplicacion.pkg15.pkg15;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Jugador implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    private String nombre;
    private int maxGoles;
    
    @ManyToOne(optional = true , cascade = CascadeType.PERSIST)
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, int maxGoles) {
        this.nombre = nombre;
        this.maxGoles = maxGoles;
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

    public int getMaxGoles() {
        return maxGoles;
    }

    public void setMaxGoles(int maxGoles) {
        this.maxGoles = maxGoles;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", maxGoles=" + maxGoles + '}';
    }
    
    
    
    
    
}
