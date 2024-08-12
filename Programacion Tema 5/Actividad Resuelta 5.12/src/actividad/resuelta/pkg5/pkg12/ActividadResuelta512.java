package actividad.resuelta.pkg5.pkg12;

//Crea una tabla bidimensional de longitud 5 x 5 y rellenala de la siguiente forma : 
//el elemento de la posicion [n][m] debe contener el valor 10 x n + m . Despues se debe mostrar 
//su contenido. 
import java.util.*;

public class ActividadResuelta512 {
    
    public static void main(String[] args) {
        
        int t[][] = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                t[i][j] = 10 * i + j;
            }
        }
        
        System.out.println(Arrays.deepToString(t));
        
    }
    
}
