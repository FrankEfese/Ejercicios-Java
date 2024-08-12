package actividad.propuesta.pkg5.pkg3;

//Introduce por teclado un numero n ; a continuacion , solicita al usuario que teclee n numeros. 
//Realiza la media de los numeros positivos , de los negativos y cuenta el numero de ceros. 
import java.util.*;

public class ActividadPropuesta53 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de numeros : ");
        int n = sc.nextInt();
        int pos = 0;
        int neg = 0;
        int cero = 0;
        int sumPos = 0;
        int sumaNeg = 0;

        for (int x = 0; x < n; x++) {

            System.out.println("Introduce un numero : ");
            int a = sc.nextInt();

            if (a > 0) {
                sumPos += a;
                pos++;
            } else {
                if (a < 0) {
                    sumaNeg += a;
                    neg++;
                } else {
                    cero++;
                }
            }

        }

        if (pos == 0) {
            System.out.println("La media de positivos : 0");
        } else {
            System.out.println("La media de positivos : " + (sumPos / pos));
        }

        if (neg == 0) {
            System.out.println("La media de negativos : 0");
        } else {
            System.out.println("La media de negativos : " + (sumaNeg / neg));
        }

        System.out.println("Cantidad de ceros : " + cero);
    }

}
