package actividad.resuelta.pkg13.pkg3;

public class Cliente {

    String nombre;
    int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    

}
