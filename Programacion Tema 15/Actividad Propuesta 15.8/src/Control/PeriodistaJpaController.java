package Control;

import Control.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import actividad.propuesta.pkg15.pkg8.Articulo;
import actividad.propuesta.pkg15.pkg8.Periodista;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class PeriodistaJpaController implements Serializable {

    public PeriodistaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    
    
     public PeriodistaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Propuesta_15.8PU");
    }
    
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Periodista periodista) {
        if (periodista.getArticulos() == null) {
            periodista.setArticulos(new ArrayList<Articulo>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Articulo> attachedArticulos = new ArrayList<Articulo>();
            for (Articulo articulosArticuloToAttach : periodista.getArticulos()) {
                articulosArticuloToAttach = em.getReference(articulosArticuloToAttach.getClass(), articulosArticuloToAttach.getId());
                attachedArticulos.add(articulosArticuloToAttach);
            }
            periodista.setArticulos(attachedArticulos);
            em.persist(periodista);
            for (Articulo articulosArticulo : periodista.getArticulos()) {
                Periodista oldPOfArticulosArticulo = articulosArticulo.getP();
                articulosArticulo.setP(periodista);
                articulosArticulo = em.merge(articulosArticulo);
                if (oldPOfArticulosArticulo != null) {
                    oldPOfArticulosArticulo.getArticulos().remove(articulosArticulo);
                    oldPOfArticulosArticulo = em.merge(oldPOfArticulosArticulo);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Periodista periodista) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Periodista persistentPeriodista = em.find(Periodista.class, periodista.getDni());
            List<Articulo> articulosOld = persistentPeriodista.getArticulos();
            List<Articulo> articulosNew = periodista.getArticulos();
            List<Articulo> attachedArticulosNew = new ArrayList<Articulo>();
            for (Articulo articulosNewArticuloToAttach : articulosNew) {
                articulosNewArticuloToAttach = em.getReference(articulosNewArticuloToAttach.getClass(), articulosNewArticuloToAttach.getId());
                attachedArticulosNew.add(articulosNewArticuloToAttach);
            }
            articulosNew = attachedArticulosNew;
            periodista.setArticulos(articulosNew);
            periodista = em.merge(periodista);
            for (Articulo articulosOldArticulo : articulosOld) {
                if (!articulosNew.contains(articulosOldArticulo)) {
                    articulosOldArticulo.setP(null);
                    articulosOldArticulo = em.merge(articulosOldArticulo);
                }
            }
            for (Articulo articulosNewArticulo : articulosNew) {
                if (!articulosOld.contains(articulosNewArticulo)) {
                    Periodista oldPOfArticulosNewArticulo = articulosNewArticulo.getP();
                    articulosNewArticulo.setP(periodista);
                    articulosNewArticulo = em.merge(articulosNewArticulo);
                    if (oldPOfArticulosNewArticulo != null && !oldPOfArticulosNewArticulo.equals(periodista)) {
                        oldPOfArticulosNewArticulo.getArticulos().remove(articulosNewArticulo);
                        oldPOfArticulosNewArticulo = em.merge(oldPOfArticulosNewArticulo);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = periodista.getDni();
                if (findPeriodista(id) == null) {
                    throw new NonexistentEntityException("The periodista with id " + id + " no longer exists.");
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
            Periodista periodista;
            try {
                periodista = em.getReference(Periodista.class, id);
                periodista.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The periodista with id " + id + " no longer exists.", enfe);
            }
            List<Articulo> articulos = periodista.getArticulos();
            for (Articulo articulosArticulo : articulos) {
                articulosArticulo.setP(null);
                articulosArticulo = em.merge(articulosArticulo);
            }
            em.remove(periodista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Periodista> findPeriodistaEntities() {
        return findPeriodistaEntities(true, -1, -1);
    }

    public List<Periodista> findPeriodistaEntities(int maxResults, int firstResult) {
        return findPeriodistaEntities(false, maxResults, firstResult);
    }

    private List<Periodista> findPeriodistaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Periodista.class));
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

    public Periodista findPeriodista(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Periodista.class, id);
        } finally {
            em.close();
        }
    }

    public int getPeriodistaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Periodista> rt = cq.from(Periodista.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
