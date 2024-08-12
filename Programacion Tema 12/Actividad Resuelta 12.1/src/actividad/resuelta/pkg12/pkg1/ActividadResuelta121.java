package actividad.resuelta.pkg12.pkg1;

//Implementa un metodo generico estatico que realice la insercion de un objeto al final
//de una tabla, ambos del mismo tipo generico, que se pasan como parametros . 
import java.util.*;

public class ActividadResuelta121 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer num[] = new Integer[0];
        num = insercion(num, 23);
        num = insercion(num, 23);
        num = insercion(num, 23);
        num = insercion(num, 34);
        System.out.println(Arrays.toString(num));

    }

    static <T> T[] insercion(T tabla[], T n) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = n;
        return tabla;

    }

}
