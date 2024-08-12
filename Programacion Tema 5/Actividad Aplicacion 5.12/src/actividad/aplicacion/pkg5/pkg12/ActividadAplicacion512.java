package actividad.aplicacion.pkg5.pkg12;

//Escribe la funcion desordenar(int t []) que cambia de forma aleatoria los elementos contenidos
//en la tabla t. Si la tabla estuviera ordenada , dejaria de estarlo. 
import java.util.*;

public class ActividadAplicacion512 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabla[] = new int[10];

        for (int x = 0; x < tabla.length; x++) {
            System.out.println("Introduce un numero : ");
            tabla[x] = sc.nextInt();
        }

        System.out.println(Arrays.toString(tabla));
        System.out.println("");
        desordenar(tabla);
    }

    static void desordenar(int t[]) {

        int aux;

        for (int x = 0; x < 10; x++) {

            int a = (int) (Math.random() * t.length + 0);
            int b = (int) (Math.random() * t.length + 0);

            aux = t[a];

            t[a] = t[b];
            t[b] = aux;

        }

        System.out.println(Arrays.toString(t));

    }

}
