package actividad.resuelta.pkg12.pkg10;

//Insertar en una lista 20 enteros aleatorios entre 1 y 10. A partir de ella , crear un conjunto con los elementos de la lista 
//sin repetir , otro con los repetidos y otro con los elementos que solo aparecen una vez. 
import java.util.*;

public class ActividadResuelta1210 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 20; x++) {

            lista.add((int) (Math.random() * 10 + 1));
        }

        Collections.sort(lista);
        System.out.println(lista);

        TreeSet<Integer> sinRepes = new TreeSet<>();

        for (Integer z : lista) {
            sinRepes.add(z);
        }

        System.out.println(sinRepes);
        ArrayList<Integer> listaUnicos = new ArrayList<>();
        ArrayList<Integer> listaR = new ArrayList<>();

        for (int x = 0; x < lista.size(); x++) {
            int cont = 0;
            Integer num = lista.get(x);
            for (int j = 0; j < lista.size(); j++) {

                if (num == lista.get(j)) {
                    cont++;
                }

            }

            if (cont == 1) {
                listaUnicos.add(num);

            } else {
                if (!listaR.contains(num)) {
                    listaR.add(num);
                }
            }

        }

        System.out.println(listaUnicos);
        System.out.println(listaR);

    }

}
