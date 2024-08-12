package actividad.aplicacion.pkg11.pkg13;

//Escribe un programa que lea de un fichero binario una tabla de numeros double 
//y despues muestre el contenido de la tabla por consola. 
import java.io.*;
import java.util.*;

public class ActividadAplicacion1113 {
    
    public static void main(String[] args) {
        
        double[] numeros;
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("tablaDouble.dat"))) {
            
            numeros = (double[]) in.readObject();
            System.out.println(Arrays.toString(numeros));
            
        } catch (IOException ex) {
            
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
