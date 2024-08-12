package actividad.aplicacion.pkg4.pkg19;

//Sobrecarga la funcion realizada anteriormente para que el unico parametro sea la cantidad
//de numeros aleatorios . Los numeros aleatorios estaran comprendidos entre 1 y 0. 
import java.util.Scanner;

public class ActividadAplicacion419 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de numeros que saldran por pantalla : ");
        int cant = sc.nextInt();
        aleatorios(cant);

    }

    static void aleatorios(int cant) {

        for (int x = 0; x < cant; x++) {

            double c = (Math.random() * 1);

            System.out.println(c);
        }

    }
}
