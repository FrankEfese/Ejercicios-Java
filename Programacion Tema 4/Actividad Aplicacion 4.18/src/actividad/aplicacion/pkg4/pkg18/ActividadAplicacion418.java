package actividad.aplicacion.pkg4.pkg18;

//Crea una funcion que muestre por consola una serie de numeros aleatorios enteros. 
//Los parametros de la funcion seran : cantidad de numeros y los valores maximos 
//y minimos que estos pueden tomar. 
import java.util.Scanner;

public class ActividadAplicacion418 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de numeros que saldran por pantalla : ");
        int cant = sc.nextInt();
        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();
        int aux = a;
        a = Math.max(a, b);
        b = Math.min(aux, b);

        aleatorios(cant, a, b);

    }

    static void aleatorios(int cant, int a, int b) {

        for (int x = 0; x < cant; x++) {

            int c = (int) (Math.random() * (a + 1 - b) + b);

            System.out.println(c);
        }

    }

}
