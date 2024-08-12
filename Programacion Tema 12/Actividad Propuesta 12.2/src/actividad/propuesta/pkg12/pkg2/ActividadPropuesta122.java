package actividad.propuesta.pkg12.pkg2;

//Define la interfaz Cola con parametros genericos . Implementala en Contenedor. 
//Utilizar un Contenedor como Cola . Encolaremos numeros positivos . Despues se desencolan
//y se muestran por pantalla. 
import java.util.*;

public class ActividadPropuesta122 {

    public static void main(String[] args) {

        Cola<Integer> c = new Contenedor<>(new Integer[0]);
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero (-1 para terminar) : ");
        Integer a = sc.nextInt();

        while (a != -1) {

            c.encolar(a);
            System.out.println("Introduce un numero (-1 para terminar) : ");
            a = sc.nextInt();

        }

        Integer b = c.desencolar();

        while (b != null) {

            System.out.println(b);
            b = c.desencolar();
        }
    }

}
