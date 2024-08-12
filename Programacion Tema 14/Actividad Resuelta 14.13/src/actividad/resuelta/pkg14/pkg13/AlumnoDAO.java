package actividad.resuelta.pkg14.pkg13;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {

    private Connection c;

    public AlumnoDAO() {
        this.c = conexion();
    }

    public Connection conexion() {

        String url = "jdbc:mysql://localhost:3306/instituto";

        Connection c = null;

        try {

            c = DriverManager.getConnection(url, "root", "");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return c;

    }

    public void crear(Alumno a) {

        if (a != null) {

            try {

                PreparedStatement s = c.prepareStatement("INSERT INTO ALUMNO (NUM , NOMBRE , EDAD , NOTA , CURSO) VALUES (? , ? , ? , ? , ?)");
                s.setInt(1, a.getId());
                s.setString(2, a.getNombre());
                s.setInt(3, a.getEdad());
                s.setInt(4, a.getNota());
                s.setString(5, a.getCurso());
                s.executeUpdate();

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }

        }

    }

    public void borrar(Alumno a) {

        try {

            PreparedStatement s = c.prepareStatement("DELETE FROM ALUMNO WHERE NUM = ?");
            s.setInt(1, a.getId());

            s.executeUpdate();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public void leer(Alumno a) {

        try {

            PreparedStatement s = c.prepareStatement("SELECT * FROM ALUMNO WHERE NUM = ?");
            s.setInt(1, a.getId());

            ResultSet r = s.executeQuery();

            if (r.next()) {

                System.out.println("ID : " + r.getInt("NUM") + " / Nombre : " + r.getString("NOMBRE") + " / Edad : "
                        + r.getInt("EDAD") + " / Nota : " + r.getInt("NOTA") + " / Curso : " + r.getString("CURSO"));

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public void actualizar(Alumno a) {

        if (a != null) {

            try {

                PreparedStatement s = c.prepareStatement("UPDATE ALUMNO SET NOMBRE = ? , EDAD = ? , NOTA = ? , CURSO = ? WHERE NUM = ?");
                s.setInt(5, a.getId());
                s.setString(1, a.getNombre());
                s.setInt(2, a.getEdad());
                s.setInt(3, a.getNota());
                s.setString(4, a.getCurso());
                s.executeUpdate();

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }
        }

    }

    public List<Alumno> todosAlumno() {

        List<Alumno> alumnos = new ArrayList<>();

        try {

            PreparedStatement s = c.prepareStatement("Select * From Alumno");

            ResultSet r = s.executeQuery();

            while (r.next()) {

                alumnos.add(new Alumno(r.getInt("NUM"), r.getString("NOMBRE"), r.getInt("edad"), r.getInt("nota"), r.getString("curso")));

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return alumnos;

    }

}
