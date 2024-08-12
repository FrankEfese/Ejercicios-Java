package actividad.resuelta.pkg14.pkg5;

//Repetir la actividad anterior pero mostrando los datos en orden inverso. 
import java.util.*;
import java.sql.*;

public class ActividadResuelta145 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/instituto";
        Scanner sc = new Scanner(System.in);

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            System.out.println("Introduce el curso : ");
            String curso = sc.nextLine();

            ResultSet r = s.executeQuery("SELECT NOMBRE , EDAD , NOTA FROM ALUMNO WHERE CURSO = " + "'" + curso + "'");

            r.afterLast();

            while (r.previous()) {

                System.out.println("Nombre : " + r.getString("NOMBRE") + " Edad : " + r.getInt("EDAD") + " Nota : " + r.getInt("NOTA"));

            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

}
