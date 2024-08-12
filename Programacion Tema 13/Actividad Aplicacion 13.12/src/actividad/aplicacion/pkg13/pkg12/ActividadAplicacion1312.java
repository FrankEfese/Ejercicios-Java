package actividad.aplicacion.pkg13.pkg12;

//A partir de una lista con los enteros del 1 al 100 , crea un Stream con los multiplos
//de 7 . Muestra por pantalla. 
import java.util.*;

public class ActividadAplicacion1312 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        for (int x = 1; x <= 100; x++) {
            lista.add(x);
        }

        lista.stream().sorted().filter(x -> x % 7 == 0).forEach(x -> System.out.println(x));

    }

}
