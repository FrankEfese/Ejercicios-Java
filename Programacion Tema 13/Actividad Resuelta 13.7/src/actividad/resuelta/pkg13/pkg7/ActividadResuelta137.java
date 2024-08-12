package actividad.resuelta.pkg13.pkg7;

//Añadir a la clase Claculos el metodo static Double raiz3(double x) que calcula la raiz cubica de x. 
//Usar el metodo transformar para obtener una tabla con las raices cubicas. 
import java.util.*;
import java.util.function.Function;

public class ActividadResuelta137 {

    public static void main(String[] args) {

        Double[] numeros = new Double[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = (double) i + 1;
        }

        System.out.println(Arrays.toString(raices(numeros, new Double[0], Calculos::raiz3)));

    }

    static <T, V> V[] raices(T tabla[], V tabla2[], Function<T, V> f) {

        tabla2 = Arrays.copyOf(tabla2, tabla.length);

        for (int x = 0; x < tabla.length; x++) {

            tabla2[x] = f.apply(tabla[x]);

        }

        return tabla2;

    }
}
