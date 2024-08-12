package actividad.aplicacion.pkg12.pkg15;

//Implementa un metodo generico al que se le pasa una lista de valores de la clase generica T 
//y devuelve otra donde se han eliminado las repeticiones. 
import java.util.*;

public class ActividadAplicacion1215 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 30; x++) {

            lista.add((int) (Math.random() * 10 + 1));

        }

        System.out.println(lista);
        Collection<Integer> sinRepes = noRepes(lista);
        System.out.println(sinRepes);

    }

    static <T> Collection<T> noRepes(Collection<T> l) {

        Collection<T> sinRepes = new LinkedHashSet<>(l);
        return sinRepes;

    }

}
