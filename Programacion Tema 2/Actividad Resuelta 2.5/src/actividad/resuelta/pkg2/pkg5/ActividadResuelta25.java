package actividad.resuelta.pkg2.pkg5;

//Pedir dos numeros y mostrarlos ordenados de forma decreciente. 

import java.util.Scanner;


public class ActividadResuelta25 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();
        
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println("ORDEN DECRECIENTE : " + max + " / " + min);
       
    }
    
}
