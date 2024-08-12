package actividad.aplicacion.pkg12.pkg13;

//Repite la act anterior ordenando los numeros de mayor a menor. 
import java.util.*;

public class ActividadAplicacion1213 {

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
