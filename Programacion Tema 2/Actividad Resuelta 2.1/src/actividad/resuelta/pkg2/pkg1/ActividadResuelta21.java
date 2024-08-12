package actividad.resuelta.pkg2.pkg1;

//Diseñar una aplicacion que solicite un numero al usuario e
//indique si es par o impar.

import java.util.Scanner;


public class ActividadResuelta21 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero : ");
        int a = sc.nextInt();
        
        if(a % 2 == 0){
            System.out.println("ES PAR");
        }else{
            System.out.println("ES IMPAR");
        }
       
        
        
    }
    
}
