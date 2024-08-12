package actividad.aplicacion.pkg8.pkg16;

import java.util.Arrays;

public class Pila extends Lista {

    public Pila() {
        super();
    }

    public void eliminarParametro() {
        super.eliminarParametro(tabla.length - 1);

    }

    @Override
    public void insertarFinal(int n) {
        super.insertarFinal(n);
    }

    public void mostrarPila() {

        System.out.println(Arrays.toString(tabla));

    }

}
