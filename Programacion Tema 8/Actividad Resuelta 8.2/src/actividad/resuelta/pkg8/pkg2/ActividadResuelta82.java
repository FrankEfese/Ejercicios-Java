package actividad.resuelta.pkg8.pkg2;

//A partir de la clase Hora implementar la clase HoraExacta. 
//-HoraExacta (hora , minuto , segundo). 
//-setSegundo(valor). 
//-incremento() incrementa la hora en un segundo. 
import java.util.*;

public class ActividadResuelta82 {

    public static void main(String[] args) {

        HoraExacta h = new HoraExacta(58, 2, 51);
        h.incrementa();
        h.incrementa();
        System.out.println(h.toString());
    }

}
