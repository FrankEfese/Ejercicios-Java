package actividad.resuelta.pkg2.pkg4;

//Implementar un programa que pida por teclado un numero decimal e indique si es un 
//numero casi-cero , que son aquellos , positivos o negativos , que se acercan a 0 
//por menos de 1 unidad , aunque el 0 no se considera un numero casi-cero. 

import java.util.Scanner;


public class ActividadResuelta24 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero : ");
        double num = sc.nextDouble();
        
        if(num < 1 && num > -1 && num != 0){
            System.out.println("ES UN CASI-CERO");
        }else{
            System.out.println("NO LO ES");
        }
       
    }
    
}
