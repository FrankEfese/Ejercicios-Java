package actividad.aplicacion.pkg9.pkg24;

import java.util.Comparator;

public class Comparador implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        int a = (int) o1;
        int b = (int) o1;

        return a - b;
    }

}
