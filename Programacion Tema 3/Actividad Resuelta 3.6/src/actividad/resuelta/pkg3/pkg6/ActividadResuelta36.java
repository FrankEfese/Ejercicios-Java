package actividad.resuelta.pkg3.pkg6;

//Escribir una aplicacion para aprender a contar , que pedira un numero n y mostrara 
//todos los numeros del 1 a n. 
import java.util.Scanner;

public class ActividadResuelta36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        System.out.println("");

        for (int x = 1; x <= n; x++) {
            System.out.println(x);
        }

    }

}
