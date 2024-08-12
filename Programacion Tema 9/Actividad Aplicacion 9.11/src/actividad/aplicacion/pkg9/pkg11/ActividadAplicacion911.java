package actividad.aplicacion.pkg9.pkg11;

//Implementar la clase Lista para almacenar elementos de tipo String. 
import java.util.*;

public class ActividadAplicacion911 {

    public static void main(String[] args) {

        String tabla[] = new String[0];

        Lista l = new Lista(tabla);
        l.insertarFinal("Hola");
        l.insertarAlPrincipio("adios");
        System.out.println(l.toString());
    }

}
