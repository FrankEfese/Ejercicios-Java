package actividad.resuelta.pkg2.pkg8;

//Pedir los coeficientes de una ecuacion de segundo grado y mostrar sus soluciones reales. 
//Si no existen , habra que indicarlo. Hay que tener en cuenta que las soluciones de una ecuacion de segundo grado
//, ax + bx + c = 0. 

import java.util.Scanner;


public class ActividadResuelta28 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double a , b , c;
        double x1 , x2 , d;
        System.out.println("Introduce primer coeficiente (a) : ");
        a = sc.nextDouble();
        System.out.println("Introduce segundo coeficiente (b) : ");
        b = sc.nextDouble();
        System.out.println("Introduce tercer coeficiente (c) : ");
        c = sc.nextDouble();
        
        d = (b * b - 4 * a * c);
        
        if(d < 0){
            System.out.println("No existen soluciones reales.");
        }else{
            if(a == 0){
                System.out.println("No es una ecuacion de segundo grado.");
            }else{
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Solucion 1 : " + x1);
                System.out.println("Solucion 2 : " + x2);
            }
        }
       
    }
    
}
