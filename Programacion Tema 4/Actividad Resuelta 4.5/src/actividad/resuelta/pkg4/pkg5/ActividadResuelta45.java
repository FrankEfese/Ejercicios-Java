package actividad.resuelta.pkg4.pkg5;

//Crear una funcion que mediante un booleano, indique si el caracter que se pasa como
//parametro de entrada corresponde con una vocal. 
import java.util.Scanner;

public class ActividadResuelta45 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un caracter : ");
        char c = sc.nextLine().toLowerCase().charAt(0); // Pedimos un String , lo convertimos a minusculas y solo guardamos el primer caracter.

        System.out.println("Es una Vocal : " + esVocal(c));

    }

    static boolean esVocal(char c) {

        if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {

            return true;
        } else {
            return false;
        }

    }

}
