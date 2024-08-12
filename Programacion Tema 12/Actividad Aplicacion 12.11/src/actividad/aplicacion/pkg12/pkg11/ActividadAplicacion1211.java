package actividad.aplicacion.pkg12.pkg11;

//Utilizando la clase Contenedor de la act resuelta 12.2 implementa una app donde se guardan 30 enteros
//aleatorios entre 1 y 10 y luego se ordenan de menor a mayor. La app debe mostrar el contenedor antes y despues. 
import java.util.*;

public class ActividadAplicacion1211 {

    public static void main(String[] args) {

        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        for (int x = 0; x < 30; x++) {

            c.insertarFinal((int) (Math.random() * 10 + 1));

        }

        System.out.println(c.toString());
        c.ordenar();
        System.out.println(c.toString());
    }

}
