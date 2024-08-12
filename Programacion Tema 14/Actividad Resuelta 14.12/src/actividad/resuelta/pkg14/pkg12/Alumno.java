package actividad.resuelta.pkg14.pkg12;

import java.sql.*;

public class Alumno {

    private int id;
    private String nombre;
    private int edad;
    private int nota;
    private String curso;

    public Alumno(int id, String nombre, int edad, int nota, String curso) {
        this.id = id;
        setNombre(nombre);
        this.edad = edad;
        this.nota = nota;
        this.setCurso(curso);
    }

    public Alumno(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.substring(0, Math.min(30, nombre.length()));
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso.substring(0, Math.min(2, curso.length()));
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + ", curso=" + curso + '}';
    }

    static Connection conexion() {

        String url = "jdbc:mysql://localhost:3306/instituto";

        Connection c = null;

        try {

            c = DriverManager.getConnection(url, "root", "");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return c;

    }

    public void crear() {

        try {

            Connection c = conexion();
            PreparedStatement s = c.prepareStatement("INSERT INTO ALUMNO (NUM , NOMBRE , EDAD , NOTA , CURSO) VALUES (? , ? , ? , ? , ?)");
            s.setInt(1, id);
            s.setString(2, nombre);
            s.setInt(3, edad);
            s.setInt(4, nota);
            s.setString(5, curso);
            s.executeUpdate();
            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public void borrar() {

        try {

            Connection c = conexion();
            PreparedStatement s = c.prepareStatement("DELETE FROM ALUMNO WHERE NUM = ?");
            s.setInt(1, id);

            s.executeUpdate();
            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public void leer() {

        try {

            Connection c = conexion();
            PreparedStatement s = c.prepareStatement("SELECT * FROM ALUMNO WHERE NUM = ?");
            s.setInt(1, id);

            ResultSet r = s.executeQuery();

            if (r.next()) {

                System.out.println("ID : " + r.getInt("NUM") + " / Nombre : " + r.getString("NOMBRE") + " / Edad : "
                        + r.getInt("EDAD") + " / Nota : " + r.getInt("NOTA") + " / Curso : " + r.getString("CURSO"));

            }
            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    public void actualizar() {

        try {

            Connection c = conexion();
            PreparedStatement s = c.prepareStatement("UPDATE ALUMNO SET NOMBRE = ? , EDAD = ? , NOTA = ? , CURSO = ? WHERE NUM = ?");
            s.setInt(5, id);
            s.setString(1, nombre);
            s.setInt(2, edad);
            s.setInt(3, nota);
            s.setString(4, curso);
            s.executeUpdate();
            c.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}
