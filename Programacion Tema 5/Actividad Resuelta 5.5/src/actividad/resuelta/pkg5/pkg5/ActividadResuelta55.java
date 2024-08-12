package actividad.resuelta.pkg5.pkg5;

//Escribir la funcion int [] rellenaPares (int long , int fin) que crea y devuelve una 
//tabla ordenada de la longitud especificada, que se encuentra rellena con numeros pares 
//aleatorios comprendidos en el rango desde 2 hasta fin. 
import java.util.*;

public class ActividadResuelta55 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud de la tabla : ");
        int x = sc.nextInt();
        System.out.println("Introduce hasta que rango : ");
        int n = sc.nextInt();

        int pares[] = rellenaPares(x, n);

        System.out.println(Arrays.toString(pares));

    }

    static int[] rellenaPares(int longi, int rango) {

        int cont = 0;
        int tabla[] = new int[longi];

        do {

            int p = (int) (Math.random() * (rango - 1) + 2);

            if (p % 2 == 0) {

                tabla[cont] = p;
                cont++;
            }

        } while (cont < tabla.length);

        return tabla;

    }

}
