package actividad.aplicacion.pkg12.pkg25;

import java.io.Serializable;
import java.time.LocalDate;


public class Socio implements Serializable {
    
    
    String nombre;
    LocalDate fecha;

    public Socio(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", fecha=" + fecha + '}';
    }

 
    
    
    
    
    
}
