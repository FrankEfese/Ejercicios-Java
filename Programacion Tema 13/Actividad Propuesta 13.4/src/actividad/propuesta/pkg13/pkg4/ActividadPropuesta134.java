package actividad.propuesta.pkg13.pkg4;

//Implementa un metodo que aplica n veces la transformacion expresada por f a los elementos de la lista. 
//Aplicala para incrementar los elementos de original en n unidades. Usa referencias a funciones. 
import java.util.*;
import java.util.function.Function;

public class ActividadPropuesta134 {
    
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();
        
        for (int x = 0; x < 10; x++) {
            lista.add(x + 1);
        }
        int x = 5;
        
        Function<Integer, Integer> f = ActividadPropuesta134::suma;
        
        System.out.println(incremento(lista, f, x));
        
    }
    
    static List<Integer> incremento(List<Integer> l, Function<Integer, Integer> f, int n) {
        
        List<Integer> lista = new ArrayList<>();
        
        for (Integer a : l) {
            lista.add(f.apply(a + n));
        }
        
        return lista;
        
    }
    
    static Integer suma(Integer x) {
        
        return x;
        
    }
    
}
