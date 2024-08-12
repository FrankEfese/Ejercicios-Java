package actividad.propuesta.pkg5.pkg7;

//El numero de la suerte de una persona puede calcularse a partir de sus numeros favoritos. 
//De entre estos se escogen 2 al azar , que se eliminan de la lista, pero en su lugar se añade 
//la media aritmetica de los dos eliminados a la lista . El proceso se repite hasta que solo quede un numero. 
import java.util.*;

public class ActividadPropuesta57 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double n = 1;
        double num[] = new double[0];
        do {
            System.out.println("Introduce tus numeros de la suerte  (introduce 0 para terminar ) : ");
            n = sc.nextDouble();
            
            if (n != 0) {
                
                num = Arrays.copyOf(num, num.length + 1);
                num[num.length - 1] = n;
                
            }
            
        } while (n != 0);
        
        num = suerte(num);
        System.out.println(Arrays.toString(num));
        
    }
    
    static double[] suerte(double t[]) {
        
        double p[] = t;
        
        while (p.length > 1) {
            Arrays.sort(p);
            
            int aux = (int) (Math.random() * (p.length - 1) + 0);
            
            double media = p[aux];
            
            p = borrarV(p, aux);
            aux = (int) (Math.random() * (p.length - 1) + 0);
            double media2 = p[aux];
            p = borrarV(p, aux);
            
            p = Arrays.copyOf(p, p.length + 1);
            p[p.length - 1] = (media + media2) / 2;
            
        }
        
        return p;
        
    }
    
    static double[] borrarV(double t[], int v) {
        
        double tabla[] = new double[0];
        
        for (int x = 0; x < v; x++) {
            
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = t[x];
            
        }
        
        for (int x = v + 1; x < t.length; x++) {
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = t[x];
            
        }
        
        return tabla;
        
    }
    
}
