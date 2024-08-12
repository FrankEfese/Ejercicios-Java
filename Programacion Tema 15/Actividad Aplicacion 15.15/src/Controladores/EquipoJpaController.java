package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.aplicacion.pkg15.pkg15.Equipo;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import actividad.aplicacion.pkg15.pkg15.Jugador;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EquipoJpaController implements Serializable {

    public EquipoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EquipoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Actividad_Aplicacion_15.15PU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Equipo equipo) {
        if (equipo.getJugadores() == null) {
            equipo.setJugadores(new ArrayList<Jugador>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Jugador> attachedJugadores = new ArrayList<Jugador>();
            for (Jugador jugadoresJugadorToAttach : equipo.getJugadores()) {
                jugadoresJugadorToAttach = em.getReference(jugadoresJugadorToAttach.getClass(), jugadoresJugadorToAttach.getId());
                attachedJugadores.add(jugadoresJugadorToAttach);
            }
            equipo.setJugadores(attachedJugadores);
            em.persist(equipo);
            for (Jugador jugadoresJugador : equipo.getJugadores()) {
                Equipo oldEquipoOfJugadoresJugador = jugadoresJugador.getEquipo();
                jugadoresJugador.setEquipo(equipo);
                jugadoresJugador = em.merge(jugadoresJugador);
                if (oldEquipoOfJugadoresJugador != null) {
                    oldEquipoOfJugadoresJugador.getJugadores().remove(jugadoresJugador);
                    oldEquipoOfJugadoresJugador = em.merge(oldEquipoOfJugadoresJugador);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Equipo equipo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Equipo persistentEquipo = em.find(Equipo.class, equipo.getId());
            List<Jugador> jugadoresOld = persistentEquipo.getJugadores();
            List<Jugador> jugadoresNew = equipo.getJugadores();
            List<Jugador> attachedJugadoresNew = new ArrayList<Jugador>();
            for (Jugador jugadoresNewJugadorToAttach : jugadoresNew) {
                jugadoresNewJugadorToAttach = em.getReference(jugadoresNewJugadorToAttach.getClass(), jugadoresNewJugadorToAttach.getId());
                attachedJugadoresNew.add(jugadoresNewJugadorToAttach);
            }
            jugadoresNew = attachedJugadoresNew;
            equipo.setJugadores(jugadoresNew);
            equipo = em.merge(equipo);
            for (Jugador jugadoresOldJugador : jugadoresOld) {
                if (!jugadoresNew.contains(jugadoresOldJugador)) {
                    jugadoresOldJugador.setEquipo(null);
                    jugadoresOldJugador = em.merge(jugadoresOldJugador);
                }
            }
            for (Jugador jugadoresNewJugador : jugadoresNew) {
                if (!jugadoresOld.contains(jugadoresNewJugador)) {
                    Equipo oldEquipoOfJugadoresNewJugador = jugadoresNewJugador.getEquipo();
                    jugadoresNewJugador.setEquipo(equipo);
                    jugadoresNewJugador = em.merge(jugadoresNewJugador);
                    if (oldEquipoOfJugadoresNewJugador != null && !oldEquipoOfJugadoresNewJugador.equals(equipo)) {
                        oldEquipoOfJugadoresNewJugador.getJugadores().remove(jugadoresNewJugador);
                        oldEquipoOfJugadoresNewJugador = em.merge(oldEquipoOfJugadoresNewJugador);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = equipo.getId();
                if (findEquipo(id) == null) {
                    throw new NonexistentEntityException("The equipo with id " + id + " no longer exists.");
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
            Equipo equipo;
            try {
                equipo = em.getReference(Equipo.class, id);
                equipo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The equipo with id " + id + " no longer exists.", enfe);
            }
            List<Jugador> jugadores = equipo.getJugadores();
            for (Jugador jugadoresJugador : jugadores) {
                jugadoresJugador.setEquipo(null);
                jugadoresJugador = em.merge(jugadoresJugador);
            }
            em.remove(equipo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Equipo> findEquipoEntities() {
        return findEquipoEntities(true, -1, -1);
    }

    public List<Equipo> findEquipoEntities(int maxResults, int firstResult) {
        return findEquipoEntities(false, maxResults, firstResult);
    }

    private List<Equipo> findEquipoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Equipo.class));
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

    public Equipo findEquipo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Equipo.class, id);
        } finally {
            em.close();
        }
    }

    public int getEquipoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Equipo> rt = cq.from(Equipo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
