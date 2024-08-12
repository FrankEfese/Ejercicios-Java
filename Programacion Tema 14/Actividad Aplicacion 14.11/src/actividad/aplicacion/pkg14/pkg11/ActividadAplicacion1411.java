package actividad.aplicacion.pkg14.pkg11;

//Crea un programa que muestre todos los empleados. 
import java.sql.*;

public class ActividadAplicacion1411 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/INSTITUTO";

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("SELECT * FROM EMPLEADOS");

            while (r.next()) {

                System.out.println("ID : " + r.getInt("ID") + " / Nombre : " + r.getString("NOMBRE") + " / Edad : " + r.getInt("EDAD") + " / Oficina : " + r.getInt("OFICINA")
                        + " / Puesto : " + r.getString("PUESTO") + " / Contrato : " + r.getDate("CONTRATO"));

            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

}
