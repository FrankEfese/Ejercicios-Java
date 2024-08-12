package actividad.resuelta.pkg2.pkg2;

//Pedir dos numeros enteros y decir si son iguales o no. 

import java.util.Scanner;


public class ActividadResuelta22 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int b = sc.nextInt();
        
        if(a == b){
            System.out.println("SON IGUALES");
        }else{
            System.out.println("NO SON IGUALES");
        }
      
    }
    
}
