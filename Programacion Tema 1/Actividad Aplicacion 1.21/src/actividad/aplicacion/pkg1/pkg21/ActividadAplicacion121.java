package actividad.aplicacion.pkg1.pkg21;

//Pide dos numeros al usuario. Debera mostrar true si son iguales y
//false si son distintos.

import java.util.Scanner;


public class ActividadAplicacion121 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int m = sc.nextInt();
        
        boolean resultado = (n == m);
        System.out.println("Son iguales : " + resultado);
      
    }
    
}
