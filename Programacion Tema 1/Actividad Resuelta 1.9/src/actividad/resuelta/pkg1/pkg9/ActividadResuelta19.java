package actividad.resuelta.pkg1.pkg9;

//Escribir un programa que pida un numero al usuario e indique mediante un booleano 
//(true o false) si el numero es par. 

import java.util.Scanner;

public class ActividadResuelta19 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero : ");
        int numero = sc.nextInt();
        boolean par = (numero % 2 == 0);
        System.out.println("El numero es par : " + par);
      
    }
    
}
