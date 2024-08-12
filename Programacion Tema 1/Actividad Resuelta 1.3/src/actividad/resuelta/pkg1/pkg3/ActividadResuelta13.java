package actividad.resuelta.pkg1.pkg3;

//Pedir al usuario su edad y mostrar la que tendra el proximo año.
import java.util.Scanner;

public class ActividadResuelta13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad actual : ");
        int edad = sc.nextInt();
        System.out.println("Su edad actual : " + edad + " / "
                + " Su edad el anio que viene : " + (edad + 1));

    }

}
