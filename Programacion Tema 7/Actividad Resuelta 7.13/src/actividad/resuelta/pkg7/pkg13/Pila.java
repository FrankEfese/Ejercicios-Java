package actividad.resuelta.pkg7.pkg13;

import java.util.Arrays;

public class Pila {

    Lista l;

    public Pila(Lista l) {
        this.l = l;
    }

    public void apilar(Integer n) {

        l.tabla = Arrays.copyOf(l.tabla, l.tabla.length + 1);
        l.tabla[l.tabla.length - 1] = n;

    }

    public void desapilar() {

        if (l.tabla.length == 0) {
            System.out.println("NO HAY ELEMENTOS");
        } else {
            l.tabla = Arrays.copyOf(l.tabla, l.tabla.length - 1);
        }
    }

    public void mostrarPila() {

        System.out.println(Arrays.toString(l.tabla));

    }

}
