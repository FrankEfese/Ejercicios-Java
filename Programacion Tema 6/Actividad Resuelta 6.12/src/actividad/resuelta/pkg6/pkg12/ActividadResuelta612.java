package actividad.resuelta.pkg6.pkg12;

//Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra . 
//Construir un programa que solicite al usuario dos palabras e indique si son anagramas . 
import java.util.*;

public class ActividadResuelta612 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra : ");
        String palabra = sc.nextLine().toLowerCase();
        System.out.println("Introduce otra palabra : ");
        String palabra2 = sc.nextLine().toLowerCase();
        anagrama(palabra, palabra2);

    }

    static void anagrama(String p, String p2) {

        char pala[] = p.toCharArray();
        char pala2[] = p2.toCharArray();
        int cont = 0;
        Arrays.sort(pala);
        Arrays.sort(pala2);

        if (pala.length != pala2.length) {
            System.out.println("\nNO SON ANAGRAMAS");

        } else {

            for (int x = 0; x < pala.length; x++) {

                if (pala[x] == pala2[x]) {
                    cont++;
                }

            }

            if (cont == pala.length) {
                System.out.println("SON ANAGRAMAS");
            } else {
                System.out.println("NO SON ANAGRAMAS");
            }

        }

    }
}
