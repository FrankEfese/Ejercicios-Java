package actividad.aplicacion.pkg5.pkg20;

//Fusionar dos tablas ya ordenadas en una tercera que tendra que seguir ordenada. 
import java.util.Scanner;
import java.util.Arrays;

public class ActividadAplicacion520 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int indice = 0;
        int tabla1[] = new int[10];
        int tabla2[] = new int[10];

        System.out.println("Inserte los datos de tabla 1 : ");
        for (int x = 0; x < tabla1.length; x++) {
            tabla1[x] = sc.nextInt();
        }
        System.out.println("Inserte los datos de tabla 2 : ");
        for (int x = 0; x < tabla2.length; x++) {
            tabla2[x] = sc.nextInt();
        }

        Arrays.sort(tabla1);
        Arrays.sort(tabla2);

        int tablatotal[] = tabla1;

        while (indice < tabla2.length) {
            tablatotal = Arrays.copyOf(tablatotal, tablatotal.length + 1);
            tablatotal[tablatotal.length - 1] = tabla2[indice];
            indice++;
        }
        Arrays.sort(tablatotal);

        System.out.println("La tabla queda asi : " + Arrays.toString(tablatotal));

    }

}
