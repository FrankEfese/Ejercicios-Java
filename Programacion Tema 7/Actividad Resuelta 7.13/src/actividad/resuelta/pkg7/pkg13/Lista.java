package actividad.resuelta.pkg7.pkg13;

import java.util.Arrays;

public class Lista {

    Integer tabla[];

    public Lista() {
        tabla = new Integer[0];
    }

    public int numElementosLista() {
        return tabla.length;
    }

    public void insertarFinal(int n) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = n;
        System.out.println("\nAGREGADO");

    }

    public void insertarPrincipio(int n) {

        if (tabla.length == 0) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = n;
            System.out.println("\nAGREGADO");
        } else {

            Integer tabla2[] = new Integer[1];
            tabla2[0] = n;

            for (int x = 0; x < tabla.length; x++) {
                tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                tabla2[tabla2.length - 1] = tabla[x];
            }

            tabla = tabla2;
            System.out.println("\nAGREGADO");

        }

    }

    public void insertarIndice(int indice, int n) {

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
            System.out.println("\nAGREGADO");
        } else {
            System.out.println("\nINDICE ERRONEO");
        }

    }

    public void insertarLista(Lista l) {

        for (int x = 0; x < l.tabla.length; x++) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = l.tabla[x];
        }
        System.out.println("\nAGREGADO");

    }

    public void eliminarParametro(int indice) {

        if (indice < tabla.length && indice >= 0) {

            Integer tabla2[] = new Integer[0];

            for (int x = 0; x < indice; x++) {
                tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                tabla2[tabla2.length - 1] = tabla[x];
            }

            for (int x = indice + 1; x < tabla.length; x++) {
                tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                tabla2[tabla2.length - 1] = tabla[x];
            }

            tabla = tabla2;
            System.out.println("\nELIMINADO");
        } else {
            System.out.println("\nINDICE ERRONEO");
        }

    }

    public void busqueda(int n) {

        int indice = -1;

        for (int x = 0; x < tabla.length; x++) {
            if (tabla[x] == n) {
                indice = x;
                break;
            }
        }

        System.out.println("\nINDICE : " + indice);

    }

    public void mostrarLista() {

        System.out.println(Arrays.toString(tabla));

    }

    public static Lista insertar2Lista(Lista l, Lista l2) {

        Integer tablaListas[] = new Integer[0];

        for (int x = 0; x < l.tabla.length; x++) {
            tablaListas = Arrays.copyOf(tablaListas, tablaListas.length + 1);
            tablaListas[tablaListas.length - 1] = l.tabla[x];
        }

        for (int x = 0; x < l2.tabla.length; x++) {
            tablaListas = Arrays.copyOf(tablaListas, tablaListas.length + 1);
            tablaListas[tablaListas.length - 1] = l2.tabla[x];
        }

        Lista aux = new Lista();
        aux.tabla = tablaListas;
        return aux;

    }

}
