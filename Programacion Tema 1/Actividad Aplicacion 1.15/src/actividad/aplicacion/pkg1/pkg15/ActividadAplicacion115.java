package actividad.aplicacion.pkg1.pkg15;

//Dado el siguiente polinomio de segundo plano : y = a*(x*x) + b*x + c , crea un
//programa que pida los coeficientes a,b y c , asi como el valor de x , y calcula
//el valor correspondiente de y.

import java.util.Scanner;


public class ActividadAplicacion115 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los siguientes valores para resolver el valor de y = a*(x*x) + b*x + c");
        System.out.println("Introduce el valor a : ");
        int a = sc.nextInt();
        System.out.println("Introduce el valor de b : ");
        int b = sc.nextInt();
        System.out.println("Introduce el valor de c : ");
        int c = sc.nextInt();
        System.out.println("Introduce el valor de x : ");
        int x = sc.nextInt();
        double y = (a * (x*x) + (b * x) + c);
        System.out.println("El valor de y es : " + y);
                
       
    }
    
}
