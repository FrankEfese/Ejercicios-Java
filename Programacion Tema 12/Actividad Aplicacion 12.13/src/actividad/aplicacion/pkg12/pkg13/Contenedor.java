package actividad.aplicacion.pkg12.pkg13;

import java.util.*;

public class Contenedor<T extends Comparable<T>> {

    T tabla[];

    public Contenedor(T[] tabla) {
        this.tabla = tabla;
    }

    void insertarPrincipio(T n) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = n;

    }

    void insertarFinal(T n) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = n;

    }

    T extraerFinal() {

        T a = null;

        if (tabla.length > 0) {

            a = tabla[tabla.length - 1];
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }

        return a;
    }

    T exraerPrincipio() {

        T a = null;

        if (tabla.length > 0) {

            a = tabla[0];
            tabla = Arrays.copyOfRange(tabla, 1, tabla.length);
        }

        return a;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(tabla);
    }

    void ordenar() {

        Arrays.sort(tabla);
    }

    void ordenar(Comparator<T> c) {

        Arrays.sort(tabla, c);
    }

}
