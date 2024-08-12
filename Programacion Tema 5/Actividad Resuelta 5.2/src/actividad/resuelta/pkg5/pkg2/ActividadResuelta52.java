package actividad.resuelta.pkg5.pkg2;

//Diseñar un programa que solicite al usuario que introduzca por teclado 5 numeros 
//decimales. A continuacion , mostrar los numeros en el mismo orden que se han introducido. 
import java.util.*;

public class ActividadResuelta52 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double tabla[] = new double[5];
        
        for (int x = 0; x < tabla.length; x++) {
            
            System.out.println("Introduce un numero decimal : ");
            tabla[x] = sc.nextDouble();
        }
        
        System.out.println(Arrays.toString(tabla));
    }
    
}
