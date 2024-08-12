package actividad.aplicacion.pkg14.pkg12;

//Cargar todas las oficinas de la base de datos en una lista de oficinas . Muestra el contenido. 
import java.util.*;
import java.sql.*;

public class ActividadAplicacion1412 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/INSTITUTO";

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("SELECT DISTINCT CIUDAD FROM OFICINA");

            List<String> ciudadOficina = new ArrayList<>();

            while (r.next()) {

                ciudadOficina.add(r.getString("CIUDAD"));

            }

            System.out.println(ciudadOficina);
            
            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

}
