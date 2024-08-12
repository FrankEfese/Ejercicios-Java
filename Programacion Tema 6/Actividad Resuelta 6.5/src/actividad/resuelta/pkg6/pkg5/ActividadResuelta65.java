package actividad.resuelta.pkg6.pkg5;

//Diseñar una funcion a la que se le pasa una cadena de caracteres y la devuelva invertida. 
import java.util.*;

public class ActividadResuelta65 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase : ");
        String frase = sc.nextLine();
        String inv = "";

        for (int x = frase.length() - 1; x >= 0; x--) {
            inv += frase.charAt(x);

        }

        System.out.println("La frase al reves : " + inv);
    }

}
