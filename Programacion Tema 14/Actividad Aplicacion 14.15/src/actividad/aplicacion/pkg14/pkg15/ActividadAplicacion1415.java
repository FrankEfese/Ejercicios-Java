package actividad.aplicacion.pkg14.pkg15;

//Crea un programa que lea todos los datos de un empleado , excepto la fecha de 
//contratacion que sera la de hoy y los inserte en la base de datos. 
import java.util.*;
import java.sql.*;
import java.time.LocalDate;

public class ActividadAplicacion1415 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/INSTITUTO";

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

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

            PreparedStatement s = c.prepareStatement("INSERT INTO EMPLEADOS (ID , NOMBRE , EDAD , OFICINA , PUESTO , CONTRATO) VALUES (? , ? , ? , ? , ? , ?)");
            s.setInt(1, id);
            s.setString(2, nom);
            s.setInt(3, edad);
            s.setInt(4, ofi);
            s.setString(5, puesto);
            s.setDate(6, java.sql.Date.valueOf(LocalDate.now()));
            int x = s.executeUpdate();

            if (x > 0) {
                System.out.println("\nAgregado");
            }
            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

}
