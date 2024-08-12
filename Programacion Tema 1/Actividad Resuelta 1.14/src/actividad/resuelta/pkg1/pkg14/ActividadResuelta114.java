package actividad.resuelta.pkg1.pkg14;

//Realizar un programa que pida como entrada un numero decimal y lo muestre 
//redondeado al entero mas proximo.

import java.util.Scanner;

public class ActividadResuelta114 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero decimal : ");
        double num = sc.nextDouble();
        num += 0.5;
        System.out.println("El numero redondeado : " + (int) num);
      
      
    }
    
}
