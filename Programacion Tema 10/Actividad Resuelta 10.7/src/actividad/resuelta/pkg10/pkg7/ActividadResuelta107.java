package actividad.resuelta.pkg10.pkg7;

//Vamos a guardar en un fichero de texto (En un lugar de la mancha ,
//de cuyo nombre no quiero acordarme). La primera linea caracter a caracter y la segunda en una sola sentencia. 
import java.io.*;

public class ActividadResuelta107 {

    public static void main(String[] args) {

        String txt = "En un lugar de La Mancha,";
        String txt2 = "de cuyo nombre no quiero acordarme.";

        BufferedWriter in;

        try {

            in = new BufferedWriter(new FileWriter("prueba.txt"));

            for (int x = 0; x < txt.length(); x++) {
                in.write(txt.charAt(x));

            }
            in.newLine();

            in.write(txt2);
            in.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
