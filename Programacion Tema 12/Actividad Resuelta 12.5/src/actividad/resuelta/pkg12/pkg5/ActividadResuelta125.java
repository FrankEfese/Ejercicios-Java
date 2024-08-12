package actividad.resuelta.pkg12.pkg5;

//Implementar una app en la que se insertan 20 numeros enteros aleatorios entre 1 y 10 incluidos
//que pueden estar repetidos. A continuacion se crea una nueva lista sin repetidos. 
import java.util.*;

public class ActividadResuelta125 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 20; x++) {
            lista.add((int) (Math.random() * 10 + 1));
        }

        ArrayList<Integer> lista2 = new ArrayList<>();
        System.out.println(lista);

        for (Integer a : lista) {

            if (!lista2.contains(a)) {
                lista2.add(a);
            }

        }

        System.out.println(lista2);
    }

}
