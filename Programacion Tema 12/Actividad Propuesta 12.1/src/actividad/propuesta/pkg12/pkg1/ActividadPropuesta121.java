package actividad.propuesta.pkg12.pkg1;

//Implementa un metodo generico estatico al que se le pasan como parametro dos tablas
//con elementos del mismo tipo y devuelve una nueva tabla con los elementos de ambas . 
import java.util.*;

public class ActividadPropuesta121 {

    public static void main(String[] args) {

        Integer tabla[] = {2, 5, 7};
        Integer tabla2[] = {56, 78};
        Integer tablaDefinitiva[] = new Integer[0];
        tablaDefinitiva = nuevaTabla(tabla, tabla2, tablaDefinitiva);
        System.out.println(Arrays.toString(tablaDefinitiva));

    }

    static <T> T[] nuevaTabla(T tabla[], T tabla2[], T tabla3[]) {

        for (T a : tabla) {

            tabla3 = Arrays.copyOf(tabla3, tabla3.length + 1);
            tabla3[tabla3.length - 1] = a;

        }

        for (T a : tabla2) {

            tabla3 = Arrays.copyOf(tabla3, tabla3.length + 1);
            tabla3[tabla3.length - 1] = a;

        }

        return tabla3;

    }

}
