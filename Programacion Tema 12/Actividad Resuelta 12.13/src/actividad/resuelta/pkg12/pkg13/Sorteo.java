package actividad.resuelta.pkg12.pkg13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Sorteo<T> {

    Set<T> lista;

    public Sorteo() {

        lista = new TreeSet<>();

    }

    boolean add(T n) {

        return lista.add(n);

    }

    Set<T> premio(int num) {

        Set<T> listaF = null;
        if (lista.size() <= num) {
            System.out.println("No hay suficientes numeros");
            return listaF;
        } else {
            listaF = new TreeSet<>();
            ArrayList<T> aux = new ArrayList<>(lista);
            Collections.shuffle(aux);
            for (int x = 0; x < num; x++) {
                listaF.add(aux.get(x));
            }

            return listaF;

        }

    }

    @Override
    public String toString() {
        return "Sorteo{" + "lista=" + lista + '}';
    }
    
    

}
