package actividad.aplicacion.pkg9.pkg24;

//Implementar la clase Lista para elementos Object : 
//-void ordenar () que ordena la lista con el orden natural de sus elementos. 
//-void ordenar(Comparator) . 
import java.util.*;

public class ActividadAplicacion924 {

    public static void main(String[] args) {

        Object tabla[] = new Object[0];

        Lista l = new Lista(tabla);
        l.insertarFinal(3);
        l.insertarFinal(1);
        l.ordenar();
        System.out.println(l.toString());

    }

}
