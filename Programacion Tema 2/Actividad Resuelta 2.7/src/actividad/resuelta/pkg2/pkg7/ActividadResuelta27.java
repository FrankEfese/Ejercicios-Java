package actividad.resuelta.pkg2.pkg7;

//Pedir tres numeros y mostrarlos de mayor a menor. 

import java.util.Scanner;

public class ActividadResuelta27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int c = sc.nextInt();
        
        // PRIMERO VEMOS CUAL ES EL MAX Y EL MIN PARA ASI SOLO TENER 3 OPCIONES

        int max = Math.max(a, b);
        max = Math.max(max, c);

        int min = Math.min(a, b);
        min = Math.min(min, c);

        if (max > a && a > min) {
            System.out.println("ORDEN : " + max + " " + a + " " + min);
        } else {
            if (max > b && b > min) {
                System.out.println("ORDEN : " + max + " " + b + " " + min);
            } else {
                System.out.println("ORDEN : " + max + " " + c  + " " + min);
            }
        }

    }

}
