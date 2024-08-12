package actividad.aplicacion.pkg4.pkg13;

//Crea la funcion muestraPares(int n) que muestre por consola los primeros n numeros pares. 
import java.util.Scanner;

public class ActividadAplicacion413 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        n = Math.abs(n);

        muestraPares(n);
    }

    static void muestraPares(int n) {

        int cont = 0;
        int p = 1;
        do {

            if (p % 2 == 0) {
                System.out.println("Numero Par : " + p);
                cont++;
            }

            p++;

        } while (cont != n);

    }

}
