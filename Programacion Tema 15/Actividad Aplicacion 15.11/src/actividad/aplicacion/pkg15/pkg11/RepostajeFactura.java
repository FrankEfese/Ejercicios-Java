package actividad.aplicacion.pkg15.pkg11;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.persistence.*;

@Entity
public class RepostajeFactura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Temporal(TemporalType.TIME)
    private Date hora;

    private double importe;
    private String dni;
    private String matricula;

    public RepostajeFactura() {
    }

    public RepostajeFactura(Date fecha, Date hora, double importe, String dni, String matricula) {
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
        this.dni = dni;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "RepostajeFactura{" + "id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", importe=" + importe + ", dni=" + dni + ", matricula=" + matricula + '}';
    }
    
    

}
