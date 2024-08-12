package actividad.resuelta.pkg1.pkg7;

//Diseñar una aplicacion que calcule la longitud y el area de una circunferencia. 
//Para ello el usuario debe introducir el radio (puede contener decimales).

import java.util.Scanner;

public class ActividadResuelta17 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el radio de la circunferencia : ");
        double radio = sc.nextDouble();
        
        double longitud = (2 * Math.PI)  * radio;
        System.out.println("\nLa longitud es  : " + longitud);
        
        double area = Math.PI * (radio * radio);
        System.out.println("El area es : " + area);
        
    }
    
}
