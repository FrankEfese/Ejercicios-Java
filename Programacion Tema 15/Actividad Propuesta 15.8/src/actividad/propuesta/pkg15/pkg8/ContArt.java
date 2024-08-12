package actividad.propuesta.pkg15.pkg8;

import Control.ArticuloJpaController;
import java.util.List;


public class ContArt {
   
    ArticuloJpaController a = new ArticuloJpaController();
    
    public void crear (Articulo c){
        a.create(c);
    }
    
    public int cant (){
        return a.getArticuloCount();
    }
    
    
    public List<Articulo> todos(){
        return a.findArticuloEntities();
    }
}
