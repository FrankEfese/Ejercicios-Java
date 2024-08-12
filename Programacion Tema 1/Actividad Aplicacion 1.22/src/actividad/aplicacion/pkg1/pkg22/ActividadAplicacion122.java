package actividad.aplicacion.pkg1.pkg22;

//Realiza un programa que solicite la longitud de un lanzamiento (en metros) y
//muestre la parte entera correspondiente en centimetros.
import java.util.Scanner;

public class ActividadAplicacion122 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del lanzamiento : ");
        double m = sc.nextDouble();
        int cm = (int) Math.abs(m * 100);
        System.out.println("En centimetros : " + cm);

    }

}
