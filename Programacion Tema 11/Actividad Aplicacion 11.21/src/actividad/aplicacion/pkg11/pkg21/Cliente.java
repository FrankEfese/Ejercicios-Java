package actividad.aplicacion.pkg11.pkg21;

import java.io.Serializable;

public class Cliente implements Serializable {

    int id;
    String nombre;
    int telefono;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    

    
    
}
