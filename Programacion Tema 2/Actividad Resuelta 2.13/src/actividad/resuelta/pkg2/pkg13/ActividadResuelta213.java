package actividad.resuelta.pkg2.pkg13;

//Escribir un programa que pida una hora de la siguiente forma : hora , minutos y segundos. 
//El programa debe mostrar que hora sera un segundo mas tarde. 
import java.util.Scanner;

public class ActividadResuelta213 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los segundos : ");
        int s = sc.nextInt();
        System.out.println("Introduce los minutos : ");
        int m = sc.nextInt();
        System.out.println("Introduce la hora : ");
        int h = sc.nextInt();

        s++;

        if (s > 59) {
            s = 0;
            m++;
        }

        if (m > 59) {
            m = 0;
            h++;
        }

        if (h > 23) {
            h = 0;
        }

        System.out.println("HORA : " + h + ":" + m + ":" + s);

    }

}
