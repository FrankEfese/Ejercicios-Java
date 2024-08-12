package actividad.propuesta.pkg5.pkg5;

//Escribe en una funcion el comportamiento de la insercion ordenada. 
import java.util.*;

public class ActividadPropuesta55 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabla[] = new int[0];

        for (int x = 0; x < 10; x++) {
            System.out.println("Introduce un numero : ");
            int n = sc.nextInt();

            tabla = inserccion(tabla, n);
            System.out.println(Arrays.toString(tabla));

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
