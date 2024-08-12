package actividad.resuelta.pkg6.pkg15;

//Modificar la Actividad Anterior para que el programa indique al jugador 2 cuantas letras coinciden . 
import java.util.*;

public class ActividadResuelta615 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra : ");
        String p;
        String prueba;
        do {
            p = sc.nextLine().toLowerCase();
        } while (p.length() == 0);

        char tabla[] = desordenada(p);
        resultado(tabla, p);

    }

    static char[] desordenada(String p) {

        char desordenada[] = p.toCharArray();
        char aux;

        for (int x = 0; x < 8; x++) {
            int i = (int) (Math.random() * (desordenada.length - 1) + 0);
            int c = (int) (Math.random() * (desordenada.length - 1) + 0);
            aux = desordenada[i];
            desordenada[i] = desordenada[c];
            desordenada[c] = aux;

        }

        return desordenada;
    }

    static void resultado(char t[], String p) {

        Scanner sc = new Scanner(System.in);

        char original[] = p.toCharArray();
        char c[] = new char[t.length];

        for (int x = 0; x < c.length; x++) {
            c[x] = '*';
        }
        String intento;
        System.out.println(Arrays.toString(t));

        do {

            System.out.println("\nCual crees que es la palabra : ");
            intento = sc.nextLine().toLowerCase();
            char i[] = intento.toCharArray();
            int max = Math.min(i.length, original.length);

            for (int x = 0; x < max; x++) {

                if (i[x] == original[x]) {
                    c[x] = i[x];
                }

            }

            System.out.println(Arrays.toString(c));
            for (int x = 0; x < c.length; x++) {
                c[x] = '*';
            }

        } while (!intento.equals(p));

        System.out.println("\nCORRECTO");

    }
}
