package actividad.resuelta.pkg11.pkg9;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Temperatura implements Serializable {

    double temp;
    LocalDateTime fecha;

    public Temperatura(double temp, LocalDateTime fecha) {
        this.temp = temp;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "temp=" + temp + ", fecha=" + fecha + '}';
    }

}
