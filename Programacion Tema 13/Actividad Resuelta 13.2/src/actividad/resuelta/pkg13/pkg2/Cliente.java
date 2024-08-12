package actividad.resuelta.pkg13.pkg2;

public class Cliente {

    String nombre;
    String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + '}';
    }

}
