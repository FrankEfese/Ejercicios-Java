package actividad.resuelta.pkg5.pkg8;

//Leer y almacenar n numeros enteros en una tabla , a partir de la que se construiran 
//otras dos tablas con los elementos con valores pares e impares de la primera , 
//respectivamente. Las tablas pares e impares deben mostrarse ordenadas. 
import java.util.*;

public class ActividadResuelta58 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int tabla[] = new int[10];
        int pares[] = new int[0];
        int impar[] = new int[0];
        
        for (int x = 0; x < tabla.length; x++) {
            
            System.out.println("Introduce un numero : ");
            int n = sc.nextInt();
            tabla[x] = n;
        }
        
        for (int a : tabla) {
            
            if (a % 2 == 0) {
                
                pares = Arrays.copyOf(pares, pares.length + 1);
                pares[pares.length - 1] = a;
                
            } else {
                
                impar = Arrays.copyOf(impar, impar.length + 1);
                impar[impar.length - 1] = a;
            }
            
        }
        
        Arrays.sort(pares);
        Arrays.sort(impar);
        
        System.out.println("PARES");
        System.out.println(Arrays.toString(pares));
        System.out.println("IMPAR");
        System.out.println(Arrays.toString(impar));
        
    }
    
}
