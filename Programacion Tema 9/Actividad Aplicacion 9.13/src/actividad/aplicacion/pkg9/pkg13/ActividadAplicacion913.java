package actividad.aplicacion.pkg9.pkg13;

//Diseñar la clase futbolista con los siguientes atributos (dni , nombre , edad y num de goles). 
//-Constructor y metodos string y equals basado en el dni. 
//-Comparable mediante el dni. 
//-Dos comparator en el nombre y en la edad. 
import java.util.*;

public class ActividadAplicacion913 {
    
    public static void main(String[] args) {
        
        Futbolista f = new Futbolista("3245252A", "Pepe", 23, 5);
        Futbolista f2 = new Futbolista("4357324B", "Jose", 19, 6);
        Futbolista f3 = new Futbolista("7874722L", "Manu", 13, 7);
        Futbolista f4 = new Futbolista("7547434N", "Fran", 33, 2);
        Futbolista f5 = new Futbolista("2353245M", "Alex", 25, 9);
        
        Futbolista tabla[] = new Futbolista[5];
        tabla[0] = f;
        tabla[1] = f2;
        tabla[2] = f3;
        tabla[3] = f4;
        tabla[4] = f5;
        
        System.out.println("Orden por DNI: ");
        Arrays.sort(tabla);
        System.out.println(Arrays.deepToString(tabla));
        System.out.println("");
        System.out.println("Orden por Nombre : ");
        Arrays.sort(tabla, new CompNombre());
        System.out.println(Arrays.deepToString(tabla));
        System.out.println("");
        System.out.println("Orden por Edad : ");
        Arrays.sort(tabla, new CompEdad());
        System.out.println(Arrays.deepToString(tabla));
        
    }
    
}
