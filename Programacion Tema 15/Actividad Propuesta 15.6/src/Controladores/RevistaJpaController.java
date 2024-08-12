package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import actividad.propuesta.pkg15.pkg6.Revista;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class RevistaJpaController implements Serializable {

    public RevistaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public RevistaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Propuesta_15.6PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Revista revista) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(revista);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findRevista(revista.getId()) != null) {
                throw new PreexistingEntityException("Revista " + revista + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Revista revista) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            revista = em.merge(revista);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = revista.getId();
                if (findRevista(id) == null) {
                    throw new NonexistentEntityException("The revista with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Revista revista;
            try {
                revista = em.getReference(Revista.class, id);
                revista.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The revista with id " + id + " no longer exists.", enfe);
            }
            em.remove(revista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Revista> findRevistaEntities() {
        return findRevistaEntities(true, -1, -1);
    }

    public List<Revista> findRevistaEntities(int maxResults, int firstResult) {
        return findRevistaEntities(false, maxResults, firstResult);
    }

    private List<Revista> findRevistaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Revista.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Revista findRevista(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Revista.class, id);
        } finally {
            em.close();
        }
    }

    public int getRevistaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Revista> rt = cq.from(Revista.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
