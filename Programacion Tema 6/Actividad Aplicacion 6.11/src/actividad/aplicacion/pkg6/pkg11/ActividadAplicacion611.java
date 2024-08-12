package actividad.aplicacion.pkg6.pkg11;

//Escribe un programa descodificador que muestre un texto codificado con el 
//programa realizado en la Act Resuelta 6.11
import java.util.*;

public class ActividadAplicacion611 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char conjunto[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        System.out.println("Introduce una palabra : ");
        String palabra = sc.nextLine().toLowerCase();

        char resultado[] = new char[palabra.length()];
        for (int x = 0; x < palabra.length(); x++) {

            char c = palabra.charAt(x);
            resultado[x] = letra(conjunto, conjunto2, c);

        }

        System.out.println(Arrays.toString(resultado));

    }

    static char letra(char t[], char m[], char l) {

        int pos = -1;

        for (int x = 0; x < m.length; x++) {

            if (m[x] == l) {
                pos = x;
            }

        }

        if (pos < 0) {

            return l;
        } else {

            return t[pos];

        }
    }

}
