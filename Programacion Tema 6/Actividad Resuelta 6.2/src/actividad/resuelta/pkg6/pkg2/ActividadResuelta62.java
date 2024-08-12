package actividad.resuelta.pkg6.pkg2;

//Introducir por teclado dos frases e indicar cual de ellas es la mas corta ,
//es decir , contiene menos caracteres. 
import java.util.*;

public class ActividadResuelta62 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase : ");
        String f1 = sc.nextLine();
        System.out.println("Introduce otra frase : ");
        String f2 = sc.nextLine();

        if (f1.length() < f2.length()) {
            System.out.println(f1 + " / ES MAS CORTA");
        } else {
            if (f1.length() > f2.length()) {
                System.out.println(f2 + " / ES MAS CORTA");
            } else {

                System.out.println("SON IGUALES");
            }
        }

    }

}
