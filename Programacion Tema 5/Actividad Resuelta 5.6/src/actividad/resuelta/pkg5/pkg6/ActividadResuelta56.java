package actividad.resuelta.pkg5.pkg6;

//Definir una funcion que tome como parametros dos tablas , la primera con los 6 numeros 
//de una apuesta de la primitiva y la segunda (ordenada) con los 6 numeros de la combinacion
//ganadora. La funcion devolvera el numero de aciertos. 
import java.util.*;

public class ActividadResuelta56 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tablaApuesta[] = new int[6];
        int combi[] = new int[6];

        int cont = 0;
        int aux = 0;

        do {
            System.out.println("Introduce un numero : ");
            int n = sc.nextInt();

            if (n > 49 || n < 1) {
                System.out.println("Te has pasado de rango.");
            } else {

                for (int a : tablaApuesta) {

                    if (a == n) {
                        aux++;
                    }
                }

                if (aux == 0) {
                    tablaApuesta[cont] = n;
                    cont++;
                } else {
                    System.out.println("Ya has elegido este numero");
                }

            }

            aux = 0;

        } while (cont < 6);

        cont = 0;
        aux = 0;

        do {

            int n = (int) (Math.random() * 49 + 1);

            for (int a : combi) {

                if (a == n) {
                    aux++;
                }

            }

            if (aux == 0) {
                combi[cont] = n;
                cont++;
            }

            aux = 0;

        } while (cont < 6);

        Arrays.sort(combi);

        System.out.println(Arrays.toString(tablaApuesta));
        System.out.println(Arrays.toString(combi));
        System.out.println("Numero de aciertos : " + aciertos(tablaApuesta, combi));

    }

    static int aciertos(int apuesta[], int combi[]) {

        int cont = 0;

        for (int x = 0; x < apuesta.length; x++) {
            for (int j = 0; j < apuesta.length; j++) {

                if (apuesta[x] == combi[j]) {
                    cont++;
                }

            }
        }

        return cont;

    }

}
