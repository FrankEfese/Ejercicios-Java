package actividad.resuelta.pkg9.pkg10;

//Implementar una clase comparadora que permita ordenar numeros enteros en sentido
//decreciente. Crear una tabla de 20 numeros aleatorios comprendidos entre 1 y 100 y ordenarla en sentido decreciente.  
import java.util.*;

public class ActividadResuelta910 {
    
    public static void main(String[] args) {
        
        Integer tabla[] = new Integer[20];
        
        for (int x = 0; x < tabla.length; x++) {
            
            tabla[x] = (int) (Math.random() * 100 + 1);
        }
        
        Arrays.sort(tabla, new OrdenDecre());
        System.out.println(Arrays.toString(tabla));
    }
    
}
