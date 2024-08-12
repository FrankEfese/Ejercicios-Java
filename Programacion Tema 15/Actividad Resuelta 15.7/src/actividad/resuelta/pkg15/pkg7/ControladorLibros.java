package actividad.resuelta.pkg15.pkg7;

import actividad.resuelta.pkg15.pkg7.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorLibros {

    LibroJpaController libro = new LibroJpaController();

    public void create(Libro a) {

        try {
            libro.create(a);
            System.out.println("\nAGREGADO");
        } catch (Exception ex) {
            Logger.getLogger(ControladorLibros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(String id) {

        try {
            libro.destroy(id);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {

            System.out.println("\nNo hay ningun Libro con ese ISBN");
        }

    }

    public Libro unLibro(String id) {

        return libro.findLibro(id);
    }

    public ArrayList<Libro> todos() {

        List<Libro> lista = libro.findLibroEntities();
        ArrayList<Libro> todosLibros = new ArrayList<>(lista);
        return todosLibros;
    }

    public int cantidad() {

        return libro.getLibroCount();
    }

    public void editar(Libro a) {

        try {
            libro.edit(a);
            System.out.println("\nMODIFICADO");
        } catch (Exception ex) {
            Logger.getLogger(ControladorLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
