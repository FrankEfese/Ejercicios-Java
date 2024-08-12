package actividad.propuesta.pkg2.pkg4;

//Realiza un programa que informe al usuario (mostrando true) si un primer numero
//es multiplo de otro numero . Ambos numeros se piden por teclado. 

import java.util.Scanner;



public class ActividadPropuesta24 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();
        
        boolean esMultiplo = a % b == 0;
        System.out.println("A es multiplo de B : " + esMultiplo);
        
    }
    
}
