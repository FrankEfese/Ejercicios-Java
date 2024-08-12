package actividad.resuelta.pkg9.pkg9;

import java.util.Comparator;

public class OrdenEdadesDecre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Socio a = (Socio) o1;
        Socio b = (Socio) o2;

        return b.edad() - a.edad();
    }

}
