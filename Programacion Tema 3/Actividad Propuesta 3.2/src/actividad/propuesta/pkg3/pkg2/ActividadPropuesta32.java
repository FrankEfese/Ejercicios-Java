package actividad.propuesta.pkg3.pkg2;

//Implementa la aplicacion ECO , que pide al usuario un numero y muestra por pantalla 
//ECO segun el numero que haya introducido. 
import java.util.Scanner;

public class ActividadPropuesta32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();

        for (int x = 0; x < n; x++) {

            System.out.println("Eco...");
        }

    }

}
