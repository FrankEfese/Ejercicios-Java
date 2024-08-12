package actividad.aplicacion.pkg1.pkg20;

//Solicita al usuario un numero real y calcula su raiz cuadrada.

import java.util.Scanner;

public class ActividadAplicacion120 {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        double n= sc.nextInt();
        System.out.println("Su raiz cuadrada es : " + Math.sqrt(n));
       
    }
    
}
