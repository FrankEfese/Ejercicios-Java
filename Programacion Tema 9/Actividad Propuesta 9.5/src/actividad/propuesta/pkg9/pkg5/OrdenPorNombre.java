package actividad.propuesta.pkg9.pkg5;

import java.util.Comparator;

public class OrdenPorNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Socio a = (Socio) o1;
        Socio b = (Socio) o2;
        return a.nombre.compareTo(b.nombre);
    }

}
