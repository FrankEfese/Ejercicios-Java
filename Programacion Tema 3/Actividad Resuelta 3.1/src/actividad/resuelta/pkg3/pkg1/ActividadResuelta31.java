package actividad.resuelta.pkg3.pkg1;

//Diseñar un programa que muestre, por cada numero introducido por teclado , si es par ,
//si es positivo y su cuadrado. El proceso se repetira hasta que el numero introducido sea 0. 
import java.util.Scanner;

public class ActividadResuelta31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce numeros ( 0 para terminar) : ");
        int num = 1;

        while (num != 0) {

            System.out.println("");

            num = sc.nextInt();

            if (num == 0) {

            } else {

                if (num % 2 == 0) {
                    System.out.println("\nES PAR");
                } else {
                    System.out.println("\nES IMPAR");
                }

                if (num > 0) {
                    System.out.println("\nES POSITIVO");
                }

                System.out.println("\nSU CUADRADO : " + num * num);
            }

        }

        System.out.println("FINNN");

    }

}
