package actividad.resuelta.pkg15.pkg8;

//Mostrar los empleados que no trabajen en la oficina 3. Ordenar por contrato de forma decreciente.
import java.util.List;
import javax.persistence.*;

public class ActividadResuelta158 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Resuelta_15.8PU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT e FROM empleados e WHERE e.oficina != 3 ORDER BY e.contrato DESC");
        List<empleados> lista = q.getResultList();

        for (empleados a : lista) {
            System.out.println(a);
        }

    }

}
