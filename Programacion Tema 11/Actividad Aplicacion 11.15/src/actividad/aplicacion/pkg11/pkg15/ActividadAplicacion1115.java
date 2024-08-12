package actividad.aplicacion.pkg11.pkg15;

//Implementa un programa que lea numeros enteros desde el fichero numeros.dat y los
//vaya guardando en los ficheros pares.dat y impares.dat . 
import java.io.*;

public class ActividadAplicacion1115 {

    public static void main(String[] args) {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros.dat"))) {

            while (true) {

                int n = in.readInt();

                if (n % 2 == 0) {

                    try (ObjectOutputStream par = new ObjectOutputStream(new FileOutputStream("numerosPar.dat"))) {

                        par.writeInt(n);
                        System.out.println("PAR :");
                        System.out.println(n);

                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }

                } else {

                    if (n % 2 != 0) {

                        try (ObjectOutputStream imp = new ObjectOutputStream(new FileOutputStream("numerosImpar.dat"))) {

                            imp.writeInt(n);
                            System.out.println("IMPAR : ");
                            System.out.println(n);

                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                }

            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
