package actividad.resuelta.pkg15.pkg9;

//Mostrar para cada oficina el sueldo maximo , minimo y medio de sus empleados. 
import java.util.List;
import javax.persistence.*;

public class ActividadResuelta159 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Resuelta_15.9PU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT e.oficina , max(e.sueldo) , min(e.sueldo) , avg(e.sueldo) FROM empleados e GROUP BY e.oficina");
        List<Object[]> lista = q.getResultList();

        for (Object aux[] : lista) {

            System.out.println("Oficina : " + aux[0] + " / Sueldo Max : " + aux[1] + " / Sueldo Min : " + aux[2] + " / Sueldo Medio : " + aux[3]);

        }

    }

}
