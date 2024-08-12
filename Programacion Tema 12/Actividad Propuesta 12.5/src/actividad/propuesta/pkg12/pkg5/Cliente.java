package actividad.propuesta.pkg12.pkg5;

public class Cliente implements Comparable<Cliente> {

    int dni;
    String nombre;
    int edad;

    public Cliente(int dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Cliente o) {

        return this.edad - o.edad;
    }

}
