package actividad.aplicacion.pkg14.pkg16;

//Usar la clase DAOEmpleado para la inserccion de los empleados. 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.*;

public class ActividadAplicacion1416 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try {
            
            System.out.println("Introduce el ID : ");
            int id = sc.nextInt();
            System.out.println("Introduce el Nombre : ");
            sc.nextLine();
            String nom = sc.nextLine();
            System.out.println("Introduce la Edad : ");
            int edad = sc.nextInt();
            System.out.println("Introduce la Oficina : ");
            int ofi = sc.nextInt();
            System.out.println("Introduce su Puesto : ");
            sc.nextLine();
            String puesto = sc.nextLine();
            
            Empleado a = new Empleado(id, nom, edad, ofi, puesto, LocalDate.now());
            
            EmpleadoDAO.crear(a);
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
    
}
