package actividad.aplicacion.pkg1.pkg16;

//Diseña una aplicacion que solicite al usuario que introduzca una cantidad de segundos. 
//La aplicacion debe mostrar cuantas horas , minutos y segundos hay en el numero de
//segundos introducidos por el usuario.

import java.util.Scanner;


public class ActividadAplicacion116 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de segundos : ");
        int s = sc.nextInt();
        int m = s >= 60 ? (s / 60) : 0;
        int h = m >= 60 ? (m / 60) : 0;
        s %= 60;
        m %= 60;
        System.out.println("Horas : " + h);
        System.out.println("Minutos : " + m );
        System.out.println("Segundos : " + s);
       
    }
    
}
