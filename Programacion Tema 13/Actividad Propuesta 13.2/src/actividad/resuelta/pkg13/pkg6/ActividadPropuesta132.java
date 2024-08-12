package actividad.resuelta.pkg13.pkg6;

//Repetir la actividad anterior pero usando una lista. 
import java.util.*;
import java.util.function.Function;

public class ActividadPropuesta132 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            l.add(i + 1);
        }

        System.out.println(raices(l, new ArrayList<Double>(), z -> Math.sqrt(z)));

    }

    static <T, V> List<V> raices(List<T> tabla, List<V> tabla2, Function<T, V> f) {

        for (T a : tabla) {
            tabla2.add(f.apply(a));
        }

        return tabla2;
    }

}
