package actividad.aplicacion.pkg13.pkg13;

//Fusiona dos listas , cada una con 20 enteros aleatorios entre 1 y 100 , en un Stream ordenado sin repeticiones. 
//Muestra por pantalla. 
import java.util.*;
import java.util.stream.Stream;

public class ActividadAplicacion1313 {
    
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        
        for (int x = 0; x < 20; x++) {
            
            lista.add((int) (Math.random() * 100 + 1));
            lista2.add((int) (Math.random() * 100 + 1));
        }
        
        Collections.sort(lista);
        Collections.sort(lista2);
        System.out.println(lista);
        System.out.println(lista2);
        System.out.println();
        
        Stream<Integer> s = Stream.concat(lista.stream(), lista2.stream());
        s.sorted().distinct().forEach(c -> System.out.print(c + ","));
    }
    
}
