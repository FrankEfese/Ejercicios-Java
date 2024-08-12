package actividad.resuelta.pkg5.pkg9;

//Diseñar una aplicacion para gestionar un campeonato de programacion , donde se introduce 
//la puntuacion enteros obtenidos por 5 programadores , conforme van terminando su prueba . La aplicacion debe mostrar 
//las puntuaciones ordenadas de los 5. En ocasiones , cuando finalizan los 5 , se suman al campeonato prog de exhibicion,
//cuyos puntos se incluyen con el resto. La forma de especificar que no intervienen mas prog de exhib es introducir un -1. 
//La app debe mostrar los puntos ordenados . 
import java.util.*;

public class ActividadResuelta59 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tablaProg[] = new int[0];

        for (int x = 0; x < 5; x++) {

            System.out.println("Introduce tu Puntuacion : ");
            int p = sc.nextInt();
            tablaProg = inserccion(tablaProg, p);

        }

        System.out.println("Puntajes : " + Arrays.toString(tablaProg));

        int puntEx = 0;

        System.out.println("\nVamos con los de Exhibicion  (Pulsa -1 para terminar ) : ");

        do {

            System.out.println("Introduce la puntuacion : ");
            puntEx = sc.nextInt();

            if (puntEx != -1) {

                tablaProg = inserccion(tablaProg, puntEx);
            }
        } while (puntEx != -1);

        System.out.println("\nPUNTAJES : ");
        for (int x = tablaProg.length - 1; x >= 0; x--) {

            System.out.println(tablaProg[x]);
        }

    }

    static int[] inserccion(int t[], int n) {

        int ordenada[] = t;
        int aux[] = new int[0];

        if (ordenada.length == 0) {
            ordenada = Arrays.copyOf(ordenada, ordenada.length + 1);
            ordenada[ordenada.length - 1] = n;

            return ordenada;
        } else {
            int pos = Arrays.binarySearch(ordenada, n);

            if (pos >= 0) {

                for (int x = 0; x < pos; x++) {

                    aux = Arrays.copyOf(aux, aux.length + 1);
                    aux[aux.length - 1] = ordenada[x];

                }

                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length - 1] = n;

                for (int x = pos; x < ordenada.length; x++) {
                    aux = Arrays.copyOf(aux, aux.length + 1);
                    aux[aux.length - 1] = ordenada[x];

                }

                return aux;

            } else {
                pos = -pos - 1;

                for (int x = 0; x < pos; x++) {

                    aux = Arrays.copyOf(aux, aux.length + 1);
                    aux[aux.length - 1] = ordenada[x];

                }

                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length - 1] = n;

                for (int x = pos; x < ordenada.length; x++) {
                    aux = Arrays.copyOf(aux, aux.length + 1);
                    aux[aux.length - 1] = ordenada[x];

                }

                return aux;
            }

        }
    }
}
