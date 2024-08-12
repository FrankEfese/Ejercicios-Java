package actividad.resuelta.pkg12.pkg7;

//Repetir la act resuelta 12.6 usando metodos globales. 
import java.util.*;

public class ActividadResuelta127 {

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
