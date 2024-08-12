package actividad.resuelta.pkg1.pkg13;

//Escribir un programa que solicite las notas del primer , segundo y tercer trimestre
//(notas enteras que se solicitaran al usuario). El programa debe mostrar la nota media del curso
//como se utiliza en el boletin de calificaciones (solo la parte entera) y como se usa en 
//el expediente academico(con decimales).
import java.util.Scanner;

public class ActividadResuelta113 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int notaPrimer, notaSegun, notaTerce;
        double notaExpediente;
        int notaBoletin;

        System.out.println("Introduce las notas del curso : ");
        System.out.println("--------------------");
        System.out.print("\nPrimer Semestre : ");
        notaPrimer = sc.nextInt();
        System.out.print("\nSegundo Semestre : ");
        notaSegun = sc.nextInt();
        System.out.print("\nTercer Semestre : ");
        notaTerce = sc.nextInt();

//       notaExpediente =  (notaPrimer + notaSegun + notaTerce) / 3.0;
        notaExpediente = (double) (notaPrimer + notaSegun + notaTerce) / 3;
        notaBoletin = (int) notaExpediente;
        System.out.println("\nLa nota del Boletin : " + notaBoletin);
        System.out.println("La nota del Expediente : " + notaExpediente);

    }

}
