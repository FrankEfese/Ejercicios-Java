package actividad.aplicacion.pkg15.pkg12;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Taxi implements Serializable {

    @Id
    private String matricula;

    private double precio;
    private int numPlazas;

    @OneToOne(optional = true , mappedBy = "taxi" , cascade = CascadeType.ALL )
    private Taxista taxista;

    public Taxi() {
    }

    public Taxi(String matricula, double precio, int numPlazas ) {
        this.matricula = matricula;
        this.precio = precio;
        this.numPlazas = numPlazas;
       
        
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public Taxista getTaxista() {
        return taxista;
    }

    public void setTaxista(Taxista taxista) {
        this.taxista = taxista;
    }

    @Override
    public String toString() {
        return "Taxi{" + "matricula=" + matricula + ", precio=" + precio + ", numPlazas=" + numPlazas + '}';
    }
    
    
    

}
