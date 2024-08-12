package actividad.aplicacion.pkg5.pkg19;

//Diseñar una app para gestionar una carrera , introducir dorsales hasta -1 . 
//Introducir los dorsales que sean menores de edad , adelantando una posicion.
//Introducir los dorsales que hayan dado positivo en doping , eliminandolos. 
//Introducir los dorsales que no han pagado poniendolos al final. 
//Por ultimo poner los 3 primeros. 
import java.util.*;

public class ActividadAplicacion519 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dorsales[] = new int[0];
        int d = 0;
        int cont = 0;
        do {

            System.out.println("Introduce el dorsal : ");
            d = sc.nextInt();

            if (d != -1) {

                for (int a : dorsales) {
                    if (a == d) {
                        cont++;
                    }
                }

                if (cont == 0) {
                    dorsales = Arrays.copyOf(dorsales, dorsales.length + 1);
                    dorsales[dorsales.length - 1] = d;
                }
            }
            cont = 0;

        } while (d != -1);

        do {

            System.out.println(Arrays.toString(dorsales));
            System.out.println("Introduce el dorsal que sea menor de edad : ");
            d = sc.nextInt();
            for (int a : dorsales) {
                if (a == d) {
                    cont++;
                }
            }

            if (cont == 1) {

                dorsales = adelantar(dorsales, d);
            } else {

                System.out.println("No hay nadie con este dorsal");
            }
            cont = 0;

        } while (d != -1);

        do {
            System.out.println(Arrays.toString(dorsales));
            System.out.println("Introduce el dorsal que ha dado doping: ");
            d = sc.nextInt();

            for (int a : dorsales) {
                if (a == d) {
                    cont++;
                }
            }

            if (cont == 1) {

                dorsales = eliminar(dorsales, d);
            } else {

                System.out.println("No hay nadie con este dorsal");
            }

            cont = 0;

        } while (d != -1);

        do {
            System.out.println(Arrays.toString(dorsales));
            System.out.println("Introduce el dorsal que no ha pagado: ");
            d = sc.nextInt();
            for (int a : dorsales) {
                if (a == d) {
                    cont++;
                }
            }

            if (cont == 1) {

                dorsales = pagado(dorsales, d);
            } else {

                System.out.println("No hay nadie con este dorsal");
            }

            cont = 0;

        } while (d != -1);

        System.out.println("DORSALES : ");
        System.out.println(Arrays.toString(dorsales));
        System.out.println("ORO : " + dorsales[0]);
        System.out.println("PALTA : " + dorsales[1]);
        System.out.println("BRONCE : " + dorsales[2]);

    }

    static int[] adelantar(int t[], int d) {
        int cont = 0;

        for (int x = 0; x < t.length; x++) {

            if (t[x] == d) {
                cont = x;
            }

        }

        int tabla[] = new int[0];

        if (cont == 0) {

            return t;
        }

        for (int x = 0; x < cont - 1; x++) {

            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = t[x];
        }

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = t[cont];

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = t[cont - 1];

        for (int x = cont + 1; x < t.length; x++) {

            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = t[x];
        }

        return tabla;
    }

    static int[] eliminar(int t[], int d) {

        int cont = 0;

        for (int x = 0; x < t.length; x++) {

            if (t[x] == d) {
                cont = x;
            }

        }

        int tabla[] = new int[0];

        if (cont == 0) {

            for (int x = cont + 1; x < t.length; x++) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = t[x];
            }

            return tabla;

        } else {

            for (int x = 0; x < cont; x++) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = t[x];
            }

            for (int x = cont + 1; x < t.length; x++) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = t[x];
            }

            return tabla;
        }

    }

    static int[] pagado(int t[], int d) {

        int cont = 0;

        for (int x = 0; x < t.length; x++) {

            if (t[x] == d) {
                cont = x;
            }

        }

        int tabla[] = new int[0];

        if (cont == 0) {

            for (int x = cont + 1; x < t.length; x++) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = t[x];
            }

            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = t[cont];

            return tabla;

        } else {

            for (int x = 0; x < cont; x++) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = t[x];
            }

            for (int x = cont + 1; x < t.length; x++) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = t[x];
            }

            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = t[cont];

            return tabla;
        }

    }

}
