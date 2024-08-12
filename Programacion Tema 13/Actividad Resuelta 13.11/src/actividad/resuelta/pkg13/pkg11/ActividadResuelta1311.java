package actividad.resuelta.pkg13.pkg11;

//A partir de la tabla clientes , mostrar un listado de los clientes donde aparezcan
//sus nombres y edades , ordenados por nombre. 
import java.util.*;
import java.util.stream.Stream;

public class ActividadResuelta1311 {

    public static void main(String[] args) {

        Cliente c = new Cliente("Pepe", 23);
        Cliente c2 = new Cliente("Luis", 20);
        Cliente c3 = new Cliente("Jose", 33);
        Cliente c4 = new Cliente("Manu", 15);
        Cliente c5 = new Cliente("Alex", 45);
        Cliente c6 = new Cliente("Fran", 12);

        Cliente tabla[] = new Cliente[6];
        tabla[0] = c;
        tabla[1] = c2;
        tabla[2] = c3;
        tabla[3] = c4;
        tabla[4] = c5;
        tabla[5] = c6;

        Stream.of(tabla)
                .sorted((x, y) -> {

                    return x.nombre.compareTo(y.nombre);
                })
                .forEach(v -> System.out.println(v.nombre + " " + v.edad));
    }

}
