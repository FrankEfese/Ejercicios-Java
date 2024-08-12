package actividad.aplicacion.pkg12.pkg20;

import java.util.ArrayList;

public class Cola {

    ArrayList<Integer> lista;

    public Cola(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    void encolar(Integer n) {

        lista.add(n);

    }

    Integer desencolar() {

        Integer n = null;

        if (lista.isEmpty()) {
            return n;
        } else {
            n = lista.remove(0);
            return n;
        }

    }

    @Override
    public String toString() {
        return "Cola{" + "lista=" + lista + '}';
    }

}
