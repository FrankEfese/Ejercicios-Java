package actividad.propuesta.pkg15.pkg4;

//Diseña una app que lea por consola todos los datos de empleado y los persista en la BD.
import java.util.List;
import javax.persistence.*;

public class ActividadPropuesta154 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Propuesta_15.4PU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT e FROM empleados e");
        List<empleados> lista = q.getResultList();
        System.out.println(lista);

    }

}
