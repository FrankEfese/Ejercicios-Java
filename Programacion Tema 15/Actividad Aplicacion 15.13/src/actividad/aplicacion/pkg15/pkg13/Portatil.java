package actividad.aplicacion.pkg15.pkg13;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Portatil implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    private String marca;
    private String modelo;
    
    @OneToOne(optional = true)
    Alumno alumno;

    public Portatil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Portatil() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Portatil{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    
}
