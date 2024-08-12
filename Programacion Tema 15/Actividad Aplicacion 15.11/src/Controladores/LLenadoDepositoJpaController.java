package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.aplicacion.pkg15.pkg11.LLenadoDeposito;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class LLenadoDepositoJpaController implements Serializable {

    public LLenadoDepositoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public LLenadoDepositoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Aplicacion_15.11PU");
    }
    
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LLenadoDeposito LLenadoDeposito) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(LLenadoDeposito);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LLenadoDeposito LLenadoDeposito) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LLenadoDeposito = em.merge(LLenadoDeposito);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = LLenadoDeposito.getId();
                if (findLLenadoDeposito(id) == null) {
                    throw new NonexistentEntityException("The lLenadoDeposito with id " + id + " no longer exists.");
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
            LLenadoDeposito LLenadoDeposito;
            try {
                LLenadoDeposito = em.getReference(LLenadoDeposito.class, id);
                LLenadoDeposito.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The LLenadoDeposito with id " + id + " no longer exists.", enfe);
            }
            em.remove(LLenadoDeposito);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LLenadoDeposito> findLLenadoDepositoEntities() {
        return findLLenadoDepositoEntities(true, -1, -1);
    }

    public List<LLenadoDeposito> findLLenadoDepositoEntities(int maxResults, int firstResult) {
        return findLLenadoDepositoEntities(false, maxResults, firstResult);
    }

    private List<LLenadoDeposito> findLLenadoDepositoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LLenadoDeposito.class));
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

    public LLenadoDeposito findLLenadoDeposito(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LLenadoDeposito.class, id);
        } finally {
            em.close();
        }
    }

    public int getLLenadoDepositoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LLenadoDeposito> rt = cq.from(LLenadoDeposito.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
