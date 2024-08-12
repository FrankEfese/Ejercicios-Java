package actividad.propuesta.pkg15.pkg9;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Ajedrezista implements Serializable {

    @Id
    private String dni;
    private String nombre;
    private int telefono;
    
   
    

    public Ajedrezista() {
    }

    public Ajedrezista(String dni, String nombre, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Ajedrezista{" + "dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }

}
