package Personal;

public class Mecanico {

    enum Especialidad {
        Frenos, Hidraulica, Electricidad, Motor
    };
    String nombre;
    String telefono;
    Especialidad es;

    public Mecanico(String nombre, String telefono, Especialidad es) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.es = es;
    }

}
