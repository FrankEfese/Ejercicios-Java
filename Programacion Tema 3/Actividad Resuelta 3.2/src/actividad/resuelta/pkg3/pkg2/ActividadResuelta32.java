package actividad.resuelta.pkg3.pkg2;

//Implementar una aplicacion para calcular datos estadisticos de las edades de los alumnos
//de un centro educativo. Se introduciran datos hasta que uno de ellos sea negativo y se mostrara : 
//la suma de todas las edades introducidas , la media , el numero de alumnos y cuantos son mayores de edad. 
import java.util.Scanner;

public class ActividadResuelta32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumaEdad = 0;
        double mediaEdad;
        int numAlum = 0;
        int mayorEdad = 0;
        int edad = 1;

        System.out.println("Introduce edades de alumnos (Numero Negativo para Terminar) : ");

        while (edad > 0) {

            edad = sc.nextInt();

            if (edad > 0) {

                sumaEdad += edad;
                numAlum++;

                if (edad > 17) {
                    mayorEdad++;
                }

            }

        }

        mediaEdad = (double) sumaEdad / numAlum;

        System.out.println("\nLa suma de todas las edades : " + sumaEdad);
        System.out.println("La media de todas las edades : " + mediaEdad);
        System.out.println("El total de alumnos : " + numAlum);
        System.out.println("Cuantos son mayores de edad : " + mayorEdad);

    }

}
