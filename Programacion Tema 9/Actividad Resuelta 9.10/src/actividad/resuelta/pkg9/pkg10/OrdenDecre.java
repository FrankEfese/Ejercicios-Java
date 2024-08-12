package actividad.resuelta.pkg9.pkg10;

import java.util.Comparator;

public class OrdenDecre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer a = (Integer) o1;
        Integer b = (Integer) o2;

        return b - a;
    }

}
