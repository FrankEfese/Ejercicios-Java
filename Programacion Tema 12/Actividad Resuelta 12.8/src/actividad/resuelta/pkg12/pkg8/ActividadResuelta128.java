package actividad.resuelta.pkg12.pkg8;

//Implementar un programa en el que se insertan 20 numeros aleatorios , se convertira en tabla ,
//se volvera a convertir en lista. 
import java.util.*;

public class ActividadResuelta128 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 20; x++) {
            lista.add((int) (Math.random() * 30 + 1));
        }

        System.out.println(lista);

        Integer tabla[] = lista.toArray(new Integer[0]);
        Arrays.sort(tabla);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.addAll(Arrays.asList(tabla));
        Collections.sort(lista2, Collections.reverseOrder());
        System.out.println(lista2);

    }

}
