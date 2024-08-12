package actividad.aplicacion.pkg1.pkg11;

//Un economista te ha encargado un programa para realizar calculos con el IVA. 
//La aplicacion debe solicitar la base imponible y el IVA que se debe aplicar. 
//Muestra por pantalla el importe correspondiente al IVA y el total.

import java.util.Scanner;


public class ActividadAplicacion111 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el precio del producto : ");
        double preProd = sc.nextDouble();
        System.out.println("Introduce el IVA a aplicar : ");
        double iva = sc.nextInt();
        double ivaAplicar = (iva / 100) + 1;
      
       
        
        
        double totalConIva = (preProd * ivaAplicar);
        double ivaTotal = totalConIva - preProd;
        System.out.println("El Iva supone : " + ivaTotal);
        System.out.println("El total a pagar es : " + totalConIva);
        
    }
    
}
