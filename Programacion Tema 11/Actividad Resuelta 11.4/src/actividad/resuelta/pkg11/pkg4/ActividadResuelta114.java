package actividad.resuelta.pkg11.pkg4;

//Leer de un archivo datos.dat 10 numeros enteros , guardandolos en una tabla de tipo int .
import java.util.*;
import java.io.*;

public class ActividadResuelta114 {
    
    public static void main(String[] args) {
        
        int tabla[] = new int[0];
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
            
            int n = in.read();
            
            while (n != -1) {
                
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length - 1] = n;
                n = in.read();
            }
            
            System.out.println(Arrays.toString(tabla));
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
