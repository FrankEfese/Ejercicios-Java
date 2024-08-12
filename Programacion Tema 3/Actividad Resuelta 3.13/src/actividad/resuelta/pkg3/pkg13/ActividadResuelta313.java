package actividad.resuelta.pkg3.pkg13;

//Dadas 6 notas , escribir la cantidad de alumnos aprobados, condicionados
//(nota igual a 4) y suspensos.
import java.util.Scanner;

public class ActividadResuelta313 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contApro = 0;
        int contSus = 0;
        int condicionados = 0;
        int cont = 0;

        do {

            System.out.println("Introduce una nota : ");
            double nota = sc.nextDouble();

            if (nota >= 5 && nota <= 10) {
                contApro++;
                cont++;
            } else {
                if (nota < 4 && nota >= 0) {
                    contSus++;
                    cont++;
                } else {
                    if (nota >= 4 && nota < 5) {   // Condicionados entre 4 y < 5
                        condicionados++;
                        cont++;
                    }
                }
            }

        } while (cont != 6);

        System.out.println("\nNumero de Aprobados : " + contApro);
        System.out.println("Numero de Suspensos : " + contSus);
        System.out.println("Numero de Condicionados : " + condicionados);

    }

}
