package actividad.propuesta.pkg12.pkg3;

//Repite la act anterior usando un iterador para eliminar los valores 5. 
import java.util.*;

public class ActividadPropuesta123 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 50; x++) {

            lista.add((int) (Math.random() * 50 + 1));

        }

        Iterator<Integer> it = lista.iterator();
        System.out.println(lista);

        while (it.hasNext()) {

            if (it.next() == 5) {
                it.remove();
            }

        }
        System.out.println(lista);

    }

}
