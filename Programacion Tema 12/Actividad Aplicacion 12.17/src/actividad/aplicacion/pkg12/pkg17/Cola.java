package actividad.aplicacion.pkg12.pkg17;

import java.util.ArrayList;

public class Cola<T> {

    ArrayList<T> lista;

    public Cola(ArrayList<T> lista) {
        this.lista = lista;
    }

    void encolar(T n) {

        lista.add(n);

    }

    T desencolar() {

        return lista.remove(0);

    }

    @Override
    public String toString() {
        return "Cola{" + "lista=" + lista + '}';
    }

}
