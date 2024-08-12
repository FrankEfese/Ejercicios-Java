package actividad.aplicacion.pkg8.pkg19;

import java.util.Arrays;

public class Conjunto extends Lista {

    public Conjunto() {
    }

    @Override
    public boolean equals(Object obj) {

        Conjunto c = (Conjunto) obj;
        if (Arrays.equals(tabla, c.tabla)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void busqueda(int n) {
        super.busqueda(n);
    }

    @Override
    public void eliminarParametro(int indice) {
        super.eliminarParametro(indice);
    }

    public void insertarConjunto(Conjunto c) {

        int aux = tabla.length;
        for (int x = 0; x < c.tabla.length; x++) {

            int cont = 0;
            for (int j = 0; j < tabla.length; j++) {
                if (c.tabla[x] == tabla[j]) {
                    cont++;
                }

            }

            if (cont == 0) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = c.tabla[x];

            }

        }

        if (aux < tabla.length) {
            System.out.println("Agregado");
        } else {
            System.out.println("Ninguno");
        }
    }

    @Override
    public void insertarIndice(int indice, int n) {
        int cont = 0;

        for (Integer a : tabla) {

            if (a == n) {
                cont++;
            }
        }

        if (cont == 0) {

            if (indice < tabla.length && indice >= 0) {

                Integer tabla2[] = new Integer[0];

                for (int x = 0; x < indice; x++) {
                    tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                    tabla2[tabla2.length - 1] = tabla[x];
                }

                tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                tabla2[tabla2.length - 1] = n;

                for (int x = indice; x < tabla.length; x++) {
                    tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                    tabla2[tabla2.length - 1] = tabla[x];
                }

                tabla = tabla2;

            } else {

                System.out.println("Indice Erroneo");

            }

        }

    }

    @Override
    public void insertarPrincipio(int n
    ) {

        int cont = 0;

        for (Integer a : tabla) {

            if (a == n) {
                cont++;
            }
        }

        if (cont == 0) {
            Integer tabla2[] = new Integer[1];
            tabla2[0] = n;

            for (int x = 0; x < tabla.length; x++) {
                tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                tabla2[tabla2.length - 1] = tabla[x];
            }

            tabla = tabla2;
        }
    }

    @Override
    public void insertarFinal(int n
    ) {

        int cont = 0;

        for (Integer a : tabla) {

            if (a == n) {
                cont++;
            }
        }

        if (cont == 0) {

            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = n;

        }

    }

    @Override
    public int numElementosLista() {
        return super.numElementosLista();
    }

}
