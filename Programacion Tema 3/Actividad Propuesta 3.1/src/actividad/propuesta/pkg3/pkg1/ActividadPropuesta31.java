package actividad.propuesta.pkg3.pkg1;

//Diseña una aplicacion que muestre la edad maxima y minima de un grupo de alumnos. 
//El usuario introducira edades y terminara escribiendo -1. 
import java.util.Scanner;

public class ActividadPropuesta31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edades;

        System.out.println("Introduce edades (-1 para terminar) : ");
        edades = sc.nextInt();

        int max = edades;
        int min = edades;

        while (edades != -1) {
            edades = sc.nextInt();

            if (edades == -1) {

            } else {

                max = max > edades ? max : edades;
                min = min < edades ? min : edades;
            }

        }

        System.out.println("La edad mas alta : " + max);
        System.out.println("La edad mas baja : " + min);

    }

}
