package actividad.aplicacion.pkg7.pkg11;

//Escribe la clase MarcaPagina que ayuda a llevar el control de la lectura de un Libro. 
//Debera disponer de metodos para incrementar la pagina leida, obtener informacion
//de la ultima pagina leida y para comenzar desde el principio. 
import java.util.*;

public class ActividadAplicacion711 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce el nombre del Libro : ");
        String nom = sc.nextLine();
        System.out.println("\nIntroduce su cantidad de Paginas : ");
        int c = sc.nextInt();
        int eleccion;
        MarcaPaginas libro = new MarcaPaginas(nom, c);

        do {
            System.out.println("\nPara aumentar de Pagina (Pulsa 1)");
            System.out.println("Para aumentar X Paginas (Pulsa 2)");
            System.out.println("Para saber la ultima Pagina leida (Pulsa 3)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    libro.incrementarPag();
                    break;

                case 2:
                    System.out.println("\nCuantas Paginas quieres pasar : ");
                    int num = sc.nextInt();
                    libro.incrementarXPag(num);
                    break;

                case 3:
                    libro.ultPaginaLeida();
                    break;

            }

        } while (eleccion > 0 && eleccion < 4);

        System.out.println("\nAdiosss");

    }

}
