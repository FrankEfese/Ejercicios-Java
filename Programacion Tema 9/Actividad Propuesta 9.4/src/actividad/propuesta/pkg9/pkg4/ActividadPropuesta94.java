package actividad.propuesta.pkg9.pkg4;

//Crea e inicializa una tabla de Socios , ordenala por orden alfabetico
//de nombres y muestrala por consola. 
import java.time.LocalDate;
import java.util.*;

public class ActividadPropuesta94 {

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

        Arrays.sort(tabla);
        System.out.println(Arrays.deepToString(tabla));
    }

}
