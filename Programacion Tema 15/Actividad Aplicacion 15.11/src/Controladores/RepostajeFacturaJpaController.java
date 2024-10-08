package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.aplicacion.pkg15.pkg11.RepostajeFactura;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class RepostajeFacturaJpaController implements Serializable {

    public RepostajeFacturaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    
      public RepostajeFacturaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Aplicacion_15.11PU");
    }
    
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(RepostajeFactura repostajeFactura) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(repostajeFactura);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(RepostajeFactura repostajeFactura) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            repostajeFactura = em.merge(repostajeFactura);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = repostajeFactura.getId();
                if (findRepostajeFactura(id) == null) {
                    throw new NonexistentEntityException("The repostajeFactura with id " + id + " no longer exists.");
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
            RepostajeFactura repostajeFactura;
            try {
                repostajeFactura = em.getReference(RepostajeFactura.class, id);
                repostajeFactura.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The repostajeFactura with id " + id + " no longer exists.", enfe);
            }
            em.remove(repostajeFactura);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<RepostajeFactura> findRepostajeFacturaEntities() {
        return findRepostajeFacturaEntities(true, -1, -1);
    }

    public List<RepostajeFactura> findRepostajeFacturaEntities(int maxResults, int firstResult) {
        return findRepostajeFacturaEntities(false, maxResults, firstResult);
    }

    private List<RepostajeFactura> findRepostajeFacturaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(RepostajeFactura.class));
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

    public RepostajeFactura findRepostajeFactura(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(RepostajeFactura.class, id);
        } finally {
            em.close();
        }
    }

    public int getRepostajeFacturaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<RepostajeFactura> rt = cq.from(RepostajeFactura.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
