package actividad.aplicacion.pkg14.pkg13;

//Que la app solicite al usuario el nombre de una ciudad y que muestre las oficinas ubicadas en dicha ciudad.
import java.util.*;
import java.sql.*;

public class ActividadAplicacion1413 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/INSTITUTO";

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

            System.out.println("Introduce el nombre de la Ciudad : ");
            String ciudad = sc.nextLine().toUpperCase();

            PreparedStatement s = c.prepareStatement("SELECT * FROM OFICINA WHERE UPPER (CIUDAD) = ?");
            s.setString(1, ciudad);

            ResultSet r = s.executeQuery();

            while (r.next()) {

                System.out.println("ID : " + r.getInt("ID") + " / Ciudad : " + r.getString("CIUDAD"));

            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
