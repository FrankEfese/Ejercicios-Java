package actividad.propuesta.pkg11.pkg1;

//Repite la act resuelta 11.1 escribiendo la tabla de enteros en el archivo datos.dat 
//y no los enteros individualmente. 
import java.util.*;
import java.io.*;

public class ActividadPropuesta111 {
    
    public static void main(String[] args) {
        
        int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
            
            in.writeObject(enteros);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            
        }
    }
    
}
