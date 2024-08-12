package actividad.resuelta.pkg6.pkg13;

//Diseñar un algoritmo que lea del teclado una frase e indique , para cada letra que aparece 
//en la frase , cuantas veces se repite. 
import java.util.*;

public class ActividadResuelta613 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] abecedario = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        System.out.println("Introduce una frase : ");
        String frase = sc.nextLine().toLowerCase();

        char fraseTabla[] = frase.toCharArray();
        int veces[] = new int[abecedario.length];
        int cont = 0;

        for (int x = 0; x < abecedario.length; x++) {
            for (int j = 0; j < fraseTabla.length; j++) {

                if (abecedario[x] == fraseTabla[j]) {
                    cont++;
                }

            }

            veces[x] = cont;
            cont = 0;
        }

        for (int x = 0; x < abecedario.length; x++) {

            System.out.println("La letra " + abecedario[x] + " aparece : " + veces[x]);
        }
    }

}
