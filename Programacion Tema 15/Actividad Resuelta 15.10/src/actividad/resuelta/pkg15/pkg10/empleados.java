package actividad.resuelta.pkg15.pkg10;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class empleados implements Serializable {

    @Id
    private int id;
    private String nombre;
    private int edad;
    private String puesto;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date contrato;
    private int oficina;
    private double sueldo;

    public empleados(int id, String nombre, int edad, String puesto, Date contrato, int oficina, int sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.contrato = contrato;
        this.oficina = oficina;
        this.sueldo = sueldo;
    }

    public empleados() {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getContrato() {
        return contrato;
    }

    public void setContrato(Date contrato) {
        this.contrato = contrato;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    @Override
    public String toString() {
        return "empleados{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", puesto=" + puesto + ", contrato=" + contrato + ", oficina=" + oficina + ", sueldo=" + sueldo + '}';
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
