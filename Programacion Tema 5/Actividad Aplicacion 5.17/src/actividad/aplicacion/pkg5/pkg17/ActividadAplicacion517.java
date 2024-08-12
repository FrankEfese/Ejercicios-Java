package actividad.aplicacion.pkg5.pkg17;

//Implementa la funcion int [] suma (int t [] , int n) que crea y devuelve 
//una tabla con las sumas de los n elementos consecutivos de t. 
import java.util.*;

public class ActividadAplicacion517 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabla[] = new int[6];

        for (int x = 0; x < tabla.length; x++) {
            System.out.println("Introduce un numero : ");
            tabla[x] = sc.nextInt();
        }

        System.out.println("El numero de elementos que se van a sumar : ");
        int n = sc.nextInt();

        System.out.println(Arrays.toString(tabla));
        System.out.println("");
        tabla = suma(tabla, n);

        System.out.println(Arrays.toString(tabla));
    }

    static int[] suma(int t[], int n) {

        int tabla[] = new int[0];
        int aux = (t.length - n) + 1;

        int suma = 0;
        int cont = 0;

        if (t.length / n < 1) {
            System.out.println("ERROR");
        } else {

            while (aux > 0) {

                for (int x = cont; x < n; x++) {
                    suma += t[x];

                }

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = suma;

                suma = 0;
                cont++;
                n++;
                aux--;

            }

        }

        return tabla;

    }
}
