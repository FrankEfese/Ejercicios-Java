package actividad.aplicacion.pkg5.pkg14;

//El ayuntamiento de tu localidad te ha encargado una app que ayude a realizar encuestas para conocer el nivel
//adquisitivo de los habitantes del municipio . Para ello tendras que preguntar el sueldo a cada persona. 
//Para finalizar introduce un -1. 
//Los sueldos ordenados de forma decreciente.
//El sueldo max y min. 
//La media. 
import java.util.*;

public class ActividadAplicacion514 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double sueldos[] = new double[0];
        double s;
        
        do {
            System.out.println("Introduce tu sueldo : ");
            s = sc.nextDouble();
            
            if (s > 0) {
                
                sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
                sueldos[sueldos.length - 1] = s;
                
            }
            
        } while (s > 0);
        
        sueldos = orden(sueldos);
        System.out.println(Arrays.toString(sueldos));
        System.out.println("La media de los sueldos : " + media(sueldos));
        System.out.println("El maximo sueldo : " + sueldos[0]);
        System.out.println("El minimo sueldo : " + sueldos[sueldos.length - 1]);
        
    }
    
    static double[] orden(double t[]) {
        
        double orden[] = new double[t.length];
        Arrays.sort(t);
        int cont = 0;
        for (int x = t.length - 1; x >= 0; x--) {
            
            orden[cont] = t[x];
            cont++;
            
        }
        
        return orden;
        
    }
    
    static double media(double t[]) {
        
        int suma = 0;
        int cont = 0;
        
        for (double a : t) {
            
            suma += a;
            cont++;
            
        }
        
        return suma / cont;
        
    }
    
}
