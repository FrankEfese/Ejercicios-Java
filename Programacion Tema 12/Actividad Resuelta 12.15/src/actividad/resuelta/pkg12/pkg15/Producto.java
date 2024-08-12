package actividad.resuelta.pkg12.pkg15;

import java.io.Serializable;

public class Producto implements Serializable{

    String nombre;
    int stock;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", stock=" + stock + '}';
    }

}
