package actividad.aplicacion.pkg7.pkg22;

import java.util.Arrays;

//-static boolean incluido : que devuelve true si c1 esta incluido en c2. 
//-static Conjunto union : devuelve un nuevo conjunto con c1 y c2. 
//-static interseccion: devuelve un nuevo conjunto con los valores comunes de c1 y c2. 
//-static diferencia : devuleve un nuevo conjunto con los valores de c1 que no estan en c2. 
public class Conjunto {

    Integer tabla[];

    public Conjunto() {

        tabla = new Integer[0];
    }

    static boolean incluido(Conjunto c1, Conjunto c2) {

        int cont = 0;
        for (int x = 0; x < c1.tabla.length; x++) {

            for (int j = 0; j < c2.tabla.length; j++) {
                if (c1.tabla[x] == c2.tabla[j]) {
                    cont++;
                }
            }

        }

        if (cont == c1.tabla.length) {
            return true;
        } else {
            return false;
        }

    }

    static Conjunto union(Conjunto c1, Conjunto c2) {

        Conjunto p = new Conjunto();

        for (int x = 0; x < c1.tabla.length; x++) {

            p.tabla = Arrays.copyOf(p.tabla, p.tabla.length + 1);
            p.tabla[p.tabla.length - 1] = c1.tabla[x];
        }

        for (int x = 0; x < c2.tabla.length; x++) {

            p.tabla = Arrays.copyOf(p.tabla, p.tabla.length + 1);
            p.tabla[p.tabla.length - 1] = c2.tabla[x];
        }

        return p;

    }

    static Conjunto interseccion(Conjunto c1, Conjunto c2) {

        Conjunto p = new Conjunto();

        for (int x = 0; x < c1.tabla.length; x++) {

            for (int j = 0; j < c2.tabla.length; j++) {

                if (c1.tabla[x] == c2.tabla[j]) {

                    p.tabla = Arrays.copyOf(p.tabla, p.tabla.length + 1);
                    p.tabla[p.tabla.length - 1] = c1.tabla[x];
                }
            }

        }

        return p;

    }

    static Conjunto diferencia(Conjunto c1, Conjunto c2) {

        Conjunto p = new Conjunto();

        for (int x = 0; x < c1.tabla.length; x++) {

            int cont = 0;
            for (int j = 0; j < c2.tabla.length; j++) {

                if (c1.tabla[x] == c2.tabla[j]) {

                    cont++;
                }
            }

            if (cont == 0) {

                p.tabla = Arrays.copyOf(p.tabla, p.tabla.length + 1);
                p.tabla[p.tabla.length - 1] = c1.tabla[x];

            }

        }

        return p;

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
