package actividad.resuelta.pkg7.pkg5;

public class Gestor {

    public String nombre;
    String telefono;
    int importeMax;

    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        importeMax = 10000;
    }

    public Gestor(String nombre, String telefono, int importeMax) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = importeMax;
    }

    @Override
    public String toString() {
        return "Gestor{" + "nombre=" + nombre + ", telefono=" + telefono + ", importeMax=" + importeMax + '}';
    }
    
    
    

}
