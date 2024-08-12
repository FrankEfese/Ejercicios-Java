package actividad.resuelta.pkg13.pkg8;

//Definir la interfaz Funcion2 con el metodo U operar(T a , V b). Implementa el metodo estatico
//static <T,V,U> al que se le pasan dos tablas y devuelve otra aplicando la funcion. 
//Añadir a Calculos el metodo producto() que devuelve el producto de dos valores. El metodo
//operar para multiplicar los valores de dos tablas de tipo Double.
import java.util.*;
import java.util.function.Function;

public class ActividadResuelta138 {

    public static void main(String[] args) {

        Double tabla[] = new Double[10];
        Double tabla2[] = new Double[10];

        for (int x = 0; x < tabla.length; x++) {
            tabla[x] = (double) x;
            tabla2[x] = (double) x;
        }

        System.out.println(Arrays.toString(productos(tabla, tabla2, new Double[0], Calculos::producto)));

    }

    static <T, V, U> U[] productos(T tabla[], V tabla2[], U tabla3[], Funcion2<T, V, U> f) {

        if (tabla.length == tabla2.length) {

            tabla3 = Arrays.copyOf(tabla3, tabla.length);

            for (int x = 0; x < tabla.length; x++) {

                tabla3[x] = f.operar(tabla[x], tabla2[x]);

            }
        } else {
            tabla3 = null;
        }

        return tabla3;
    }

}
