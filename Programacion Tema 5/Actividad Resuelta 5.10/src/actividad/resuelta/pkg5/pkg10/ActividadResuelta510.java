package actividad.resuelta.pkg5.pkg10;

//Escribe una funcion que crea y devuelve una copia de t donde se han eliminado 
//todos los elementos que son mayores que v. 
import java.util.*;

public class ActividadResuelta510 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabla[] = new int[10];
        for (int x = 0; x < 10; x++) {
            System.out.println("Introduce un numero : ");
            int n = sc.nextInt();
            tabla[x] = n;
        }

        System.out.println("Introduce un valor : ");
        int v = sc.nextInt();

        System.out.println(Arrays.toString(tabla));

        tabla = menoresQueV(tabla, v);
        System.out.println(Arrays.toString(tabla));
    }

    static int[] menoresQueV(int t[], int v) {

        int tabla[] = new int[0];

        for (int a : t) {

            if (a < v) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = a;

            }

        }

        return tabla;

    }
}
