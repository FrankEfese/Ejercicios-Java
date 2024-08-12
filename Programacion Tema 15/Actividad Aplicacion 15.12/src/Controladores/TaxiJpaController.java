package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import Controladores.exceptions.PreexistingEntityException;
import actividad.aplicacion.pkg15.pkg12.Taxi;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import actividad.aplicacion.pkg15.pkg12.Taxista;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TaxiJpaController implements Serializable {

    public TaxiJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public TaxiJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Aplicacion_15.12PU");
    }
    
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Taxi taxi) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Taxista taxista = taxi.getTaxista();
            if (taxista != null) {
                taxista = em.getReference(taxista.getClass(), taxista.getDni());
                taxi.setTaxista(taxista);
            }
            em.persist(taxi);
            if (taxista != null) {
                Taxi oldTaxiOfTaxista = taxista.getTaxi();
                if (oldTaxiOfTaxista != null) {
                    oldTaxiOfTaxista.setTaxista(null);
                    oldTaxiOfTaxista = em.merge(oldTaxiOfTaxista);
                }
                taxista.setTaxi(taxi);
                taxista = em.merge(taxista);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTaxi(taxi.getMatricula()) != null) {
                throw new PreexistingEntityException("Taxi " + taxi + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Taxi taxi) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Taxi persistentTaxi = em.find(Taxi.class, taxi.getMatricula());
            Taxista taxistaOld = persistentTaxi.getTaxista();
            Taxista taxistaNew = taxi.getTaxista();
            if (taxistaNew != null) {
                taxistaNew = em.getReference(taxistaNew.getClass(), taxistaNew.getDni());
                taxi.setTaxista(taxistaNew);
            }
            taxi = em.merge(taxi);
            if (taxistaOld != null && !taxistaOld.equals(taxistaNew)) {
                taxistaOld.setTaxi(null);
                taxistaOld = em.merge(taxistaOld);
            }
            if (taxistaNew != null && !taxistaNew.equals(taxistaOld)) {
                Taxi oldTaxiOfTaxista = taxistaNew.getTaxi();
                if (oldTaxiOfTaxista != null) {
                    oldTaxiOfTaxista.setTaxista(null);
                    oldTaxiOfTaxista = em.merge(oldTaxiOfTaxista);
                }
                taxistaNew.setTaxi(taxi);
                taxistaNew = em.merge(taxistaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = taxi.getMatricula();
                if (findTaxi(id) == null) {
                    throw new NonexistentEntityException("The taxi with id " + id + " no longer exists.");
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
            Taxi taxi;
            try {
                taxi = em.getReference(Taxi.class, id);
                taxi.getMatricula();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The taxi with id " + id + " no longer exists.", enfe);
            }
            Taxista taxista = taxi.getTaxista();
            if (taxista != null) {
                taxista.setTaxi(null);
                taxista = em.merge(taxista);
            }
            em.remove(taxi);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Taxi> findTaxiEntities() {
        return findTaxiEntities(true, -1, -1);
    }

    public List<Taxi> findTaxiEntities(int maxResults, int firstResult) {
        return findTaxiEntities(false, maxResults, firstResult);
    }

    private List<Taxi> findTaxiEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Taxi.class));
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

    public Taxi findTaxi(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Taxi.class, id);
        } finally {
            em.close();
        }
    }

    public int getTaxiCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Taxi> rt = cq.from(Taxi.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
