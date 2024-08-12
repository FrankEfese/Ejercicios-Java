package actividad.resuelta.pkg12.pkg2;

//Implementar, con tipos genericos la clase Contenedor donde podremos guardar 
//tantos objetos como deseemos. Para ello utilizaremos una tabla, que inicialmente tendra tamaño
//cero. 
//-insertarPrincipio(T n)
//-insertarFinal (t n)
//-T extraerPrincipio ()
//-T extraerFinal ()
//- void ordenar()
import java.util.*;

public class ActividadResuelta122 {

    public static void main(String[] args) {

        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        for (int x = 0; x < 10; x++) {
            c.insertarFinal((int) (Math.random() * 20 + 1));
        }

        System.out.println("Sin ordenar : ");
        System.out.println(c);
        c.ordenar();
        System.out.println("Ordena : ");
        System.out.println(c);
        Integer a = c.exraerPrincipio();
        System.out.println("Extraido : " + a);
        System.out.println(c);

    }

}
