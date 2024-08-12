package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.aplicacion.pkg15.pkg11.RepostajeNormal;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class RepostajeNormalJpaController implements Serializable {

    public RepostajeNormalJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
      public RepostajeNormalJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Aplicacion_15.11PU");
    }
    
    
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(RepostajeNormal repostajeNormal) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(repostajeNormal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(RepostajeNormal repostajeNormal) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            repostajeNormal = em.merge(repostajeNormal);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = repostajeNormal.getId();
                if (findRepostajeNormal(id) == null) {
                    throw new NonexistentEntityException("The repostajeNormal with id " + id + " no longer exists.");
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
            RepostajeNormal repostajeNormal;
            try {
                repostajeNormal = em.getReference(RepostajeNormal.class, id);
                repostajeNormal.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The repostajeNormal with id " + id + " no longer exists.", enfe);
            }
            em.remove(repostajeNormal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<RepostajeNormal> findRepostajeNormalEntities() {
        return findRepostajeNormalEntities(true, -1, -1);
    }

    public List<RepostajeNormal> findRepostajeNormalEntities(int maxResults, int firstResult) {
        return findRepostajeNormalEntities(false, maxResults, firstResult);
    }

    private List<RepostajeNormal> findRepostajeNormalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(RepostajeNormal.class));
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

    public RepostajeNormal findRepostajeNormal(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(RepostajeNormal.class, id);
        } finally {
            em.close();
        }
    }

    public int getRepostajeNormalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<RepostajeNormal> rt = cq.from(RepostajeNormal.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
