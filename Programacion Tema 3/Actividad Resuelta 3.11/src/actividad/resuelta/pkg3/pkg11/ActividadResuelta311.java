package actividad.resuelta.pkg3.pkg11;

//Pedir un numero y calcular su factorial. 
import java.util.Scanner;

public class ActividadResuelta311 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un al que quieras calcular su factorial : ");
        int n = sc.nextInt();
        int sumFact = n;

        for (int x = n - 1; x > 0; x--) {

            sumFact = (sumFact * x);

        }

        System.out.println("El factorial de " + n + " : " + sumFact);

    }

}
