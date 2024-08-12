package Controladores;

import actividad.aplicacion.pkg15.pkg11.RepostajeNormal;
import java.util.List;

public class ContNormal {
    
    RepostajeNormalJpaController n = new RepostajeNormalJpaController();
    
    public void crear(RepostajeNormal a) {
        
        try {
            
            n.create(a);
            System.out.println("\nAGREGADO");
            
        } catch (Exception e) {
            
            System.out.println("\nHUBO UN ERROR");
            
        }
    }
    
    public void eliminar(int id) {
        
        try {
            
            n.destroy(id);
            System.out.println("\nAGREGADO");
            
        } catch (Exception e) {
            
            System.out.println("\nHubo un ERRO");
            
        }
        
    }
    
    public int cantidad() {
        return n.getRepostajeNormalCount();
    }
    
    public List<RepostajeNormal> todos() {
        return n.findRepostajeNormalEntities();
    }
    
}
