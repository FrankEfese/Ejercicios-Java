package actividad.aplicacion.pkg13.pkg23;

//Implementa un programa que a partir de dos listas de enteros ordenadas en sentido creciente, 
//se obtenga una unica lista tambien ordenada . Las listas utilizadas deben seguir intactas. 
import java.util.*;
import java.util.stream.Stream;

public class ActividadAplicacion1323 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        for (int x = 0; x < 15; x++) {

            lista.add((int) (Math.random() * 30 + 1));
            lista2.add((int) (Math.random() * 30 + 1));
        }
        Collections.sort(lista);
        Collections.sort(lista2);

        System.out.println("Lista 1 : ");
        System.out.println(lista);
        System.out.println("");
        System.out.println("Lista 2 : ");
        System.out.println(lista2);
        System.out.println("");
        System.out.println("Lista Fuison : ");

        List<Integer> fusion = Stream.concat(lista.stream(), lista2.stream()).sorted().toList();

        System.out.println(fusion);

    }

}
