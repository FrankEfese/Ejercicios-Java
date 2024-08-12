package actividad.resuelta.pkg13.pkg12;

//Crea una lista con 40 numeros enteros aleatorios entre -20 y 20 . A partir de ella crear dos Stream , 
//uno con los positivos y otro con los negativos, todos ellos sin repetir. Mostrar por pantalla el numero de 
//elementos de cada Stream . Crea otro Stream para contar los numeros comprendidos entre -10 y 10 incluidos , sin repeticiones. 
import java.util.*;
import java.util.stream.Collectors;

public class ActividadResuelta1312 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 40; x++) {
            lista.add((int) (Math.random() * 41) - 20);

        }

        TreeSet<Integer> t = lista.stream()
                .filter(x -> x >= 0)
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(t);
        System.out.println("Numero de Elementos : " + t.size());

        TreeSet<Integer> t2 = lista.stream()
                .filter(x -> x < 0)
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(t2);
        System.out.println("Numero de Elementos : " + t2.size());

        long cont = lista.stream().filter(x -> x >= -10 && x <= 10).distinct().count();

        System.out.println("Numero de elementos entre 10 y -10 : " + cont);

    }

}
