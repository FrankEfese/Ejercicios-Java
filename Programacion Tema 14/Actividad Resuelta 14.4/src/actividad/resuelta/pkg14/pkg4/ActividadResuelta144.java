package actividad.resuelta.pkg14.pkg4;

//Mostrar el Nombre , la Edad y la Nota de todos los alumnos de un curso(1B , 2B , 3B) 
//que se solicitara por teclado. 
import java.util.*;
import java.sql.*;

public class ActividadResuelta144 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/instituto";
        Scanner sc = new Scanner(System.in);

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

            Statement s = c.createStatement();

            System.out.println("Introduce el curso : ");
            String curso = sc.nextLine();

            ResultSet r = s.executeQuery("SELECT NOMBRE , EDAD , NOTA FROM ALUMNO WHERE CURSO = " + "'" + curso + "'");

            while (r.next()) {

                System.out.println("Nombre : " + r.getString("NOMBRE") + " Edad : " + r.getInt("EDAD") + " Nota : " + r.getInt("NOTA"));

            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
