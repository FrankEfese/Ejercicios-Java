package actividad.resuelta.pkg13.pkg6;

//Implementa el metodo estatico <T> paraCada (T[]tabla , Consumer<T>) . Este metodo ejecutara 
//la accion consumer. Usalo para mostrar los nombres y edad de clientes. 
import java.util.*;
import java.util.function.Consumer;

public class ActividadResuelta136 {

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

        paraCada(tabla, z -> {

            System.out.println("Nombre : " + z.nombre);
            System.out.println("Edad : " + z.nombre);

        });

    }

    static <T> void paraCada(T tabla[], Consumer<T> c) {

        for (T a : tabla) {

            c.accept(a);

        }

    }

}
