package actividad.resuelta.pkg9.pkg5;

//Implementar un programa en el que usando una Cola anonima se encolan numeros enteros hasta que se introduce 
//un valor negativo. Luego se desencolan todos los valores y se muestran por pantalla. 
import java.util.*;

public class ActividadResuelta95 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer n;
        Cola c = new Cola() {

            Lista l = new Lista();

            @Override
            public void encolar(Integer n) {
                l.encolar(n);
            }

            @Override
            public Integer desencolar() {
                return l.desencolar();
            }

        };

        do {
            System.out.println("Introduce un numero (Negativo para terminar) : ");
            n = sc.nextInt();

            if (n >= 0) {
                c.encolar(n);
            }

        } while (n >= 0);

        Integer a = c.desencolar();

        while (a != null) {

            System.out.println(a);
            a = c.desencolar();

        }
    }

}
