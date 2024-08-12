package actividad.resuelta.pkg3.pkg8;

//Pedir 10 numeros enteros por teclado y mostrar la media. 
import java.util.Scanner;

public class ActividadResuelta38 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        double media = 0;

        for (int x = 0; x < 10; x++) {
            System.out.println("Introduce un numero : ");
            num = sc.nextInt();
            media += num;

        }
        System.out.println(media);
        System.out.println("La media de los 10 numeros : " + (media / 10));

    }

}
