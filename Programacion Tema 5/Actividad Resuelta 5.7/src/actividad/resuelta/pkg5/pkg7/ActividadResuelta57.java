package actividad.resuelta.pkg5.pkg7;

//Implementar la funcion int [] sinRepes (int t []) que construye y devuelve una tabla 
//de la longitud apropiada , con los elementos de t , donde se han eliminado los datos repetidos. 
import java.util.*;

public class ActividadResuelta57 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tabla[] = new int[10];
        for (int x = 0; x < 10; x++) {
            
            System.out.println("Introduce un numero : ");
            int n = sc.nextInt();
            tabla[x] = n;
        }
        
        System.out.println(Arrays.toString(tabla));
        System.out.println("SIN REPETIDOS");
        tabla = sinRepes(tabla);
        
        System.out.println(Arrays.toString(tabla));
    }
    
    static int[] sinRepes(int t[]) {
        
        int sinRepes[] = new int[0];
        int cont = 0;
        int indice = 0;
        
        while (indice < t.length) {
            
            for (int x = 0; x < sinRepes.length; x++) {
                
                if (sinRepes[x] == t[indice]) {
                    cont++;
                }
                
            }
            
            if (cont == 0) {
                
                sinRepes = Arrays.copyOf(sinRepes, sinRepes.length + 1);
                sinRepes[sinRepes.length - 1] = t[indice];
                
            }
            
            cont = 0;
            indice++;
            
        }
        
        return sinRepes;
        
    }
    
}
