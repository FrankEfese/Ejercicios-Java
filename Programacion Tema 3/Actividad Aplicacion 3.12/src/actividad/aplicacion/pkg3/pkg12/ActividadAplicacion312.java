package actividad.aplicacion.pkg3.pkg12;

//Modifica la Actividad de Aplicacion 3.11 para que el ususario pueda introducir un numero 
//en binario y el programa muestre su conversion a decimal.
import java.util.Scanner;

public class ActividadAplicacion312 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero en Binario : ");
        int n = sc.nextInt();
        int suma = 0;
        int cont = 0;

        do {

            int aux = n % 10;

            if (aux == 1) {
                suma += Math.pow(2, cont);

            }

            n = (n / 10);

            cont++;

        } while (n != 0);
        System.out.println("El numero en decimal : " + suma);
    }

}
