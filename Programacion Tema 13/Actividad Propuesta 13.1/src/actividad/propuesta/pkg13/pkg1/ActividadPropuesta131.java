package actividad.propuesta.pkg13.pkg1;

//Igual que la actividad anterior pero usando una lista. 
import java.util.*;
import java.util.function.Predicate;

public class ActividadPropuesta131 {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            l.add(i + 1);
        }

        System.out.println(multiplo(l, p -> p % 3 == 0));

    }

    static <T> List<T> multiplo(List<T> tabla, Predicate<T> p) {

        List<T> lista = new ArrayList<>();

        for (T a : tabla) {

            if (p.test(a)) {
                lista.add(a);
            }

        }

        return lista;
    }

}
