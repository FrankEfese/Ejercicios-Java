package actividad.aplicacion.pkg13.pkg14;

//A partir de una cadena con palabras separadas por espacios introducida por teclado
//construye una tabla con las palabras. A partir de ella crea un Stream con las palabras
//ordenadas por orden alfabetico y muestrala. 
import java.util.*;
import java.util.stream.Stream;

public class ActividadAplicacion1314 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase con palabras separadas por un espacio : ");
        String frase = sc.nextLine();
        Scanner s = new Scanner(frase);

        String tabla[] = new String[0];

        while (s.hasNext()) {

            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = s.next();

        }

        System.out.println("Palabras : ");
        Stream.of(tabla).sorted().forEach(c -> System.out.println(c));
    }

}
