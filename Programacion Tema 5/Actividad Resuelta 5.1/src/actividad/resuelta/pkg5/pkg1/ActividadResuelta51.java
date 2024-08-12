package actividad.resuelta.pkg5.pkg1;

//Crear una tabla de longitud 10 que se inicializara con numeros aleatorios entre 1 y 100. 
//Mostrar la suma de todos los numeros aleatorios de la tabla. 
import java.util.*;

public class ActividadResuelta51 {
    
    public static void main(String[] args) {
        
        int tabla[] = new int[10];
        int suma = 0;
        
        for (int x = 0; x < tabla.length; x++) {
            
            int a = (int) (Math.random() * 100 + 1);
            
            tabla[x] = a;
            
        }
        
        for (int x = 0; x < tabla.length; x++) {
            
            suma += tabla[x];
            
        }
        
        System.out.println(Arrays.toString(tabla));
        
        System.out.println("La suma de todos los numeros : " + suma);
    }
    
}
