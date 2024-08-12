package actividad.aplicacion.pkg12.pkg13;

import java.util.Comparator;

public class OrdenDecre implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        return o2 - o1;

    }

}
