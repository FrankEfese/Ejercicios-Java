package actividad.resuelta.pkg12.pkg6;

//Implementar una app donde se insertan 100 numeros enteros entre 1 y 10 incluidos. 
//Despues se eliminan todos los 5. 
import java.util.*;

public class ActividadResuelta126 {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 100; x++) {
            lista.add((int) (Math.random() * 10 + 1));
        }

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(5);
        System.out.println(lista);
        lista.removeAll(lista2);
        System.out.println(lista);
    }

}
