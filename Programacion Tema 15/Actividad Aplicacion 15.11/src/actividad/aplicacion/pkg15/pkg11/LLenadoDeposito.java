package actividad.aplicacion.pkg15.pkg11;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class LLenadoDeposito implements Serializable {

    public enum tipoComb {
        GASOIL, DIESEL, GASOLINA
    };

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private int cantLitros;

    @Enumerated
    private tipoComb tipo;
    private double importe;

    public LLenadoDeposito() {
    }

    public LLenadoDeposito(int cantLitros, tipoComb tipo, double importe) {
        this.cantLitros = cantLitros;
        this.tipo = tipo;
        this.importe = importe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantLitros() {
        return cantLitros;
    }

    public void setCantLitros(int cantLitros) {
        this.cantLitros = cantLitros;
    }

    public tipoComb getTipo() {
        return tipo;
    }

    public void setTipo(tipoComb tipo) {
        this.tipo = tipo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "LLenadoDeposito{" + "id=" + id + ", cantLitros=" + cantLitros + ", tipo=" + tipo + ", importe=" + importe + '}';
    }
    
    
    
    

}
