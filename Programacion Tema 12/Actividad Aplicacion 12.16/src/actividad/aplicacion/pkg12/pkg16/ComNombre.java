package actividad.aplicacion.pkg12.pkg16;

import java.util.Comparator;


public class ComNombre implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
   
    return o1.nombre.compareTo(o2.nombre);
    
    }
    
    
    
}
