package actividad.resuelta.pkg5.pkg11;

//Desarrollar el juego de la camara secreta que consiste en abrir una camara mediante su combinacion secreta ,
//que esta formado por una combinacion de digitos del 1 al 5. El jugador especificara cual es la longitud de la combinacion.
//La app genera de forma aleatoria una combinacion secreta que el usuario tendra que acertar. En cada intento se muestra una pista
//para cada digito , si es mayor , menor o igual . 
import java.util.*;

public class ActividadResuelta511 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("La longitud de la Combinacion Secreta : ");
        int n = sc.nextInt();
        n = Math.abs(n);

        int tablaComb[] = combinacion(n);

        int prueba[] = new int[n];

        do {

            for (int x = 0; x < prueba.length; x++) {

                System.out.println("\nIntroduce un numero entre 1 y 5 : ");
                prueba[x] = sc.nextInt();

            }

            resultado(tablaComb, prueba);

        } while (!Arrays.equals(tablaComb, prueba));
        System.out.println(Arrays.toString(tablaComb));

    }

    static void resultado(int tComb[], int tPrue[]) {

        if (Arrays.equals(tComb, tPrue)) {

            System.out.println("\nHAS ACERTADO");
        } else {

            int indice = 0;

            while (indice < tComb.length) {

                if (tComb[indice] == tPrue[indice]) {
                    System.out.println("\n" + tPrue[indice] + " -> " + " IGUAL");
                } else {

                    if (tComb[indice] > tPrue[indice]) {
                        System.out.println("\n" + tPrue[indice] + " -> " + " MENOR");
                    } else {
                        System.out.println("\n" + tPrue[indice] + " -> " + " MAYOR");
                    }
                }

                indice++;

            }

            System.out.println("\nVUELVELO A INTENTAR");

        }

    }

    static int[] combinacion(int v) {

        int tabla[] = new int[v];

        for (int x = 0; x < tabla.length; x++) {

            tabla[x] = (int) (Math.random() * 5 + 1);

        }

        return tabla;

    }

}
