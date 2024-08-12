package actividad.resuelta.pkg11.pkg3;

//Pedir un entero n por consola y a continuacion pedir n numeros de tipo double 
//que iremos insertando en una tabla . Guardar la tabla en un archivo binario. 
import java.util.*;
import java.io.*;

public class ActividadResuelta113 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero : ");
        int n = sc.nextInt();
        
        double tabla[] = new double[n];
        
        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("tablaDouble.dat"))) {
            
            for (int x = 0; x < n; x++) {
                
                System.out.println("Introduce un numero de tipo Double : ");
                tabla[x] = sc.nextDouble();
                
            }
            
            in.writeObject(tabla);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
