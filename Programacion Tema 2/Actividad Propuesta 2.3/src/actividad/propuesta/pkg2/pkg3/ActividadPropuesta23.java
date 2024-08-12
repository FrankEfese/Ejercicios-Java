package actividad.propuesta.pkg2.pkg3;

//Escribe una aplicacion que pida al usuario dos numero enteros y muestre : true , si 
//ambos numeros son disitntos entre si o alguno de ellos es cero; y false en caso contrario. 

import java.util.Scanner;

public class ActividadPropuesta23 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        int m = sc.nextInt();
        
        boolean t = n != m || n == 0 || m == 0;
        
        System.out.println("El resultado es : " + t);
        
    }
    
}
