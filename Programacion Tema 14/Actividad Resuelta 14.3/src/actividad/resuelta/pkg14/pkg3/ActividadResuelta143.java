package actividad.resuelta.pkg14.pkg3;

//Solicita el numero de un alumno y eliminalo de la base de datos. 
import java.sql.*;
import java.util.*;

public class ActividadResuelta143 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/instituto";
        Scanner sc = new Scanner(System.in);

        try {
            Connection c = DriverManager.getConnection(url, "root", "");
            Statement s = c.createStatement();
            System.out.println("Introduce el ID del alumno que deseas Eliminar : ");
            int id = sc.nextInt();

            s.executeUpdate("DELETE FROM ALUMNO WHERE num = " + id);
            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
