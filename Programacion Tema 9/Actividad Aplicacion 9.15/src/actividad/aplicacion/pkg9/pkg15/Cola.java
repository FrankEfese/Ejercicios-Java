package actividad.aplicacion.pkg9.pkg15;

import java.util.Arrays;

public class Cola {

    Integer tabla[];

    public Cola() {

        tabla = new Integer[0];
    }

    public int numElementosLista() {
        return tabla.length;
    }

    public void insertarFinal(int n) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = n;

    }

    public void eliminar() {

        Integer tabla2[] = new Integer[0];

        for (int x = 1; x < tabla.length; x++) {
            tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
            tabla2[tabla2.length - 1] = tabla[x];
        }

        tabla = tabla2;
       

    }

    public void mostrarLista() {

        System.out.println(Arrays.toString(tabla));

    }

    @Override
    public String toString() {
        return "Cola{" + "tabla=" + Arrays.toString(tabla) + '}';
    }
    
    
    

}
