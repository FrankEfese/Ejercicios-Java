package actividad.resuelta.pkg9.pkg9;

//A partir del comparador de Socios basado en las edades crecientes , obtener otro 
//que los ordene segun edades decrecientes. 
import java.time.LocalDate;
import java.util.*;

public class ActividadResuelta99 {

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

        Arrays.sort(tabla, new OrdenEdadesDecre());
        System.out.println(Arrays.deepToString(tabla));
    }

}
