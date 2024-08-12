package actividad.aplicacion.pkg14.pkg21;

//Crea un metodo que devuelva todas las oficinas .
public class ActividadAplicacion1421 {

    public static void main(String[] args) {

        try {

            EmpleadoDAO.mostrarOficinas();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

}
