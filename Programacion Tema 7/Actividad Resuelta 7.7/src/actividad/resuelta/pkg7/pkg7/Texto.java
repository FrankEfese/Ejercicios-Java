package actividad.resuelta.pkg7.pkg7;

//-La cadena de caracteres tendra una longitud max que se especifica en el constructor. 
//-Permite añadir un caracter al final o principio , siempre que no exceda la longitud. 
//-Tambien cadena , siempre que no exceda la longitud. 
//-Es necesario saber cuantas vocales hay en el texto. 
//-La fecha en la que se creo y la de la ultima modificacion. 
//-Mostrar informacion . 
import java.time.LocalDateTime;

public class Texto {

    int tamaño;
    String texto;
    LocalDateTime fecha;
    LocalDateTime ultimaMod;

    public Texto(int tamaño) {
        this.tamaño = tamaño;
        texto = "";
        fecha = LocalDateTime.now();
        ultimaMod = LocalDateTime.now();
    }

    public void anadirCaracter(char c, int n) {

        if (texto.length() == tamaño) {
            System.out.println("\nNo se pueden agregar mas caracteres.");
        } else {

            switch (n) {

                case 1:
                    String aux = "";
                    aux += c;

                    for (int x = 0; x < texto.length(); x++) {
                        aux += texto.charAt(x);

                    }

                    texto = aux;

                    System.out.println("\nCARACTER AGREGADO");
                    ultimaMod = LocalDateTime.now();
                    break;

                case 2:

                    texto += c;
                    System.out.println("\nCARACTER AGREGADO");
                    ultimaMod = LocalDateTime.now();
                    break;

                default:
                    System.out.println("\nERROR");
            }

        }

    }

    public void agregarCadena(String frase, int n) {

        if (texto.length() == 0 && frase.length() <= tamaño) {

            for (int x = 0; x < frase.length(); x++) {
                texto += frase.charAt(x);

            }

            System.out.println("\nCADENA AGREGADA");
            ultimaMod = LocalDateTime.now();
        } else {
            if (texto.length() + frase.length() + 1 > tamaño) {
                System.out.println("\nNo se pueden agregar mas caracteres.");
            } else {
                switch (n) {

                    case 3:

                        frase += " ";

                        for (int x = 0; x < texto.length(); x++) {
                            frase += texto.charAt(x);

                        }

                        texto = frase;

                        System.out.println("\nCADENA AGREGADA");
                        ultimaMod = LocalDateTime.now();
                        break;

                    case 4:

                        texto += " ";

                        for (int x = 0; x < frase.length(); x++) {
                            texto += frase.charAt(x);

                        }

                        System.out.println("\nCADENA AGREGADA");
                        ultimaMod = LocalDateTime.now();
                        break;

                    default:
                        System.out.println("\nERROR");
                }

            }

        }
    }

    public void vocales() {

        String aux = texto.toLowerCase();
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        int cont = 0;

        for (int x = 0; x < aux.length(); x++) {
            for (int j = 0; j < vocales.length; j++) {
                if (aux.charAt(x) == vocales[j]) {
                    cont++;
                }
            }

        }

        System.out.println("\nNumero de Vocales : " + cont);

    }

    public void info() {

        System.out.println("\nFECHA DE CREACION : " + fecha);
        System.out.println("ULTIMA MOD : " + ultimaMod);
    }

    public void aumentarTamaño(int n) {
        tamaño += n;
        System.out.println("\nAUMENTO AGREGADO");
    }

    public void infoDelTexto() {
        System.out.println("\n" + texto);
    }

}
