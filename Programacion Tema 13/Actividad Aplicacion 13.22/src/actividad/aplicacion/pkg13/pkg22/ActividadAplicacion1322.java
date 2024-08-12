package actividad.aplicacion.pkg13.pkg22;

//Con la tabla de Socios obtener mediante un Stream el numero medio de familiares por socio. 
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Stream;

public class ActividadAplicacion1322 {

    public static void main(String[] args) {

        Socio a = new Socio("2542349A", "Pepe", LocalDate.of(2001, Month.MARCH, 4), LocalDate.of(2017, Month.MARCH, 4), 100, 4);
        Socio b = new Socio("4363456S", "Jose", LocalDate.of(2010, Month.DECEMBER, 4), LocalDate.of(2020, Month.MARCH, 4), 130, 5);
        Socio c = new Socio("5234585K", "Alex", LocalDate.of(2012, Month.JUNE, 4), LocalDate.of(2021, Month.MARCH, 4), 200, 8);
        Socio d = new Socio("9890955L", "Manu", LocalDate.of(2018, Month.OCTOBER, 4), LocalDate.of(2022, Month.MARCH, 4), 60, 2);
        Socio e = new Socio("1413242B", "Luis", LocalDate.of(2006, Month.JULY, 4), LocalDate.of(2019, Month.MARCH, 4), 50, 2);

        Socio tabla[] = new Socio[5];
        tabla[0] = a;
        tabla[1] = b;
        tabla[2] = c;
        tabla[3] = d;
        tabla[4] = e;

        double n = Stream.of(tabla).mapToInt(x -> x.numFam).average().getAsDouble();
        System.out.println("Media : " + n);
    }

}
