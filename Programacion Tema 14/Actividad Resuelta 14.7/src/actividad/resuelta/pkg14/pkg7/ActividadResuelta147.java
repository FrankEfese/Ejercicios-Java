package actividad.resuelta.pkg14.pkg7;

//Implementa un programa que solicite el nombre de un alumno y lo elimine. 
import java.util.*;
import java.sql.*;

public class ActividadResuelta147 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/instituto";
        Scanner sc = new Scanner(System.in);

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

            Statement s = c.createStatement();

            System.out.println("Introduce el nombre del alumno que deseas eliminar : ");
            String nom = sc.nextLine();

            s.executeUpdate("DELETE FROM ALUMNO WHERE NOMBRE = " + nom);
            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

}
