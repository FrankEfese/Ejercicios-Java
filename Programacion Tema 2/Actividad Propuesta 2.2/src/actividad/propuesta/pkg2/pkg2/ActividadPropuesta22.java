package actividad.propuesta.pkg2.pkg2;

//Solicita por teclado un numero de tipo int al usuario y escribe un programa que muestre true o false ,
//dependiendo de si el numero es positivo.

import java.util.Scanner;

public class ActividadPropuesta22 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        
        boolean res = n >= 0;
        System.out.println("El numero es positivo : " + res);
     
    }
    
}
