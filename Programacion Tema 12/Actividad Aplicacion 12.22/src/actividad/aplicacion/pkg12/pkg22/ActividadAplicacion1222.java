package actividad.aplicacion.pkg12.pkg22;

//Introduce por teclado hasta que se introduzca fin una serie de nombres , que se insertaran en 
//una coleccion , de forma que se conserve el orden de inserccion y que no puedan repetirse. 
//Al final se mostrara por pantalla. 
import java.util.*;

public class ActividadAplicacion1222 {

    public static void main(String[] args) {

        LinkedHashSet<String> lista = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nIntroducde un nombre (FIN para terminar) : ");
        String n = sc.nextLine().toUpperCase();

        while (!n.equals("FIN")) {

            lista.add(n);
            System.out.println("\nIntroducde un nombre (FIN para terminar) : ");
            n = sc.nextLine().toUpperCase();

        }

        System.out.println(lista);

    }

}
