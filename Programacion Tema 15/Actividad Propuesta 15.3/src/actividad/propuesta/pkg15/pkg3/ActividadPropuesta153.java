package actividad.propuesta.pkg15.pkg3;

//Escribe una app que usando la entidad Estrella y los datos disponibles , solicite 
//el identificador de la estrella y muestre sus datos. 
import java.util.*;
import javax.persistence.*;

public class ActividadPropuesta153 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el ID de la Estrella que deseas ver : ");
        int id = sc.nextInt();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Actividad_Propuesta_15.3PU");
        EntityManager em = emf.createEntityManager();

        Estrellas_AR153 estrella = em.find(Estrellas_AR153.class, id);

        if (estrella == null) {
            System.out.println("No hay ninguna estrrela con ese ID");

        } else {
            System.out.println(estrella);
        }

        em.close();
        emf.close();
    }

}
