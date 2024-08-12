package actividad.resuelta.pkg4.pkg1;

//Diseñar la funcion eco() a la que se le pasa como parametro un numero n y muestra 
//por pantalla n veces el mensaje Eco. 
import java.util.Scanner;

public class ActividadResuelta41 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();

        mostrarEco(n);
    }

    static void mostrarEco(int n) {

        for (int x = 0; x < n; x++) {

            System.out.println("Eco...");

        }

    }

}
