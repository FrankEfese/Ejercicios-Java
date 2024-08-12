package actividad.propuesta.pkg15.pkg9;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Torneo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String localidad;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "Campeon")
    private Ajedrezista jugador;

    public Torneo() {
    }

    public Torneo(String nombre, String localidad, Ajedrezista jugador) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.jugador = jugador;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Ajedrezista getJugador() {
        return jugador;
    }

    public void setJugador(Ajedrezista jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Torneo{" + "id=" + id + ", nombre=" + nombre + ", localidad=" + localidad + ", jugador=" + jugador + '}';
    }

}
