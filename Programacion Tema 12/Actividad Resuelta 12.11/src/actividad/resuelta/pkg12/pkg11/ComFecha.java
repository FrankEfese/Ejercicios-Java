package actividad.resuelta.pkg12.pkg11;

import java.util.Comparator;

public class ComFecha implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {

        return o1.fecha.compareTo(o2.fecha);
    }

}
