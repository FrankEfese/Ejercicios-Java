package actividad.resuelta.pkg1.pkg12;

//Escribir un programa que pida un numero al usuario y 
//muestre su valor absoluto.
import java.util.Scanner;

public class ActividadResuelta112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int num = sc.nextInt();

//      num = num >= 0 ? num : num * (- 1);
        num = num >= 0 ? num : Math.abs(num);
        System.out.println(num);

    }

}
