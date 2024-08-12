package actividad.resuelta.pkg7.pkg7;

//Diseñar la clase Texto que gestiona una cadena de caracteres con algunas caracteristicas :
//-La cadena de caracteres tendra una longitud max que se especifica en el constructor. 
//-Permite añadir un caracter al final o principio , siempre que no exceda la longitud. 
//-Tambien cadena , siempre que no exceda la longitud. 
//-Es necesario saber cuantas vocales hay en el texto. 
//-La fecha en la que se creo y la de la ultima modificacion. 
//-Mostrar informacion . 
import java.util.*;

public class ActividadResuelta77 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce de cuanto sera el tamanio del Texto : ");
        int tam = sc.nextInt();

        Texto txt = new Texto(tam);
        int eleccion;
        char c;
        String frase;
        do {
            System.out.println("\nPARA AGREGAR UN CARACTER AL PRINCIPIO (PULSA 1)");
            System.out.println("PARA AGREGAR UN CARACTER AL FINAL (PULSA 2)");
            System.out.println("PARA AGREGAR UNA CADENA AL PRINCIPIO (PULSA 3)");
            System.out.println("PATA AGREGAR UNA CADENA AL FINAL (PULSA 4)");
            System.out.println("PARA SABER CUANTAS VOCALES HAY EN EL TEXTO (PULSA 5)");
            System.out.println("PARA SABER LA FECHA DE CREACION Y ULTIMA MOD (PULSA 6)");
            System.out.println("PARA AUMENTAR TAMANIO DEL TEXTO (PULSA 7)");
            System.out.println("PARA VER EL CONTENIDO DEL TEXTO (PULSA 8)");
            eleccion = sc.nextInt();

            switch (eleccion) {

                case 1:
                    System.out.println("Introduce el caracter : ");
                    sc.nextLine();
                    c = sc.nextLine().charAt(0);
                    txt.anadirCaracter(c, eleccion);
                    break;

                case 2:
                    System.out.println("Introduce el caracter : ");
                    sc.nextLine();
                    c = sc.nextLine().charAt(0);
                    txt.anadirCaracter(c, eleccion);
                    break;

                case 3:
                    System.out.println("Introduce la Cadena : ");
                    sc.nextLine();
                    frase = sc.nextLine();
                    txt.agregarCadena(frase, eleccion);
                    break;

                case 4:
                    System.out.println("Introduce la Cadena : ");
                    sc.nextLine();
                    frase = sc.nextLine();
                    txt.agregarCadena(frase, eleccion);
                    break;

                case 5:
                    txt.vocales();
                    break;

                case 6:
                    txt.info();
                    break;

                case 7:
                    System.out.println("\nEn cuanto quieres aumentar el Tamanio : ");
                    int t = sc.nextInt();
                    txt.aumentarTamaño(t);
                    break;

                case 8:
                    txt.infoDelTexto();
                    break;

            }

        } while (eleccion > 0 && eleccion < 9);

        System.out.println("ADIOSSS");
    }

}
