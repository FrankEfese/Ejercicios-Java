package actividad.resuelta.pkg6.pkg10;

//Realizar un programa que lea una frase del teclado y nos indique si es palindroma. 
import java.util.*;

public class ActividadResuelta610 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase : ");
        String frase = sc.nextLine();

        frase = frase.toLowerCase();

        String palin = "";
        String fraseSinEspacios = "";

        for (int x = frase.length() - 1; x >= 0; x--) {
            if (!Character.isSpaceChar(frase.charAt(x))) {
                palin += frase.charAt(x);
            }

        }

        for (int x = 0; x < frase.length(); x++) {
            if (!Character.isSpaceChar(frase.charAt(x))) {
                fraseSinEspacios += frase.charAt(x);
            }

        }

        System.out.println(fraseSinEspacios);
        System.out.println(palin);
        if (fraseSinEspacios.equals(palin)) {
            System.out.println("ES PALINDROMA");
        } else {
            System.out.println("NO ES PALINDROMA");
        }

    }

}
