package actividad.aplicacion.pkg8.pkg17;

//Escribe la clase Cola heredando de Lista. 
import java.util.*;

public class ActividadAplicacion817 {

    public static void main(String[] args) {

        Cola c = new Cola();
        c.insertarFinal(4);
        c.insertarFinal(12);
        c.insertarFinal(1);
        System.out.println(c.toString());
        c.eliminarParametro();
        System.out.println(c.toString());
    }

}
