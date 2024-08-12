package actividad.resuelta.pkg13.pkg13;

public class Cliente {

    String nombre;
    int edad;
    String dni;

    public Cliente(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;

    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

}
