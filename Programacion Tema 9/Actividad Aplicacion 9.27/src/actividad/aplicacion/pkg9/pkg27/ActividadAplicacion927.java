package actividad.aplicacion.pkg9.pkg27;

//Manteniendo el mismo orden natural de la clase Socio por edades , ordenar por nombre. 
import java.util.*;

public class ActividadAplicacion927 {

    public static void main(String[] args) {

        Socio a = new Socio(1111, "Pepe", 23);
        Socio b = new Socio(123, "Raul", 44);
        Socio c = new Socio(311, "Xose", 23);
        Socio d = new Socio(123, "Zorro", 11);
        Socio e = new Socio(151, "Bueno", 66);
        Object tabla[] = new Object[0];

        Lista l = new Lista(tabla);
        l.insertarFinal(a);
        l.insertarFinal(b);
        l.insertarFinal(c);
        l.insertarFinal(d);
        l.insertarFinal(e);

        l.ordenar(new Comparador());
        System.out.println(l.toString());
    }
}
