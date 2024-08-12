package actividad.aplicacion.pkg12.pkg12;

//Añade a la clase Contenedor el metodo void ordenar (Comparator <T> c) que ordena
//los elementos del contenedor segun el criterio de c. 
import java.util.*;

public class ActividadAplicacion1212 {

    public static void main(String[] args) {

        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        for (int x = 0; x < 30; x++) {

            c.insertarFinal((int) (Math.random() * 10 + 1));

        }

        System.out.println(c.toString());
        c.ordenar(new OrdenDecre());
        System.out.println(c.toString());
    }

}
