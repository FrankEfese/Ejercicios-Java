package actividad.resuelta.pkg2.pkg3;

//Solicitar dos numeros distintos y mostrar cual es el mayor. 

import java.util.Scanner;

public class ActividadResuelta23 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();
        
        if(a > b){
            System.out.println("El mayor es : " + a);
        }else{
            if(a < b){
                System.out.println("El mayor es : " + b);
            }else{
                System.out.println("SON IGUALES");
            }
        }
        
    }
    
}
