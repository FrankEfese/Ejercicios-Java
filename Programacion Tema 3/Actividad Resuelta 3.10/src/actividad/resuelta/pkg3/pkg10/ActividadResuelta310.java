package actividad.resuelta.pkg3.pkg10;

//Diseñar un programa que muestre la suma de los 10 primeros numeros impares. 
import java.util.Scanner;

public class ActividadResuelta310 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sumaImpar = 0;
        int impar = 0;

        for (int x = 1; x <= 10; x++) {

            impar = (2 * x) - 1;
            sumaImpar += impar;

        }

        System.out.println(sumaImpar);

    }

}
