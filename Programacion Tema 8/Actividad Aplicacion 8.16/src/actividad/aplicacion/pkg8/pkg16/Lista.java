package actividad.aplicacion.pkg8.pkg16;

//Implementar la clase Lista correspondiente a una lista de numeros de la clase Integer . 
import java.util.Arrays;

//Los numeros se guardaran en una tabla . 
//-Un constructor que inicialice la tabla en 0 . 
//-Obtener el num de elementos que hay en la lista. 
//-Insertar un num al final. 
//-Insertar al principio. 
//-Insertar un num en un indice en concreto. 
//-Añadir al final los elementos de otra lista. 
//-Eliminar un elemento cuyo indice se pasa como parametro. 
//-Buscar un num en la lista , devolviendo el indice  o -1. 
//-Mostrar la lista.
public class Lista {

    protected Integer tabla[];

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

    @Override
    public String toString() {
        return "Lista{" + "tabla=" + Arrays.toString(tabla) + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Lista l = (Lista) obj;

        if (Arrays.equals(tabla, l.tabla)) {
            return true;
        } else {
            return false;
        }
    }

}
