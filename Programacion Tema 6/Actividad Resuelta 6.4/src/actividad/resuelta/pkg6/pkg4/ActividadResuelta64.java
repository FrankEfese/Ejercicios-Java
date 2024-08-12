package actividad.resuelta.pkg6.pkg4;

//Diseñar una app que pida al usuario que introduzca una frase por teclado
//e indique cuantos espacios en blanco tiene. 
import java.util.*;

public class ActividadResuelta64 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase : ");
        String frase = sc.nextLine();
        int cont = 0;

        for (int x = 0; x < frase.length(); x++) {
            char c = frase.charAt(x);
            if (Character.isSpaceChar(c)) {
                cont++;
            }
        }

        System.out.println("La frase tiene una cantidad de Espacios : " + cont);
    }

}
