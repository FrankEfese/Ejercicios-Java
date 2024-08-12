package actividad.resuelta.pkg10.pkg1;

//Escribir el metodo Integer leerEntero() que pide un entero por consola , lo lee del teclado 
//y lo devuelve . Si la cadena introducida por consola no tiene el formato correcto 
//muestra un mensaje de error y vuelve a pedirlo. 
import java.util.*;

public class ActividadResuelta101 {

    public static void main(String[] args) {

        leerEntero();

    }

    static Integer leerEntero() {

        Integer n;
        Scanner sc = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("Introduce un numero : ");
                n = sc.nextInt();
                break;

            } catch (InputMismatchException e) {

                System.out.println("ERROR");
            }

        }

        return n;

    }

}
