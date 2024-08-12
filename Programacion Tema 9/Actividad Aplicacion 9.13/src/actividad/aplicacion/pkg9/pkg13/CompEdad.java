package actividad.aplicacion.pkg9.pkg13;

import java.util.Comparator;

public class CompEdad implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Futbolista f = (Futbolista) o1;
        Futbolista a = (Futbolista) o2;

        return f.edad - a.edad;
    }
}
