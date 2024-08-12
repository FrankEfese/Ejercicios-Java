package actividad.resuelta.pkg3.pkg5;

//Desarrollar un juego que ayude a mejorar el calculo mental de la suma. El jugador 
//tendra que introducir la solucion de la suma de dos numeros aleatorios comprendidos 
//entre 1 y 100. Mientras la solucion introducida sea correcta , el juego continuara. 
//En caso contrario , el programa terminara y mostrara el numero de operaciones realizadas correctamente. 
import java.util.Scanner;

public class ActividadResuelta35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int solucion;
        int contAciertos = 0;
        int a;
        int b;

        do {

            a = (int) (Math.random() * 100 + 1);
            b = (int) (Math.random() * 100 + 1);

            System.out.println("Realiza la siguiente suma : " + a + " + " + b);

            solucion = sc.nextInt();

            if (solucion == a + b) {
                contAciertos++;
            }

        } while (solucion == a + b);

        System.out.println("NUMERO DE ACIERTOS : " + contAciertos);

    }

}
