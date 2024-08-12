package actividad.aplicacion.pkg11.pkg23;

//Implementa el metodo Integer [] fusion (String fich 1 , String fich 2) al que se le pasan los nombres de dos ficheros 
//que contienen dos listas ordenadas y devuelve una tabla ordenada. 
import java.util.*;
import java.io.*;

public class ActividadAplicacion1123 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del Primer Fichero : ");
        String f1 = sc.nextLine();
        System.out.println("Introduce el nombre del Segundo Fichero : ");
        String f2 = sc.nextLine();
        Integer tabla[] = fusion(f1, f2);
        System.out.println(Arrays.toString(tabla));
        
    }
    
    static Integer[] fusion(String n, String n2) {
        
        Integer tabla[] = new Integer[0];
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(n))) {
            
            Integer a = in.readInt();
            
            while (a != null) {
                
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = a;
                a = in.readInt();
                
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(n2))) {
            
            Integer a = in.readInt();
            
            while (a != null) {
                
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = a;
                a = in.readInt();
                
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        Arrays.sort(tabla);
        
        return tabla;
        
    }
    
}
