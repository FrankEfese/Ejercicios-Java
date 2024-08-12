package actividad.aplicacion.pkg14.pkg21;

import java.time.LocalDate;

public class Empleado {

    private int id;
    private String nombre;
    private int edad;
    private int oficina;
    private String puesto;
    private LocalDate fecha;

    public Empleado(int id, String nombre, int edad, int oficina, String puesto, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.oficina = oficina;
        this.puesto = puesto;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
