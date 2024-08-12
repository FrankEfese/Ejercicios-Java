package actividad.resuelta.pkg13.pkg4;

//Implementa un metodo estatico al que se le pasa como parametro una tabla de tipo generico
//y un predicado . El metodo devuelve otra tabla con los elementos de la tabla original 
//que verifiquen la condicion del predicado . Aplicarlo a una tabla de 50 enteros entre 1 y 100 
//y devuelva los multiplos de 3. 
import java.util.*;
import java.util.function.Predicate;

public class ActividadResuelta134 {
    
    public static void main(String[] args) {
        
        Integer[] numeros = new Integer[50];
        
        for (int i = 0; i < 50; i++) {
            numeros[i] = i + 1;
        }
        
        Integer tabla[] = multiplo(numeros, p -> p % 3 == 0);
        System.out.println(Arrays.toString(tabla));
        
    }
    
    static <T> T[] multiplo(T tabla[], Predicate<T> p) {
        
        T mul3[] = Arrays.copyOf(tabla, 0);
        
        for (T a : tabla) {
            
            if (p.test(a)) {
                mul3 = Arrays.copyOf(mul3, mul3.length + 1);
                mul3[mul3.length - 1] = a;
            }
            
        }
        
        return mul3;
    }
    
}
