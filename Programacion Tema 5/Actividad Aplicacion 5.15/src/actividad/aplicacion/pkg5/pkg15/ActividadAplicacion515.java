package actividad.aplicacion.pkg5.pkg15;

//Debes desarrollar una aplicacion que ayude a gestionar las notas de un centro educativo. 
//Los alumnos se organizan en grupos de 5 . Leer las notas de primer , segundo y tercer trimestre 
//de un grupo. Debes mostrar al final la nota media del grupo en cada trimestre y la media del
//alumno que se encuentra en una posicion dada . 
import java.util.*;

public class ActividadAplicacion515 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int primer[] = new int[5];
        int segun[] = new int[5];
        int tercer[] = new int[5];

        int mediaPrimer = 0;
        int mediaSegun = 0;
        int mediaTercer = 0;

        System.out.println("Vamos con las 5 notas del Primer Trimestre : ");
        for (int x = 0; x < primer.length; x++) {

            System.out.println("Introduce la nota : ");
            primer[x] = sc.nextInt();
            mediaPrimer += primer[x];

        }

        System.out.println("Vamos con las 5 notas del Segundo Trimestre : ");
        for (int x = 0; x < primer.length; x++) {

            System.out.println("Introduce la nota : ");
            segun[x] = sc.nextInt();
            mediaSegun += segun[x];

        }

        System.out.println("Vamos con las 5 notas del Tercer Trimestre : ");
        for (int x = 0; x < primer.length; x++) {

            System.out.println("Introduce la nota : ");
            tercer[x] = sc.nextInt();
            mediaTercer += tercer[x];

        }

        System.out.println("Introduce que alumno quieres ver su media (del 1 al 5) : ");

        int a = sc.nextInt();

        if (a < 1 || a > 5) {
            System.out.println("Te has equivocado en el Alumno");
            System.out.println("Media Primer Trimestre : " + (mediaPrimer / primer.length));
            System.out.println("Media Segundo Trimestre : " + (mediaSegun / primer.length));
            System.out.println("Media Tercer Trimestre : " + (mediaTercer / primer.length));
        } else {

            int media = primer[a - 1];
            media += segun[a - 1];
            media += tercer[a - 1];
            System.out.println("Media del Alumno : " + (media / 3));
            System.out.println("Media Primer Trimestre : " + (mediaPrimer / primer.length));
            System.out.println("Media Segundo Trimestre : " + (mediaSegun / primer.length));
            System.out.println("Media Tercer Trimestre : " + (mediaTercer / primer.length));

        }
    }

}
