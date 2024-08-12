package actividad.resuelta.pkg6.pkg9;

//Introducir por teclado una frase palabra a palabra  y mostrar la frase completa 
//separando las palabras introducidas con espacios en blanco. Terminar introduciendo fin. 
import java.util.*;

public class ActividadResuelta69 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase = "";
        String p = "";

        do {
            System.out.println("Introduce palabras (fin para terminar) : ");
            p = sc.nextLine();

            if (!p.equalsIgnoreCase("fin")) {
                frase += p;
                frase += " ";

            }

        } while (!p.equalsIgnoreCase("fin"));

        System.out.println("\n" + frase);
    }

}
