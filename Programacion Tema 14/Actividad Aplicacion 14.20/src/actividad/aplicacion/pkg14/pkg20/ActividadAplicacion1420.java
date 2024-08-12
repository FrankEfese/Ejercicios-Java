package actividad.aplicacion.pkg14.pkg20;

//Solicita por teclado el id de un empleado y borralo. 
import java.util.Scanner;

public class ActividadAplicacion1420 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            
            System.out.println("Introduce el ID del empleado para Eliminarlo : ");
            int id = sc.nextInt();
            
            EmpleadoDAO.borrar(id);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
