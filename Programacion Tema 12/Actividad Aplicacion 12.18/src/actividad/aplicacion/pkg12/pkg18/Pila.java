package actividad.aplicacion.pkg12.pkg18;

import java.util.ArrayList;

public class Pila<T> {

    ArrayList<T> pila;

    public Pila(ArrayList<T> pila) {
        this.pila = pila;
    }

    void apilar(T n) {
        pila.add(n);
    }

    T desapilar() {
        return pila.remove(pila.size() - 1);
    }

    @Override
    public String toString() {
        return "Pila{" + "pila=" + pila + '}';
    }

}
