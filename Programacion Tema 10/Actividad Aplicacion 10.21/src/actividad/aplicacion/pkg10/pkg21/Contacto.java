package actividad.aplicacion.pkg10.pkg21;

public class Contacto implements Comparable {
    
    String nombre;
    int telefono;
    
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    @Override
    public int compareTo(Object o) {
        Contacto c = (Contacto) o;
        
        if (this.nombre.equals(c.nombre)) {
            
            return this.telefono - c.telefono;
            
        } else {
            
            return this.nombre.compareTo(c.nombre);
        }
        
    }
    
}
