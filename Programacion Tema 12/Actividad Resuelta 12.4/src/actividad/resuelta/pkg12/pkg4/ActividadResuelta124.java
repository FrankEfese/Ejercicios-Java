package actividad.resuelta.pkg12.pkg4;

//Implementa una app que pida por consola numeros enteros no negativos. Al terminar se mostrara por consola. 
//A continuacion se mostraran los valores pares. Por ultimos se eliminaran los multiplos de 3 y se mostrara. 
import java.util.*;

public class ActividadResuelta124 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Introduce un numero entero (negativo para terminar) : ");
        Integer a = sc.nextInt();

        while (a >= 0) {

            lista.add(a);
            System.out.println("Introduce un numero entero (negativo para terminar) : ");
            a = sc.nextInt();

        }

        System.out.println(lista);
        System.out.println("Pares : ");
        ArrayList<Integer> sinMultiplosde3 = new ArrayList<>();

        for (Integer x : lista) {

            if (x % 2 == 0) {
                System.out.print(x);
                System.out.print(",");
            }

            if (x % 3 != 0) {
                sinMultiplosde3.add(x);
            }

        }

        System.out.println("");
        System.out.println("Sin multiplos de 3 : ");
        System.out.println(sinMultiplosde3);

    }

}
