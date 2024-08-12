package actividad.aplicacion.pkg9.pkg26;

//Repetir la act anterior con elementos de tipo Socio cuyo orden natural es la edad. 
import java.time.LocalDate;
import java.util.*;

public class ActividadAplicacion926 {

    public static void main(String[] args) {

        Socio a = new Socio(1111, "Pepe", 23);
        Socio b = new Socio(123, "Raul", 44);
        Socio c = new Socio(311, "Aose", 221);
        Socio d = new Socio(123, "Zorro", 11);
        Socio e = new Socio(151, "Bueno", 66);
        Object tabla[] = new Object[0];

        Lista l = new Lista(tabla);
        l.insertarFinal(a);
        l.insertarFinal(b);
        l.insertarFinal(c);
        l.insertarFinal(d);
        l.insertarFinal(e);

        l.ordenar();
        System.out.println(l.toString());
    }

}
