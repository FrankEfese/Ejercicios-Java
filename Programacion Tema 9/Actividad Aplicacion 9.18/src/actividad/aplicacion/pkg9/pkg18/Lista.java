package actividad.aplicacion.pkg9.pkg18;

import java.util.Arrays;

public class Lista implements Cola, Pila {

    Object tabla[];

    public Lista(Object[] tabla) {
        this.tabla = tabla;
    }

    void insertarAlPrincipio(Object nuevo) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(Object nuevo) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;

    }

    void insertarFinalLista(Lista nuevo) {

        int tam = tabla.length;

        tabla = Arrays.copyOf(tabla, tabla.length + nuevo.tabla.length);
        System.arraycopy(nuevo.tabla, 0, tabla, tam, nuevo.tabla.length);

    }

    void insertar(int posi, Object nuevo) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posi, tabla, posi + 1, tabla.length - posi - 1);
        tabla[posi] = nuevo;

    }

    Object eliminar(int indice) {

        Object eliminado = null;

        if (indice >= 0 && indice < tabla.length) {

            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {

                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }

        return eliminado;

    }

    Object get(int indice) {

        Object resultado = null;

        if (indice >= 0 && indice < tabla.length) {

            resultado = tabla[indice];
        }

        return resultado;

    }

    int buscar(Object claveBusqueda) {

        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;

    }

    @Override
    public String toString() {
        return Arrays.deepToString(tabla);
    }

    @Override
    public void encolar(Object n) {

        insertarFinal(n);
    }

    @Override
    public Object desencolar() {

        return eliminar(0);
    }

    @Override
    public void apilar(Object n) {

        insertarFinal(n);
    }

    @Override
    public Object desapilar() {

        return eliminar(tabla.length - 1);
    }

}
