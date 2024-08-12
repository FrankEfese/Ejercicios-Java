package actividad.resuelta.pkg14.pkg8;

//Escribe un programa que muestre todos los alumnos de un curso cuya nota es mayor que cierta nota de corte. 
//Tanto el curso como la nota sera introducidos por teclado. 
import java.util.*;
import java.sql.*;

public class ActividadResuelta148 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/instituto";
        Scanner sc = new Scanner(System.in);

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

            PreparedStatement s = c.prepareStatement("SELECT * FROM ALUMNO WHERE NOTA > ? AND CURSO = ?");

            System.out.println("Introduce la nota : ");
            int nota = sc.nextInt();

            System.out.println("Introduce el curso : ");
            sc.nextLine();
            String curso = sc.nextLine();

            s.setInt(1, nota);
            s.setString(2, curso);

            ResultSet r = s.executeQuery();

            while (r.next()) {

                System.out.println("Nombre : " + r.getString("NOMBRE") + " /  Curso : " + r.getString("CURSO") + " /  Nota : " + r.getInt("NOTA"));

            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
