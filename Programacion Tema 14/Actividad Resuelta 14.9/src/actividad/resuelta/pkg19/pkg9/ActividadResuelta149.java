package actividad.resuelta.pkg19.pkg9;

//Diseñar una app que muestre a los alumnos con nota 6 y 7 , y entre 7 y 9. Orden Ascendente
import java.util.*;
import java.sql.*;

public class ActividadResuelta149 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/instituto";
        Scanner sc = new Scanner(System.in);

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("SELECT * FROM ALUMNO WHERE NOTA BETWEEN 6 AND 7");

            System.out.println("ALUMNOS CON NOTA ENTRE 6 Y 7");
            System.out.println("---------------------------");

            while (r.next()) {

                System.out.println("ID : " + r.getInt("NUM") + " / Nombre : " + r.getString("NOMBRE") + " / Nota : "
                        + r.getInt("NOTA") + " / Curso : " + r.getString("CURSO") + " / Edad : " + r.getInt("EDAD"));

            }

            r = s.executeQuery("SELECT * FROM ALUMNO WHERE NOTA BETWEEN 7 AND 9");

            System.out.println("");

            System.out.println("ALUMNOS CON NOTA ENTRE 7 Y 9");
            System.out.println("---------------------------");

            while (r.next()) {

                System.out.println("ID : " + r.getInt("NUM") + " / Nombre : " + r.getString("NOMBRE") + " / Nota : "
                        + r.getInt("NOTA") + " / Curso : " + r.getString("CURSO") + " / Edad : " + r.getInt("EDAD"));

            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

}
