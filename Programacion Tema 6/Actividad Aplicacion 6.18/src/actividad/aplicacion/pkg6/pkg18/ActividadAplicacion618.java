package actividad.aplicacion.pkg6.pkg18;

//Escribe una app que convierte una frase en el nombre de una variable que utiliza 
//nomenclatura Camel. Cada palabra debe estar separada con un unico espacio. 
import java.util.*;

public class ActividadAplicacion618 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase : ");
        String frase = sc.nextLine().toLowerCase();
        String p = "";
        char c = frase.toUpperCase().charAt(0);
        p += c;

        for (int x = 1; x < frase.length(); x++) {

            if (Character.isSpaceChar(frase.charAt(x))) {
                x++;
                c = frase.toUpperCase().charAt(x);
                p += c;
            } else {
                p += frase.charAt(x);
            }
        }

        System.out.println(p);

    }

}
