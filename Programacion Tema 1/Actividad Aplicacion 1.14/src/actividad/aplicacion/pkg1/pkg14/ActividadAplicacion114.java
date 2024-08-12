package actividad.aplicacion.pkg1.pkg14;

//Crea un ptograma que pìda la base y la altura de un triangulo
//y muestre su area.

import java.util.Scanner;


public class ActividadAplicacion114 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la altura : ");
        double altura = sc.nextDouble();
        System.out.println("Introduce la base : ");
        double base = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es : " + area);
        
    }
    
}
