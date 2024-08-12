package actividad.aplicacion.pkg7.pkg21;

//-Un constructor sin parametros. 
import java.util.Arrays;

//-El numero de elementos. 
//-Insertar. 
//-Insertar otro conjunto. 
//-Eliminar . 
//-Eliminar conjunto. 
//-Si esta el elemento. 
//-Mostrar. 
public class Conjunto {

    Integer tabla[];

    public Conjunto() {

        tabla = new Integer[0];
    }

    public int numElementos() {

        return tabla.length;
    }

    public boolean insertar(Integer n) {

        int cont = 0;

        for (Integer a : tabla) {

            if (a == n) {
                cont++;
            }
        }

        if (cont == 0) {

            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = n;
            return true;
        } else {
            return false;
        }

    }

    public boolean insertarOtroConj(Conjunto c) {

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
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(Integer n) {
        int pos = -1;
        for (int a = 0; a < tabla.length; a++) {
            if (tabla[a] == n) {
                pos = a;
            }
        }

        if (pos < 0) {
            return false;
        } else {

            Integer tabla2[] = new Integer[0];

            for (int x = 0; x < pos; x++) {
                tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                tabla2[tabla2.length - 1] = tabla[x];
            }

            for (int x = pos + 1; x < tabla.length; x++) {
                tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                tabla2[tabla2.length - 1] = tabla[x];
            }

            tabla = tabla2;

            return true;

        }

    }

    public boolean esta(Integer n) {

        int pos = -1;
        for (int a = 0; a < tabla.length; a++) {
            if (tabla[a] == n) {
                pos = a;
            }
        }

        if (pos < 0) {
            return false;
        } else {
            return true;
        }
    }

    public void mostrar() {
        System.out.println(Arrays.toString(tabla));
    }

    public boolean eliminarConj(Conjunto c) {

        Integer tabla2[] = new Integer[0];
        int aux = tabla.length;
        for (int x = 0; x < tabla.length; x++) {

            int cont = 0;
            for (int j = 0; j < c.tabla.length; j++) {
                if (tabla[x] == c.tabla[j]) {

                    cont++;

                }

            }

            if (cont == 0) {

                tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                tabla2[tabla2.length - 1] = tabla[x];

            }

        }
        tabla = tabla2;

        if (aux > tabla.length) {
            return true;
        } else {
            return false;
        }

    }

}
