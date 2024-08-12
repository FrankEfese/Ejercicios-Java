package actividad.aplicacion.pkg12.pkg24;

//Implementa una funcion a la que se le pasa 2 listas ordenadas en sentido creciente y 
//nos devuelve una unica lista tambien ordenada. Las listas pasadas se mantengan intactas. 
import java.util.*;

public class ActividadAplicacion1224 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        for (int x = 0; x < 15; x++) {

            lista.add((int) (Math.random() * 40 + 1));

        }
        Collections.sort(lista);
        System.out.println(lista);

        for (int x = 0; x < 15; x++) {

            lista2.add((int) (Math.random() * 40 + 1));

        }
        Collections.sort(lista2);
        System.out.println(lista2);

        ArrayList<Integer> listaDefinitiva = fusion(lista, lista2);
        System.out.println(listaDefinitiva);
    }

    static ArrayList<Integer> fusion(ArrayList<Integer> l, ArrayList<Integer> m) {

        ArrayList<Integer> p = new ArrayList<>();
        p.addAll(l);
        p.addAll(m);
        Collections.sort(p);
        return p;

    }

}
