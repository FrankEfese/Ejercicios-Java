package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import actividad.aplicacion.pkg15.pkg12.Taxi;
import actividad.aplicacion.pkg15.pkg12.Taxista;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TaxistaJpaController implements Serializable {

    public TaxistaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public TaxistaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Aplicacion_15.12PU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Taxista taxista) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Taxi taxi = taxista.getTaxi();
            if (taxi != null) {
                taxi = em.getReference(taxi.getClass(), taxi.getMatricula());
                taxista.setTaxi(taxi);
            }
            em.persist(taxista);
            if (taxi != null) {
                Taxista oldTaxistaOfTaxi = taxi.getTaxista();
                if (oldTaxistaOfTaxi != null) {
                    oldTaxistaOfTaxi.setTaxi(null);
                    oldTaxistaOfTaxi = em.merge(oldTaxistaOfTaxi);
                }
                taxi.setTaxista(taxista);
                taxi = em.merge(taxi);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTaxista(taxista.getDni()) != null) {
                throw new PreexistingEntityException("Taxista " + taxista + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Taxista taxista) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Taxista persistentTaxista = em.find(Taxista.class, taxista.getDni());
            Taxi taxiOld = persistentTaxista.getTaxi();
            Taxi taxiNew = taxista.getTaxi();
            if (taxiNew != null) {
                taxiNew = em.getReference(taxiNew.getClass(), taxiNew.getMatricula());
                taxista.setTaxi(taxiNew);
            }
            taxista = em.merge(taxista);
            if (taxiOld != null && !taxiOld.equals(taxiNew)) {
                taxiOld.setTaxista(null);
                taxiOld = em.merge(taxiOld);
            }
            if (taxiNew != null && !taxiNew.equals(taxiOld)) {
                Taxista oldTaxistaOfTaxi = taxiNew.getTaxista();
                if (oldTaxistaOfTaxi != null) {
                    oldTaxistaOfTaxi.setTaxi(null);
                    oldTaxistaOfTaxi = em.merge(oldTaxistaOfTaxi);
                }
                taxiNew.setTaxista(taxista);
                taxiNew = em.merge(taxiNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = taxista.getDni();
                if (findTaxista(id) == null) {
                    throw new NonexistentEntityException("The taxista with id " + id + " no longer exists.");
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
            Taxista taxista;
            try {
                taxista = em.getReference(Taxista.class, id);
                taxista.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The taxista with id " + id + " no longer exists.", enfe);
            }
            Taxi taxi = taxista.getTaxi();
            if (taxi != null) {
                taxi.setTaxista(null);
                taxi = em.merge(taxi);
            }
            em.remove(taxista);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Taxista> findTaxistaEntities() {
        return findTaxistaEntities(true, -1, -1);
    }

    public List<Taxista> findTaxistaEntities(int maxResults, int firstResult) {
        return findTaxistaEntities(false, maxResults, firstResult);
    }

    private List<Taxista> findTaxistaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Taxista.class));
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

    public Taxista findTaxista(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Taxista.class, id);
        } finally {
            em.close();
        }
    }

    public int getTaxistaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Taxista> rt = cq.from(Taxista.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
