package actividad.propuesta.pkg5.pkg6;

//Crea una funcion que realice el borrado de un elemento de una tabla ordenada. 
import java.util.*;

public class ActividadPropuesta56 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabla[] = new int[5];
        for (int x = 0; x < 5; x++) {
            System.out.println("Introduce un numero : ");
            int n = sc.nextInt();
            tabla[x] = n;
        }

        Arrays.sort(tabla);

        System.out.println("Introduce un valor que quieras borrar : ");
        int v = sc.nextInt();

        System.out.println(Arrays.toString(tabla));

        tabla = borrarV(tabla, v);
        System.out.println(Arrays.toString(tabla));

    }

    static int[] borrarV(int t[], int v) {

        int tabla[] = new int[0];

        int pos = Arrays.binarySearch(t, v);

        for (int x = 0; x < pos; x++) {

            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = t[x];

        }

        for (int x = pos + 1; x < t.length; x++) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = t[x];

        }

        return tabla;

    }
}
