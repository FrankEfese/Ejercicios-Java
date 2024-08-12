package actividad.aplicacion.pkg9.pkg20;

import java.util.Comparator;

public class Comparador implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Socio a = (Socio) o1;
        Socio b = (Socio) o2;

        if (a.edad == b.edad) {

            return a.id - b.id;

        } else {
            return a.edad - b.edad;
        }

    }

}
