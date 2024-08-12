package actividad.resuelta.pkg6.pkg14;

//Implementar el juego del anagrama , que consiste en que el jugador escribe una palabra y 
//la app muestra un anagrama generado al azar. Otro jugador tiene que acertar cual es el texto original. 
import java.util.*;

public class ActividadResuelta614 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra : ");
        String p;
        String prueba;
        do {
            p = sc.nextLine().toLowerCase();
        } while (p.length() == 0);

        char tabla[] = desordenada(p);

        do {
            System.out.println(Arrays.toString(tabla));
            System.out.println("\nCual es la palabra : ");
            prueba = sc.nextLine();

        } while (!prueba.equals(p));

        System.out.println("CORRECTO");

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
}
