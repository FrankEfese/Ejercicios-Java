package actividad.aplicacion.pkg12.pkg23;

//Repetir la act anterior manteniendo el orden alfabetico. 
import java.util.*;

public class ActividadAplicacion1223 {

    public static void main(String[] args) {

        TreeSet<String> lista = new TreeSet<>();
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
