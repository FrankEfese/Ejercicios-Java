package actividad.aplicacion.pkg14.pkg21;

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

    static boolean comprobarId(int id) {

        boolean esta = false;
        try {

            Connection c = conexion();

            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("SELECT ID FROM EMPLEADOS");

            while (r.next()) {

                if (r.getInt("ID") == id) {
                    esta = true;
                }
            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return esta;

    }

    static boolean comprobarOfi(int id) {

        boolean esta = false;
        try {

            Connection c = conexion();

            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("SELECT OFICINA FROM EMPLEADOS");

            while (r.next()) {

                if (r.getInt("OFICINA") == id) {
                    esta = true;
                }
            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return esta;

    }

    static void cambiarOficina(int n, int m) {

        if (comprobarOfi(n) && comprobarOfi(m)) {

            try {

                Connection c = conexion();

                Statement s = c.createStatement();

                ResultSet r = s.executeQuery("SELECT * FROM EMPLEADOS WHERE OFICINA = " + n);

                System.out.println("\nAntes del Cambio : ");
                System.out.println("------------------------");

                while (r.next()) {

                    System.out.println("ID : " + r.getInt("ID") + " / Nombre : " + r.getString("NOMBRE") + " / Oficina : " + r.getInt("OFICINA"));

                }

                c.close();

                c = conexion();

                PreparedStatement p = c.prepareStatement("UPDATE EMPLEADOS SET OFICINA = ? WHERE OFICINA = ?");

                p.setInt(1, m);
                p.setInt(2, n);
                p.executeUpdate();

                c.close();

                c = conexion();

                s = c.createStatement();

                r = s.executeQuery("SELECT * FROM EMPLEADOS WHERE OFICINA = " + m);

                System.out.println("\nDespues del Cambio : ");
                System.out.println("-----------------------");

                while (r.next()) {

                    System.out.println("ID : " + r.getInt("ID") + " / Nombre : " + r.getString("NOMBRE") + " / Oficina : " + r.getInt("OFICINA"));

                }

                c.close();

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("\nAlgun ID de Oficina esta MAL");
        }

    }

    static void borrar(int id) {

        if (comprobarId(id)) {

            try {

                Connection c = conexion();

                PreparedStatement s = c.prepareStatement("DELETE FROM EMPLEADOS WHERE ID = ?");

                s.setInt(1, id);

                int x = s.executeUpdate();

                if (x > 0) {
                    System.out.println("BORRADO");
                }

                s.close();

            } catch (Exception a) {
                System.out.println(a.getMessage());
            }

        } else {
            System.out.println("No hay nadie con ese ID");
        }

    }

    static void mostrarOficinas() {

        try {

            Connection c = conexion();

            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("SELECT * FROM OFICINA");

            while (r.next()) {

                System.out.println("ID : " + r.getInt("ID") + " / Ciudad : " + r.getString("CIUDAD") + " / Superficie : " + r.getInt("SUPERFICIE") + " / Ventas : " + r.getInt("VENTAS"));

            }

            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
