package actividad.resuelta.pkg9.pkg8;

//Cambiar la implementacion de la clase Socio para que su criterio de ordenacion
//natural sea por orden alfabetico creciente de nombres. 
import java.time.LocalDate;
import java.util.*;

public class ActividadResuelta98 {

    public static void main(String[] args) {

        Socio a = new Socio(1111, "Pepe", LocalDate.now());
        Socio b = new Socio(123, "Raul", LocalDate.now());
        Socio c = new Socio(311111, "Aose", LocalDate.now());

        Socio tabla[] = new Socio[3];
        tabla[0] = a;
        tabla[1] = b;
        tabla[2] = c;

        Arrays.sort(tabla);
        System.out.println(Arrays.deepToString(tabla));

    }

}
