package actividad.aplicacion.pkg14.pkg22;

//Repetir la actividad anterior pero mostrando las oficinas cuya superficie es mayor a la introducida por teclado. 
import java.util.Scanner;

public class ActividadAplicacion1422 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            
            System.out.println("Introduce la Superficie : ");
            int id = sc.nextInt();
            
            EmpleadoDAO.mostrarOficinasSuperficie(id);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
