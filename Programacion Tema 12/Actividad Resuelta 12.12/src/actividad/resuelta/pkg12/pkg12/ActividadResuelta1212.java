package actividad.resuelta.pkg12.pkg12;

//Implementa un metodo estatico que lleve a cabo la union de dos conjuntos de elementos
//genericos. La union es un nuevo conjunto con todos los elementos , que pertenezcan al menos
//a uno de los dos conjuntos. 
import java.util.*;

public class ActividadResuelta1212 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        
        lista.add(3);
        lista.add(4);
        lista.add(7);
        lista.add(9);
        lista.add(1);
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        lista2.add(9);

        ArrayList<Integer> listaFinal = new ArrayList<>(union(lista, lista2));
        System.out.println(listaFinal);
        ArrayList<Integer> listaFinal3 = new ArrayList<>(interseccion(lista, lista2));
        System.out.println(listaFinal3);

    }

    static <T> Set<T> union(ArrayList<T> l, ArrayList<T> l2) {

        Set<T> lista = new TreeSet<>(l);
        lista.addAll(l2);

        return lista;

    }

    static <T> Set<T> interseccion(ArrayList<T> l, ArrayList<T> l2) {

        Set<T> lista = new TreeSet<>(l);

        lista.retainAll(l2);

        return lista;

    }

}
