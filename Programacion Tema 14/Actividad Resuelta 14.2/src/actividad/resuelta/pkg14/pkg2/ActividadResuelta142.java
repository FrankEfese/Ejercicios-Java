package actividad.resuelta.pkg14.pkg2;

//Realizar una aplicacion que solicite todos los datos de un nuevo alumno y los inserte en la base de datos. 
import java.sql.*;
import java.util.*;

public class ActividadResuelta142 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/instituto";
        Scanner sc = new Scanner(System.in);

        try {

            Connection c = DriverManager.getConnection(url, "root", "");

            PreparedStatement s = c.prepareStatement("INSERT INTO ALUMNO (NUM , NOMBRE , EDAD , NOTA , CURSO) VALUES (? , ? , ? , ? ,?)");

            System.out.println("Introduce su ID : ");
            int id = sc.nextInt();
            System.out.println("Introduce el Nombre del Alumno : ");
            sc.nextLine();
            String nom = sc.nextLine();
            System.out.println("Introduce la Edad : ");
            int edad = sc.nextInt();
            System.out.println("Introduce su Nota : ");
            int nota = sc.nextInt();
            System.out.println("Introduce su Curso : ");
            sc.nextLine();
            String curso = sc.nextLine();

            s.setInt(1, id);
            s.setString(2, nom);
            s.setInt(3, edad);
            s.setInt(4, nota);
            s.setString(5, curso);
            s.executeUpdate();

            c.close();
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
