package actividad.resuelta.pkg1.pkg4;

//Escribir una aplicacion que pida el año actual y el del nacimiento del usuario.
//Debe calcular su edad , suponiendo que en el año en curso el usuario ya ha 
//cumplido años.


import java.util.Scanner;

public class ActividadResuelta14 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el anio actual : ");
        int anioActual = sc.nextInt();
        System.out.println("Introduce el anio en que naciste : ");
        int anioNacimiento = sc.nextInt();
        System.out.println("Su edad actual es : " + (anioActual - anioNacimiento));
    }
    
}
