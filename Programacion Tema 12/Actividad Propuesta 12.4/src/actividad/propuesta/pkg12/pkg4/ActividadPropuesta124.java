package actividad.propuesta.pkg12.pkg4;

//Implementa una app donde se piden por consola numeros reales hasta que se introduzca 0 . 
//A medida que se leen los positivos en una lista y los negativos en otra. Se muestran ambas
//colecciones , la suma y se eliminan los mayores de 10 y -10 . 
import java.util.*;

public class ActividadPropuesta124 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listaPos = new ArrayList<>();
        ArrayList<Integer> listaNeg = new ArrayList<>();
        int pos = 0;
        int neg = 0;

        System.out.println("Introduce un numero real (0 para terminar ) : ");
        Integer x = sc.nextInt();

        while (x != 0) {

            if (x > 0) {
                pos += x;
                listaPos.add(x);
            }

            if (x < 0) {
                neg += x;
                listaNeg.add(x);
            }

            System.out.println("Introduce un numero real (0 para terminar ) : ");
            x = sc.nextInt();

        }

        System.out.println("Lista Positivos : ");
        System.out.println(listaPos);
        System.out.println("Lista Negativos : ");
        System.out.println(listaNeg);
        System.out.println("Suma Pos : " + pos);
        System.out.println("Suma Neg : " + neg);
        Iterator<Integer> posi = listaPos.iterator();

        while (posi.hasNext()) {

            if (posi.next() > 10) {
                posi.remove();
            }

        }

        System.out.println("Lista Pos sin mayores que 10 : ");
        System.out.println(listaPos);

        Iterator<Integer> nega = listaNeg.iterator();

        while (nega.hasNext()) {

            if (nega.next() < -10) {
                nega.remove();
            }

        }

        System.out.println("Lista Neg sin menores que -10 : ");
        System.out.println(listaNeg);

    }

}
