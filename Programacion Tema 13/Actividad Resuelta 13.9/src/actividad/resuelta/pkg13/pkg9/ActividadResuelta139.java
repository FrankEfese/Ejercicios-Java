package actividad.resuelta.pkg13.pkg9;

//Implementa el metodo static boolean esPrimo(Integer n) que devuelve true o false si es primo.
//Escribir un programa que genere 100 numeros aleatorios menores que 1000 y muestre por pantalla todos los primos. 
//Ordenados de menor a mayor , de mayor a menor y los comprendidos entre 200 y 800. 
import java.util.*;
import java.util.stream.Stream;

public class ActividadResuelta139 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 100; x++) {
            lista.add((int) (Math.random() * 1000 + 1));
        }

        //PRIMOS
        lista.stream().filter(ActividadResuelta139::esPrimo).sorted().forEach(c -> System.out.println(c));
        System.out.println("");

        //ORDEN MENOR A MAYOR
        lista.stream()
                .filter(ActividadResuelta139::esPrimo)
                .sorted()
                .forEach(x -> System.out.println(x));

        System.out.println("");

        //ORDEN MAYOR A MENOR
        lista.stream()
                .filter(ActividadResuelta139::esPrimo)
                .sorted((a, b) -> {
                    return b - a;
                })
                .forEach(x -> System.out.println(x));

        System.out.println("");

        //ENTRE 200 Y 800
        lista.stream().filter(x -> (x >= 200 && x <= 800) && esPrimo(x)).sorted().forEach(c -> System.out.println(c));

    }

    static boolean esPrimo(Integer n) {

        return n % 2 == 0;
    }

}
