package actividad.propuesta.pkg9.pkg5;

//Define una clase comparadora que ordene los socios por orden alfabetico de nombres. 
import java.time.LocalDate;
import java.util.*;

public class ActividadPropuesta95 {

    public static void main(String[] args) {

        Socio a = new Socio(1111, "Pepe", LocalDate.now());
        Socio b = new Socio(123, "Raul", LocalDate.now());
        Socio c = new Socio(311, "Aose", LocalDate.now());
        Socio d = new Socio(123, "Zorro", LocalDate.now());
        Socio e = new Socio(151, "Bueno", LocalDate.now());

        Socio tabla[] = new Socio[5];
        tabla[0] = a;
        tabla[1] = b;
        tabla[2] = c;
        tabla[3] = d;
        tabla[4] = e;

        Arrays.sort(tabla, new OrdenPorNombre());
        System.out.println(Arrays.deepToString(tabla));
    }

}
