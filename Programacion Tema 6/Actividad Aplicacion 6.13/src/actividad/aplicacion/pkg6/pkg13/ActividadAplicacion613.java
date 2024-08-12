package actividad.aplicacion.pkg6.pkg13;

//El procesador de lenguaje en C elimina los comentarios (/*..*/) del codigo fuente. 
//Diseña un programa que lea por teclado una sentencia en C. 
//Ej : if (a==3) /*igual a tres*/  a++; /* incrementamos a */
import java.util.*;

public class ActividadAplicacion613 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una sentencia en C : ");
        String b = sc.nextLine();
        String c = "";

        int pos = b.indexOf("/*", 0);
        int pos2 = 0;

        while (pos >= 0) {

            for (int x = pos2; x < pos; x++) {
                c += b.charAt(x);
            }

            pos2 = b.indexOf("*/", pos2);
            pos2 += 2;
            pos = b.indexOf("/*", pos2);

        }
        for (int x = pos2; x < b.length(); x++) {
            c += b.charAt(x);
        }

        System.out.println(c);

    }

}
