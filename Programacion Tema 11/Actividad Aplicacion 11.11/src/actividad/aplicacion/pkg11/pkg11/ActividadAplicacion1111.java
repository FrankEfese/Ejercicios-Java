package actividad.aplicacion.pkg11.pkg11;

//Pide un valor Double por consola y guardalo en un archivo binario. 
import java.io.*;
import java.util.*;

public class ActividadAplicacion1111 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un valor de tipo double : ");
        double n = sc.nextDouble();
        
        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("valorDouble.dat"))) {
            
            in.writeDouble(n);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
