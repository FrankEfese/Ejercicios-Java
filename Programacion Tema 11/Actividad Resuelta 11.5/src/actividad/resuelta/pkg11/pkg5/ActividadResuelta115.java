package actividad.resuelta.pkg11.pkg5;

//Leer una tabla de neteros de un archivo.dat . 
import java.util.*;
import java.io.*;

public class ActividadResuelta115 {
    
    public static void main(String[] args) {
        
        int tabla[];
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
            
            tabla = (int[]) in.readObject();
            
            System.out.println(Arrays.toString(tabla));
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            
        } catch (ClassNotFoundException e) {
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
}
