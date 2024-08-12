package actividad.aplicacion.pkg13.pkg16;

//Implementa la clase socio con los atributos dni , nombre , fechaN , fechaA, cuota y
//numFam . Ademas un constructor , los metodos equals , compareTo(dni) , toString. 
//Crea una tabla de 5 socios y luego un Stream. 
//-Orden por DNI
//-Con una cuota mayor de 100 
//-Nombre que empieza por A
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Stream;

public class ActividadAplicacion1316 {

    public static void main(String[] args) {

        Socio a = new Socio("2542349A", "Pepe", LocalDate.of(2001, Month.MARCH, 4), LocalDate.now(), 100, 4);
        Socio b = new Socio("4363456S", "Jose", LocalDate.of(2010, Month.DECEMBER, 4), LocalDate.now(), 130, 5);
        Socio c = new Socio("5234585K", "Alex", LocalDate.of(2012, Month.JUNE, 4), LocalDate.now(), 200, 8);
        Socio d = new Socio("9890955L", "Manu", LocalDate.of(2018, Month.OCTOBER, 4), LocalDate.now(), 60, 2);
        Socio e = new Socio("1413242B", "Luis", LocalDate.of(2006, Month.JULY, 4), LocalDate.now(), 50, 2);

        Socio tabla[] = new Socio[5];
        tabla[0] = a;
        tabla[1] = b;
        tabla[2] = c;
        tabla[3] = d;
        tabla[4] = e;

        System.out.println("Orden por DNI : ");
        Stream.of(tabla).sorted().forEach(f -> System.out.println(f.toString()));
        System.out.println("");
        System.out.println("Con Cuota mayor a 100 : ");
        Stream.of(tabla).sorted().filter(f -> f.cuota > 100).forEach(f -> System.out.println(f.toString()));
        System.out.println("");
        System.out.println("Con Nombres que empiecen por A : ");
        Stream.of(tabla).sorted().filter(f -> f.nombre.startsWith("A")).forEach(f -> System.out.println(f.toString()));
    }

}
