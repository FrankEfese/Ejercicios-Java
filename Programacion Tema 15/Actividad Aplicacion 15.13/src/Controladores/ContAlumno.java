package Controladores;

import Controladores.exceptions.NonexistentEntityException;
import actividad.aplicacion.pkg15.pkg13.Alumno;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContAlumno {

    AlumnoJpaController a = new AlumnoJpaController();

    public void crear(Alumno x) {

        try {

            a.create(x);
            System.out.println("\nAGREGADO");

        } catch (Exception e) {
            System.out.println("\nHUBO UN ERROR");
        }

    }

    public void eliminar(int id) {

        try {
            a.destroy(id);
            System.out.println("\nELIMINADO");
        } catch (NonexistentEntityException ex) {

            System.out.println("\nHUBO UN ERROR");
        }

    }

    public int cantidad() {
        return a.getAlumnoCount();
    }

    public Alumno uno(int id) {
        return a.findAlumno(id);
    }
    
    public List<Alumno> todos(){
        
        return a.findAlumnoEntities();
    }
    
   

}
