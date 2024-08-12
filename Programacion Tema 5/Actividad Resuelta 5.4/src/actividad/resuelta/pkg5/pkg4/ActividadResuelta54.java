package actividad.resuelta.pkg5.pkg4;

//Diseñar la funcion int max (int t[]) que devuelve el maximo valor de la tabla. 
import java.util.*;

public class ActividadResuelta54 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabla[] = new int[5];

        for (int x = 0; x < tabla.length; x++) {

            System.out.println("Introduce un numero : ");
            tabla[x] = sc.nextInt();
        }

        System.out.println("El valor maximo de la tabla es : " + numMax(tabla));

    }

    static int numMax(int tabla[]) {

        int max = 0;

        for (int x : tabla) {

            max = max > x ? max : x;

        }

        return max;

    }

}
