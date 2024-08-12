package actividad.aplicacion.pkg14.pkg14;

//Muestra un listado con el nombre y la edad de los empleados entre un rango de edad introducido por teclado. 
import java.util.*;
import java.sql.*;

public class ActividadAplicacion1414 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/INSTITUTO";

        try {

            Connection c = DriverManager.getConnection(url, "root", "");
            System.out.println("Introduce la edad : ");
            int n = sc.nextInt();
            System.out.println("Introduce otra edad : ");
            int m = sc.nextInt();

            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT NOMBRE , EDAD FROM EMPLEADOS WHERE EDAD BETWEEN " + Math.min(n, m) + " AND " + Math.max(n, m));

            while (r.next()) {

                System.out.println("Nombre : " + r.getString("NOMBRE") + " / Edad : " + r.getInt("EDAD"));

            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
