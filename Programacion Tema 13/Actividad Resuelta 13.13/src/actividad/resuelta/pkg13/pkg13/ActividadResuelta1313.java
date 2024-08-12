package actividad.resuelta.pkg13.pkg13;

//A partir de la clase Cliente , crear DatosCliente con atributo de nombre y fecha . 
//-DatosCliente(Cliente c)
//to String
//Con los elementos de la tabla Clientes construir un mapa que tenga como clave el atributo dni
//y y como valor DatosClientes . Mostrar el mapa. 
import java.util.*;
import java.util.stream.Collectors;

public class ActividadResuelta1313 {

    public static void main(String[] args) {

        Cliente c = new Cliente("1234324", "Pepe", 23);
        Cliente c2 = new Cliente("23487129", "Luis", 20);
        Cliente c3 = new Cliente("5245253", "Jose", 33);
        Cliente c4 = new Cliente("3241234", "Manu", 15);
        Cliente c5 = new Cliente("24312354", "Alex", 45);
        Cliente c6 = new Cliente("5435452", "Fran", 12);

        Cliente tabla[] = new Cliente[6];
        tabla[0] = c;
        tabla[1] = c2;
        tabla[2] = c3;
        tabla[3] = c4;
        tabla[4] = c5;
        tabla[5] = c6;

        Map<String, DatosCliente> m = Arrays.stream(tabla)
                .collect(Collectors.toMap(x -> x.dni, x -> new DatosCliente(x)));

        System.out.println(m);

    }

}
