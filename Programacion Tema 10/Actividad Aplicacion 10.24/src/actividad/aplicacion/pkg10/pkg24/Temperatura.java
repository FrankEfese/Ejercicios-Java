package actividad.aplicacion.pkg10.pkg24;

import java.time.LocalDate;

public class Temperatura {

    LocalDate fecha;
    int max;
    int min;

    public Temperatura(LocalDate fecha, int max, int min) {
        this.fecha = fecha;
        this.max = max;
        this.min = min;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "fecha=" + fecha + ", max=" + max + ", min=" + min + '}';
    }

}
