package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.aplicacion.pkg15.pkg13.Alumno;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import actividad.aplicacion.pkg15.pkg13.Portatil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class AlumnoJpaController implements Serializable {

    public AlumnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public AlumnoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Aplicacion_15.13PU");
    }
    
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Alumno alumno) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Portatil portatil = alumno.getPortatil();
            if (portatil != null) {
                portatil = em.getReference(portatil.getClass(), portatil.getId());
                alumno.setPortatil(portatil);
            }
            em.persist(alumno);
            if (portatil != null) {
                Alumno oldAlumnoOfPortatil = portatil.getAlumno();
                if (oldAlumnoOfPortatil != null) {
                    oldAlumnoOfPortatil.setPortatil(null);
                    oldAlumnoOfPortatil = em.merge(oldAlumnoOfPortatil);
                }
                portatil.setAlumno(alumno);
                portatil = em.merge(portatil);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Alumno alumno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Alumno persistentAlumno = em.find(Alumno.class, alumno.getId());
            Portatil portatilOld = persistentAlumno.getPortatil();
            Portatil portatilNew = alumno.getPortatil();
            if (portatilNew != null) {
                portatilNew = em.getReference(portatilNew.getClass(), portatilNew.getId());
                alumno.setPortatil(portatilNew);
            }
            alumno = em.merge(alumno);
            if (portatilOld != null && !portatilOld.equals(portatilNew)) {
                portatilOld.setAlumno(null);
                portatilOld = em.merge(portatilOld);
            }
            if (portatilNew != null && !portatilNew.equals(portatilOld)) {
                Alumno oldAlumnoOfPortatil = portatilNew.getAlumno();
                if (oldAlumnoOfPortatil != null) {
                    oldAlumnoOfPortatil.setPortatil(null);
                    oldAlumnoOfPortatil = em.merge(oldAlumnoOfPortatil);
                }
                portatilNew.setAlumno(alumno);
                portatilNew = em.merge(portatilNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = alumno.getId();
                if (findAlumno(id) == null) {
                    throw new NonexistentEntityException("The alumno with id " + id + " no longer exists.");
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
            Alumno alumno;
            try {
                alumno = em.getReference(Alumno.class, id);
                alumno.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The alumno with id " + id + " no longer exists.", enfe);
            }
            Portatil portatil = alumno.getPortatil();
            if (portatil != null) {
                portatil.setAlumno(null);
                portatil = em.merge(portatil);
            }
            em.remove(alumno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Alumno> findAlumnoEntities() {
        return findAlumnoEntities(true, -1, -1);
    }

    public List<Alumno> findAlumnoEntities(int maxResults, int firstResult) {
        return findAlumnoEntities(false, maxResults, firstResult);
    }

    private List<Alumno> findAlumnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Alumno.class));
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

    public Alumno findAlumno(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Alumno.class, id);
        } finally {
            em.close();
        }
    }

    public int getAlumnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Alumno> rt = cq.from(Alumno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
