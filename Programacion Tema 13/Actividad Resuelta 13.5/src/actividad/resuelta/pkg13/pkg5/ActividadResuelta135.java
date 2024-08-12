package actividad.resuelta.pkg13.pkg5;

//Implementa el metodo static <T,V> transformar , al que se le pasan dos tablas de tipo T y V 
//y devuelve la segunda tabla con los elementos de la primera transformados mediante la funcion . 
//Obtener una tabla con las raices cuadradas de otra. 
import java.util.*;
import java.util.function.Function;

public class ActividadResuelta135 {

    public static void main(String[] args) {

        Integer[] numeros = new Integer[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = i + 1;
        }

        System.out.println(Arrays.toString(raices(numeros, new Double[0], z -> Math.sqrt(z))));
    }

    static <T, V> V[] raices(T tabla[], V tabla2[], Function<T, V> f) {

        tabla2 = Arrays.copyOf(tabla2, tabla.length);

        for (int x = 0; x < tabla.length; x++) {
            tabla2[x] = f.apply(tabla[x]);
        }

        return tabla2;
    }

}
