package actividad.aplicacion.pkg13.pkg17;

//Agregar a la clase Socio :
//-int edad() que calcula la edad del socio en años a partir de la fechaN y la actual. 
//-int antig() que calcula la antig del socio en meses completados. 
//Crea un Stream con los socios ordenados por antiguedad y otro con la edad. 
import java.util.*;
import java.time.Month;
import java.util.*;
import java.util.stream.Stream;
import java.time.LocalDate;

public class ActividadAplicacion1317 {

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

        System.out.println("Por Edad : ");
        Stream.of(tabla).sorted((f, x) -> f.edad() - x.edad()).forEach(f -> System.out.println(f.toString()));

        System.out.println("");

        System.out.println("Por Antiguedad : ");
        Stream.of(tabla).sorted((f, x) -> f.atiguedad() - x.atiguedad()).forEach(f -> System.out.println(f.toString()));
    }

}
