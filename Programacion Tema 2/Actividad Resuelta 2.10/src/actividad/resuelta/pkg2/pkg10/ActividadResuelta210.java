package actividad.resuelta.pkg2.pkg10;

//Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma : 
//insuficiente (de 0 a 4) , suficiente (5) , bien (6) , notable (7,8) y sobresaliente (9,10). 
import java.util.Scanner;

public class ActividadResuelta210 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nota : ");
        int nota = sc.nextInt();

        switch (nota) {

            case 1, 2, 3, 4 ->
                System.out.println("Insuficiente");

            case 5 ->
                System.out.println("Suficiente");
            case 6 ->
                System.out.println("Bien");
            case 7, 8 ->
                System.out.println("Notable");

            case 9, 10 ->
                System.out.println("Sobresaliente");

            default ->
                System.out.println("ERROR");

        }

    }

}
