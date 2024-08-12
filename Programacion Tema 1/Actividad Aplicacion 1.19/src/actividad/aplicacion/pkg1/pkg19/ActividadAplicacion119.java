package actividad.aplicacion.pkg1.pkg19;

//Una empresa que gestiona un parque acuatico te solicita una aplicacion que les ayude a calcular
//el importe que hay que cobrar en la taquillapor la compra de una serie de entradas (cuyo numero
//sera introducido por el usuario). Existen dos tipos de entrada : infantil (15,50) y 
//adulto (20). En el caso de que el importe total sea igual o superior a 100 , se 
//aplicara automaticamente un bono descuento del 5%.

import java.util.Scanner;


public class ActividadAplicacion119 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        final int entrAdulto = 20;
        final double entrInfantil = 15.50;
        System.out.println("Introduce cuantas entradas de infantil quieres : ");
        int inf = sc.nextInt();
        System.out.println("Introduce cuantas entradas de adulto quieres : ");
        int adul = sc.nextInt();
        double total = (entrAdulto * adul) + (entrInfantil * inf);
        total = total < 100 ? total : total - (total * 0.05);
        System.out.println("El total a pagar es : " + total);
        
    }
    
}
