package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import actividad.propuesta.pkg15.pkg9.Ajedrezista;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class AjedrezistaJpaController implements Serializable {

    public AjedrezistaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    
     public AjedrezistaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Propuesta_15.9PU");
    }
    
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ajedrezista ajedrezista) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ajedrezista);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAjedrezista(ajedrezista.getDni()) != null) {
                throw new PreexistingEntityException("Ajedrezista " + ajedrezista + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ajedrezista ajedrezista) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ajedrezista = em.merge(ajedrezista);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = ajedrezista.getDni();
                if (findAjedrezista(id) == null) {
                    throw new NonexistentEntityException("The ajedrezista with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ajedrezista ajedrezista;
            try {
                ajedrezista = em.getReference(Ajedrezista.class, id);
                ajedrezista.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ajedrezista with id " + id + " no longer exists.", enfe);
            }
            em.remove(ajedrezista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ajedrezista> findAjedrezistaEntities() {
        return findAjedrezistaEntities(true, -1, -1);
    }

    public List<Ajedrezista> findAjedrezistaEntities(int maxResults, int firstResult) {
        return findAjedrezistaEntities(false, maxResults, firstResult);
    }

    private List<Ajedrezista> findAjedrezistaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ajedrezista.class));
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

    public Ajedrezista findAjedrezista(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ajedrezista.class, id);
        } finally {
            em.close();
        }
    }

    public int getAjedrezistaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ajedrezista> rt = cq.from(Ajedrezista.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
