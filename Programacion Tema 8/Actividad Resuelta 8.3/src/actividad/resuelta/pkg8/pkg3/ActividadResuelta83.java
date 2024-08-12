package actividad.resuelta.pkg8.pkg3;

//Añadir a la clase HoraExacta un metodo que compare si dos horas (la invocante y 
//otra pasada como parametro de entrada al metodo) son iguales o distintas. 
import java.util.*;

public class ActividadResuelta83 {

    public static void main(String[] args) {

        HoraExacta h = new HoraExacta(58, 2, 51);
        HoraExacta h2 = new HoraExacta(5, 2, 51);
        System.out.println(h.equals(h2));

    }

}
