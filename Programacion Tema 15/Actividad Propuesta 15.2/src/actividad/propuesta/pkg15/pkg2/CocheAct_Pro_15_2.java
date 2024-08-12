package actividad.propuesta.pkg15.pkg2;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class CocheAct_Pro_15_2 implements Serializable {

    @Id
    private String matricula;
    private String marca;
    private String modelo;
    private int numPlazas;

    public CocheAct_Pro_15_2() {
    }

    public CocheAct_Pro_15_2(String matricula, String marca, String modelo, int numPlazas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.numPlazas = numPlazas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public String toString() {
        return "CocheAct_Pro_15_2{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", numPlazas=" + numPlazas + '}';
    }

}
