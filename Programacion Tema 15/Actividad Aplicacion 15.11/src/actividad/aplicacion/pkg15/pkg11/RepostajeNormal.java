package actividad.aplicacion.pkg15.pkg11;

import java.util.Date;
import javax.persistence.*;

@Entity
public class RepostajeNormal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Temporal(TemporalType.TIME)
    private Date hora;

    private double importe;

    public RepostajeNormal() {
    }

    public RepostajeNormal(Date fecha, Date hora, double importe) {
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
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

    @Override
    public String toString() {
        return "RepostajeNormal{" + "id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", importe=" + importe + '}';
    }

}
