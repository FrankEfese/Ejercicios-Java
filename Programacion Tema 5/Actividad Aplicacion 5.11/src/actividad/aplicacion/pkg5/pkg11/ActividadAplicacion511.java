package actividad.aplicacion.pkg5.pkg11;

//Realiza la funcion int [] buscarTodos(int t[] , int clave) que crea y devuelve una tabla con todos los indices
//de los elementos donde se encuentra la clave de busqueda .En el caso de que clave no se encuentre en la tabla
//la funcion devolvera una tabla vacia. 
import java.util.*;

public class ActividadAplicacion511 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int tabla[] = new int[10];
        
        for (int x = 0; x < tabla.length; x++) {
            System.out.println("Introduce un numero : ");
            tabla[x] = sc.nextInt();
        }
        
        System.out.println("Introduce el valor que quieras buscar : ");
        int v = sc.nextInt();
        
        tabla = buscarV(tabla, v);
        
        System.out.println(Arrays.toString(tabla));
        
    }
    
    static int[] buscarV(int t[], int v) {
        
        int tablaV[] = new int[0];
        
        for (int x = 0; x < t.length; x++) {
            
            if (t[x] == v) {
                
                tablaV = Arrays.copyOf(tablaV, tablaV.length + 1);
                tablaV[tablaV.length - 1] = x;
                
            }
            
        }
        
        return tablaV;
        
    }
    
}
