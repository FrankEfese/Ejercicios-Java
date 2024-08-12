package actividad.resuelta.pkg13.pkg3;

//Implementa un metodo estatico al que se le pasa como parametro una tabla de tipo generico
//y un comparador de dicho tipo. El metodo devuelve el valor maximo segun el criterio de orden
//del comparador. 
import java.util.*;

import java.util.*;

public class ActividadResuelta133 {

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

        Cliente x = maxi(tabla, (a, b) -> {
            return a.edad - b.edad;
        });
        System.out.println(x);

    }

    static <T> T maxi(T tabla[], Comparator<T> c) {

        T valorMax = tabla[0];

        for (T a : tabla) {

            if (c.compare(a, valorMax) > 0) {
                valorMax = a;
            }

        }

        return valorMax;

    }

}
