package actividad.aplicacion.pkg6.pkg17;

//Construir un programa que convierta una palabra en secuencias de n letras. 
import java.util.*;

public class ActividadAplicacion617 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra : ");
        String palabra = sc.nextLine();
        System.out.println("Introduce en numero de secuencias : ");
        int n = sc.nextInt();

        if (n > palabra.length() || n < 1) {
            System.out.println("ERROR");
        } else {

            String p = "";

            int aux = palabra.length() / n;
            int cont = 0;
            int aux2 = n;

            while (aux > 0) {

                for (int x = cont; x < n; x++) {

                    p += palabra.charAt(x);

                }

                System.out.println(p);

                p = "";
                cont += aux2;
                n += aux2;
                aux--;
            }

            for (int x = cont; x < palabra.length(); x++) {

                p += palabra.charAt(x);

            }

            System.out.println(p);

        }

    }
}
