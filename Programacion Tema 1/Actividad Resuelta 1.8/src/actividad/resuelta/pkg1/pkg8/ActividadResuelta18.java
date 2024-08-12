package actividad.resuelta.pkg1.pkg8;

//Realizar una aplicacion que solicite al usuario su edad y le indique si es mayor de 
//edad (mediante un booleano : true o false)

import java.util.Scanner;


public class ActividadResuelta18 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu edad : ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18;
        System.out.println("Es mayor de Edad : " + mayorEdad);
       
    }
    
}
