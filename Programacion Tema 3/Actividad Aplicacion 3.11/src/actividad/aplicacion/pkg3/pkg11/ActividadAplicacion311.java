package actividad.aplicacion.pkg3.pkg11;

//Realiza un programa que convierta un numero decimal en su representacion binaria. 
import java.util.Scanner;

public class ActividadAplicacion311 {

    public static void main(String[] args) {

        //SOLO PASARE LA PARTE ENTERA DEL NUMERO A BINARIO
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        double n = sc.nextDouble();
        int a = (int) Math.abs(n);
        do {
            int aux = a % 2;

            a = (a / 2);
            System.out.println(aux);

        } while (a / 2 != 0);
        System.out.println(a % 2);
    }

}
