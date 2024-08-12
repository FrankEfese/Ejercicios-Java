package actividad.aplicacion.pkg9.pkg21;

//Repetir la actividad anterior con un criterio que ordene por fecha de nacimiento. 
import java.time.LocalDate;
import java.util.*;

public class ActividadAplicacion921 {

    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(2023, 10, 15);
        LocalDate fecha2 = LocalDate.of(2023, 6, 30);
        LocalDate fecha3 = LocalDate.of(2024, 2, 14);
        LocalDate fecha4 = LocalDate.parse("2023-09-01");
        LocalDate fecha5 = LocalDate.now().minusDays(7);

        Socio a = new Socio(1111, "Pepe", fecha1);
        Socio b = new Socio(123, "Raul", fecha2);
        Socio c = new Socio(311, "Aose", fecha3);
        Socio d = new Socio(123, "Zorro", fecha4);
        Socio e = new Socio(151, "Bueno", fecha5);

        Socio tabla[] = new Socio[5];
        tabla[0] = a;
        tabla[1] = b;
        tabla[2] = c;
        tabla[3] = d;
        tabla[4] = e;

        Arrays.sort(tabla, new Comparador());
        System.out.println(Arrays.deepToString(tabla));
    }

}
