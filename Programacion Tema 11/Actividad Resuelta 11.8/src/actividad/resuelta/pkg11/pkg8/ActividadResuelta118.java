package actividad.resuelta.pkg11.pkg8;

//Implementar un programa que guarde en el fichero socios.dat una tabla de objetos
//Socio. Despues se abrira de nuevo el fichero en modo lectura para recuperar la tabla de socios 
//mostrandose por pantalla. 
import java.io.*;
import java.util.Arrays;

public class ActividadResuelta118 {

    public static void main(String[] args) {

        Socio s = new Socio("2353255A", "PEPE");
        Socio s2 = new Socio("23532556P", "FRAN");
        Socio s3 = new Socio("235323E", "JOSE");
        Socio s4 = new Socio("2353A", "LUIS");

        Socio tabla[] = new Socio[4];
        tabla[0] = s;
        tabla[1] = s2;
        tabla[2] = s3;
        tabla[3] = s4;
        System.out.println(Arrays.deepToString(tabla));

        try (ObjectOutputStream le = new ObjectOutputStream(new FileOutputStream("socios.dat")); ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {

            le.writeObject(tabla);

            Socio tablaNueva[] = (Socio[]) in.readObject();

            System.out.println(Arrays.deepToString(tablaNueva));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
