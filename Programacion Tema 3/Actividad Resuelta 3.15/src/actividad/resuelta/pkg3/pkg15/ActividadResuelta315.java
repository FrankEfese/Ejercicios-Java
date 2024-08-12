package actividad.resuelta.pkg3.pkg15;

//Pedir por consola un numero n y dibujar un triangulo rectangulo de n elementos de lado. 
import java.util.Scanner;

public class ActividadResuelta315 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();

        for (int x = n; x > 0; x--) {

            for (int j = x; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
