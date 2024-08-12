package actividad.propuesta.pkg10.pkg4;

//Escribe un texto en un archivo de texto, linea a linea leidas del teclado, hasta que introduzca la cadena fin. 
import java.io.*;
import java.util.Scanner;

public class ActividadPropuesta104 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String txt;
        String aux = "fin";
        BufferedWriter in = null;
        System.out.println("Introduce un texto : ");

        try {

            in = new BufferedWriter(new FileWriter("texto.txt"));
            txt = sc.nextLine();

            while (!txt.equals(aux)) {

                in.write(txt);
                in.newLine();
                txt = sc.nextLine();

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {

            if (in != null) {

                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

    }

}
