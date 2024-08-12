package actividad.aplicacion.pkg13.pkg15;

//Repetir la act anterior pero en vez de mostrar , construir una cadena 
//con las palabras de mas de 3 letras. 
import java.util.*;
import java.util.stream.Collectors;

public class ActividadAplicacion1315 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase de palabras separadas por un espacio : ");
        String frase = sc.nextLine();
        Scanner s = new Scanner(frase);
        List<String> lista = new ArrayList<>();

        while (s.hasNext()) {

            lista.add(s.next());

        }

        String p = lista.stream().sorted().filter(x -> x.length() > 3).collect(Collectors.joining(","));
        System.out.println(p);

    }

}
