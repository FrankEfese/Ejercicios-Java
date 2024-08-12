package actividad.aplicacion.pkg14.pkg18;

import java.sql.*;

public class EmpleadoDAO {

    final static String url = "jdbc:mysql://localhost:3306/INSTITUTO";

    static Connection conexion() {

        Connection c = null;

        try {

            c = DriverManager.getConnection(url, "root", "");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return c;
    }

    static void crear(Empleado a) {

        try {

            Connection c = conexion();

            PreparedStatement s = c.prepareStatement("INSERT INTO EMPLEADOS (ID , NOMBRE , EDAD , OFICINA , PUESTO , CONTRATO) VALUES (? , ? , ? , ? , ? , ?)");

            s.setInt(1, a.getId());
            s.setString(2, a.getNombre());
            s.setInt(3, a.getEdad());
            s.setInt(4, a.getOficina());
            s.setString(5, a.getPuesto());
            s.setDate(6, java.sql.Date.valueOf(a.getFecha()));
            int x = s.executeUpdate();

            if (x > 0) {
                System.out.println("\nAgregado");
            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    static boolean comprobarId(Empleado a) {

        boolean esta = false;
        try {

            Connection c = conexion();

            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("SELECT ID FROM EMPLEADOS");

            while (r.next()) {

                if (r.getInt("ID") == a.getId()) {
                    esta = true;
                }
            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return esta;

    }

    static boolean comprobarOfi(Empleado a) {

        boolean esta = false;
        try {

            Connection c = conexion();

            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("SELECT OFICINA FROM EMPLEADOS");

            while (r.next()) {

                if (r.getInt("OFICINA") == a.getOficina()) {
                    esta = true;
                }
            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return esta;

    }

}