package actividad.aplicacion.pkg7.pkg13;

import java.util.Arrays;

public class Colores {

    static String colores = "amarillo azul rojo verde";

    public static void agregarcolor(String n) {

        colores += " ";
        colores += n;

    }

    public static String[] color(int n) {
        String[] tabla = new String[0];

        int cont = 0;
        String aux = "";
        for (int x = 0; x < colores.length(); x++) {

            aux += colores.charAt(x);
            if (Character.isSpaceChar(colores.charAt(x))) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = aux;
                aux = "";

            }

        }
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = aux;

        if (n > tabla.length) {

            System.out.println("No hay suficientes colores.");
            return null;

        } else {
            if (n == tabla.length) {
                return tabla;
            } else {
                String[] tablaAux = new String[0];

                while (n > 0) {

                    int a = (int) (Math.random() * (tabla.length) + 0);
                    String col = tabla[a];

                    for (String s : tablaAux) {

                        if (s.equals(col)) {
                            cont++;
                        }

                    }

                    if (cont == 0) {
                        tablaAux = Arrays.copyOf(tablaAux, tablaAux.length + 1);
                        tablaAux[tablaAux.length - 1] = tabla[a];
                        n--;
                    }
                    cont = 0;

                }

                return tablaAux;

            }
        }

    }

}
