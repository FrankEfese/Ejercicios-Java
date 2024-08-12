package actividad.aplicacion.pkg6.pkg20;

//Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de forma alfabetica. 
//Suponemos que cada palabra de la frase se separa de otra por un unico espacio. 
import java.util.*;

public class ActividadAplicacion620 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase : ");
        String frase = sc.nextLine();
        String tabla[] = new String[0];
        String p = "";

        for (int x = 0; x < frase.length(); x++) {

            if (!Character.isSpaceChar(frase.charAt(x))) {
                p += frase.charAt(x);
            } else {
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = p;
                p = "";

            }

        }

        // Agregar la última palabra al array
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = p;

        Arrays.sort(tabla);

        System.out.println(Arrays.toString(tabla));
    }

}
