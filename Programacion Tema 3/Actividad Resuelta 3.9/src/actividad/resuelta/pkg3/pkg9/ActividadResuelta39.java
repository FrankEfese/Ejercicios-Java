package actividad.resuelta.pkg3.pkg9;

//Implementar una aplicacion que pida al usuario un numero comprendido entre 1 y 10. 
//Hay que mostrar la tabla de multiplicar de dicho numero , asegurandose de que el 
//numero introducido se encuentra en el rengo establecido. 
import java.util.Scanner;

public class ActividadResuelta39 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entre 1 y 10 : ");
        int n = sc.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("TE HAS PASADO");
        } else {

            for (int x = 1; x <= 10; x++) {

                System.out.println(n + " por " + x + " = " + (n * x));
            }
        }

    }

}
