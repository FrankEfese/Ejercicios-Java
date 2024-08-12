package actividad.resuelta.pkg2.pkg11;

//Idear un programa que solicite al usuario un numero comprendido entre 1 y 7 , 
//correspondiente a un dia de la semana . Se debe mostrar el nombre del dia de la semana al que corresponde.
import java.util.Scanner;

public class ActividadResuelta211 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entre 1 y 7 : ");
        int num = sc.nextInt();

        switch (num) {

            case 1 ->
                System.out.println("Lunes");

            case 2 ->
                System.out.println("Martes ");

            case 3 ->
                System.out.println("Miercoles");

            case 4 ->
                System.out.println("Jueves");

            case 5 ->
                System.out.println("Viernes");

            case 6 ->
                System.out.println("Sabado");

            case 7 ->
                System.out.println("Domingo");

            default ->
                System.out.println("ERROR");

        }

    }

}
