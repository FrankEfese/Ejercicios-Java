package actividad.aplicacion.pkg15.pkg12;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Taxista implements Serializable {

    @Id
    private String dni;

    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date fechaNac;

    @OneToOne( optional = true , cascade = CascadeType.ALL)
    Taxi taxi;

    public Taxista(String dni, String nombre, Date fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public Taxista() {
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    @Override
    public String toString() {
        return "Taxista{" + "dni=" + dni + ", nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
    }

}
