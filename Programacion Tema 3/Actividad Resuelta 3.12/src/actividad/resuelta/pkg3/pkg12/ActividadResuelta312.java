package actividad.resuelta.pkg3.pkg12;

//Pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso. 
import java.util.Scanner;

public class ActividadResuelta312 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contSus = 0;

        for (int x = 5; x > 0; x--) {
            System.out.println("Introduce una nota : ");
            double nota = sc.nextDouble();

            if (nota < 5) {
                contSus++;
            }
        }

        if (contSus == 0) {
            System.out.println("NO HAY SUSPENSOS");
        } else {
            System.out.println("El numero de suspensos : " + contSus);
        }

    }

}
