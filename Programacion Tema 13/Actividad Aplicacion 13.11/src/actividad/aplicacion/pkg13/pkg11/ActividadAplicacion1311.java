package actividad.aplicacion.pkg13.pkg11;

//A partir de una lista de 100 enteros aleatorios menores que 1000 : 
//-Calcula cuantos son primos 
//-Determina cual es el mayor , menor y la suma de todos ellos y el valor promedio. 
import java.util.*;

public class ActividadAplicacion1311 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 100; x++) {

            lista.add((int) (Math.random() * 1000 + 1));
        }

        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("Cantidad de Primos : " + lista.stream().sorted().filter(x -> x % 2 == 0).count());
        System.out.println("El Mayor : " + lista.stream().sorted().max((a, b) -> a - b));
        System.out.println("El Menor : " + lista.stream().min((a, b) -> a - b));
        System.out.println("El Total : " + lista.stream().mapToInt(c -> c).sum());
        System.out.println("La Media : " + lista.stream().mapToInt(c -> c).average().getAsDouble());

    }

}
