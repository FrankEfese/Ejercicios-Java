package actividad.aplicacion.pkg7.pkg19;

import java.util.Arrays;

public class Pila {

    Integer tabla[];

    public Pila() {
        tabla = new Integer[0];
    }

    public int numElementosPila() {
        return tabla.length;
    }

    public void apilar(int n) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = n;

    }

    public void desapilar() {

        Integer tabla2[] = new Integer[0];

        for (int x = 0; x < tabla.length - 1; x++) {
            tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
            tabla2[tabla2.length - 1] = tabla[x];
        }

        tabla = tabla2;

    }

    public void mostrarPila() {

        System.out.println(Arrays.toString(tabla));

    }

}
