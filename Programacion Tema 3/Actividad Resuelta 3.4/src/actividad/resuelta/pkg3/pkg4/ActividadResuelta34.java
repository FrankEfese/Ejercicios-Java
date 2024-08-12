package actividad.resuelta.pkg3.pkg4;

//Un centro de investigacion de la flora urbana necesita una aplicacion que muestre cual es
//el arbol mas alto. Para ello se introducira por teclado la altura (en cm) de cada arbol(terminando introduciendo -1).
//Los arboles se identifican mediante etiquetas con numeros unicos correlativos . 
import java.util.Scanner;

public class ActividadResuelta34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int arbolMasAlto;
        int etiqueta = 1;
        int etiquetaUnica = 0;

        System.out.println("Introduce altura de arboles : ");
        altura = sc.nextInt();
        arbolMasAlto = altura;

        while (altura != -1) {

            if (altura > arbolMasAlto) {
                arbolMasAlto = altura;
                etiquetaUnica = etiqueta;
            }

            etiqueta++;

            altura = sc.nextInt();

        }

        if (arbolMasAlto == -1) {
            System.out.println("NO HAY ARBOLES");
        } else {

            System.out.println("Arbol mas Alto : " + arbolMasAlto);
            System.out.println("Su Etiqueta : " + etiquetaUnica);

        }
    }

}
