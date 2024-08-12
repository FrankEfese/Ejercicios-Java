package actividad.aplicacion.pkg1.pkg17;

//Solicita al usuario tres distancias :
//La primera en milimetros.
//La segunda en centimetros. 
//La tercera en metros. 
//Diseña un programa que muestre la suma de las tres longitudes introducidas 
//(medida en centimetros). 

import java.util.Scanner;


public class ActividadAplicacion117 {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los milimetros : ");
        double mm = sc.nextDouble();
        System.out.println("Introduce los centimetros : ");
        double cm = sc.nextDouble();
        System.out.println("Introduce los metros : ");
        double m = sc.nextDouble();
        double res = (m * 100) + (mm / 10) + cm;
        System.out.println("La suma es : " + res);
       
    }
    
}
