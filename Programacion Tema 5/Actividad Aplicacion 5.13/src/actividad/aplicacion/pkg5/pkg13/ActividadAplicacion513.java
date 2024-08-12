package actividad.aplicacion.pkg5.pkg13;

//Modifica la actividad anterior para que la funcion no modifique la tabla que se pasa 
//como parametro y en su lugar cree y devuelva una copia de la tabla donde se ha desordenado los valores. 
import java.util.*;

public class ActividadAplicacion513 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabla[] = new int[10];

        for (int x = 0; x < tabla.length; x++) {
            System.out.println("Introduce un numero : ");
            tabla[x] = sc.nextInt();
        }

        int tabla2[] = desordenar(tabla);

        System.out.println("TABLA DESORDENADA");
        System.out.println(Arrays.toString(tabla2));
        System.out.println("TABLA SIN LA FUNCION");
        System.out.println(Arrays.toString(tabla));
    }

    static int[] desordenar(int t[]) {

        int aux;
        int tabla[] = new int[t.length];

        for (int x = 0; x < tabla.length; x++) {

            tabla[x] = t[x];

        }

        for (int x = 0; x < 10; x++) {

            int a = (int) (Math.random() * t.length + 0);
            int b = (int) (Math.random() * t.length + 0);

            aux = tabla[a];

            tabla[a] = tabla[b];
            tabla[b] = aux;

        }

        return tabla;
    }
}
