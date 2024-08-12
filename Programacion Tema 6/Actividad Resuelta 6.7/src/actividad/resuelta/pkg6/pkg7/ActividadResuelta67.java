package actividad.resuelta.pkg6.pkg7;

//Diseñar un programa que solicite al usuario una frase y una palabra . A continuacion
//buscara cuantas veces aparece la palabra en la frase. 
import java.util.*;

public class ActividadResuelta67 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase : ");
        String frase = sc.nextLine();
        System.out.println("Introduce la palabra que deseas buscar : ");
        String palabra = sc.nextLine();

        int cont = 0;
        int pos = frase.indexOf(palabra);

        while (pos != -1) {

            cont++;

            pos = frase.indexOf(palabra, pos + palabra.length());

        }

        System.out.println("Veces que esta en la frase : " + cont);

    }

}
