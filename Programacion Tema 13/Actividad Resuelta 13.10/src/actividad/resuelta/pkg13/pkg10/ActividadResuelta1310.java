package actividad.resuelta.pkg13.pkg10;

//Repetir la act anterior pero en vez de mostrar los numeros devolver una lista y una tabla. 
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ActividadResuelta1310 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 100; x++) {
            lista.add((int) (Math.random() * 1000 + 1));
        }

        List<Integer> t = lista.stream().filter(x -> esPrimo(x)).sorted().collect(Collectors.toList());
        System.out.println(t);

        Integer tabla[] = lista.stream().filter(x -> esPrimo(x)).sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(tabla));
    }

    static boolean esPrimo(Integer n) {

        return n % 2 == 0;
    }

}
