package actividad.resuelta.pkg14.pkg1;

//Incrementar la nota media en un punto a los alumnos. 
//Usar consulta SQL que haga uso de Update. 
import java.sql.*;

public class ActividadResuelta141 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/instituto";

        try {
            Connection c = DriverManager.getConnection(url, "root", "");

            Statement m = c.createStatement();

            m.executeUpdate("UPDATE ALUMNO SET NOTA = NOTA +1");
            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

}
