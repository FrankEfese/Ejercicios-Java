package actividad.resuelta.pkg1.pkg6;

//Crear una aplicacion que calcule la media aritmetica de dos notas enteras.
//Hay que tener en cuenta que la media puede contener decimales.

import java.util.Scanner;

public class ActividadResuelta16 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la primera nota : ");
        int pNota = sc.nextInt();
        System.out.println("Introduce la segunda nota : ");
        int sNota = sc.nextInt();
        double media = (pNota + sNota) / 2.0; // El punto 0 es para que la division incluya decimales.
        
        System.out.println("La media de las dos notas es : " + media);
       
    }
    
}
