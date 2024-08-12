package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import actividad.propuesta.pkg15.pkg6.Manual;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class ManualJpaController implements Serializable {

    public ManualJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ManualJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Propuesta_15.6PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Manual manual) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(manual);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findManual(manual.getId()) != null) {
                throw new PreexistingEntityException("Manual " + manual + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Manual manual) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            manual = em.merge(manual);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = manual.getId();
                if (findManual(id) == null) {
                    throw new NonexistentEntityException("The manual with id " + id + " no longer exists.");
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
            Manual manual;
            try {
                manual = em.getReference(Manual.class, id);
                manual.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The manual with id " + id + " no longer exists.", enfe);
            }
            em.remove(manual);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Manual> findManualEntities() {
        return findManualEntities(true, -1, -1);
    }

    public List<Manual> findManualEntities(int maxResults, int firstResult) {
        return findManualEntities(false, maxResults, firstResult);
    }

    private List<Manual> findManualEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Manual.class));
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

    public Manual findManual(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Manual.class, id);
        } finally {
            em.close();
        }
    }

    public int getManualCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Manual> rt = cq.from(Manual.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
