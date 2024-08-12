package actividad.aplicacion.pkg6.pkg16;

//Lee una palabra o frase y muestra el proceso en el que cada letra se sustituye 
//por otro simbolo no alfabetico. 
import java.util.*;

public class ActividadAplicacion616 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char conjunto[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char conjunto2[] = {'!', '@', '>', '$', '%', '&', '/', '#', '€', '=', '?'};

        System.out.println("Introduce una palabra : ");
        String palabra = sc.nextLine().toLowerCase();

        char resultado[] = palabra.toCharArray();

        letra(conjunto, conjunto2, resultado);

    }

    static void letra(char t[], char m[], char l[]) {

        int pos = -1;

        for (int x = 0; x < t.length; x++) {

            for (int j = 0; j < l.length; j++) {

                if (t[x] == l[j]) {
                    l[j] = m[x];
                    System.out.println("\n" + Arrays.toString(l));
                }

            }

        }

    }

}
