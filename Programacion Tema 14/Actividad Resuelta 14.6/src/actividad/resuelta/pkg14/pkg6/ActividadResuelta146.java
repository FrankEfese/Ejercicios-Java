package actividad.resuelta.pkg14.pkg6;

//Mostrar el nombre y la nota de los alumnos . Despues el alumno con la max nota y la min. 
import java.sql.*;

public class ActividadResuelta146 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/instituto";

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet r = s.executeQuery("SELECT NOMBRE , NOTA FROM ALUMNO ORDER BY NOTA DESC");

            System.out.println("ALUMNOS : ");
            System.out.println("----------------------");
            while (r.next()) {

                System.out.println("Nombre : " + r.getString("NOMBRE") + " / Nota : " + r.getInt("NOTA"));

            }

            r.beforeFirst();
            r = s.executeQuery("SELECT NOMBRE , NOTA FROM ALUMNO WHERE NOTA = (SELECT MAX(NOTA) FROM ALUMNO)");

            System.out.println("");
            System.out.println("ALUMNO MAX NOTA : ");
            System.out.println("-------------------");

            while (r.next()) {

                System.out.println("Nombre : " + r.getString("NOMBRE") + " / Nota : " + r.getInt("NOTA"));

            }

            r.beforeFirst();
            r = s.executeQuery("SELECT NOMBRE , NOTA FROM ALUMNO WHERE NOTA = (SELECT MIN(NOTA) FROM ALUMNO)");

            System.out.println("");
            System.out.println("ALUMNO MIN NOTA : ");
            System.out.println("-------------------");

            while (r.next()) {

                System.out.println("Nombre : " + r.getString("NOMBRE") + " / Nota : " + r.getInt("NOTA"));

            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

}
