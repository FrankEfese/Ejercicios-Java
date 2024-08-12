package actividad.aplicacion.pkg7.pkg11;

public class MarcaPaginas {

    String nombre;
    int tamaño;
    int numPag;
    int ultPag;

    public MarcaPaginas(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        numPag = 0;
        ultPag = 0;
    }

    public void incrementarPag() {

        if (numPag + 1 > tamaño) {
            System.out.println("\nHAS TERMINADO EL LIBRO");
            numPag = 0;
            ultPag = 0;
            System.out.println("\nPagina Actual : " + numPag);
        } else {
            numPag++;
            ultPag++;
            System.out.println("\nPagina Actual : " + numPag);
        }

    }

    public void incrementarXPag(int n) {

        if (numPag + n > tamaño) {
            System.out.println("\nHAS TERMINADO EL LIBRO");
            numPag = 0;
            System.out.println("\nPagina Actual : " + numPag);
        } else {
            numPag += n;
            ultPag = numPag;
            System.out.println("\nPagina Actual : " + numPag);
        }
    }

    public void ultPaginaLeida() {
        System.out.println("\nUltima Pagina Leida : " + ultPag);
    }

}
