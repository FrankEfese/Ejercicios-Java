package actividad.resuelta.pkg12.pkg16;

public class Academico implements Comparable<Academico> {

    String nombre;
    int fecha;

    public Academico(String nombre, int fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Academico{" + "nombre=" + nombre + ", fecha=" + fecha + '}';
    }

    @Override
    public int compareTo(Academico o) {

        return this.nombre.compareTo(o.nombre);
    }

}
