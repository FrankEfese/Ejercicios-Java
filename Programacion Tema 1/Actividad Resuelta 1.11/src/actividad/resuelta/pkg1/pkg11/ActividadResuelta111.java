package actividad.resuelta.pkg1.pkg11;

//Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
//Por este motivo , es necesario diseñar una aplicacion que solicite las ventas (en kilos) de cada
//semestre para cada fruta. La aplicacion mostrara el importe total sabiendo que el precio del kilo de manzanas 
//esta fijado en 2,35 y el deperas en 1,95.
import java.util.Scanner;

public class ActividadResuelta111 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double preManza = 2.35;
        final double prePera = 1.95;
        int semeMan1, semeMan2, semeMan3;
        int semePer1, semePer2, semePer3;
        double totalManza;
        double totalPera;

        System.out.println("Introduce cuantos kilos de Manzana has vendido en cada Semestre : ");
        System.out.println("----------------");
        System.out.print("\nPrimer Semestre : ");
        semeMan1 = sc.nextInt();
        System.out.print("\nSegundo Semestre : ");
        semeMan2 = sc.nextInt();
        System.out.print("\nTercer Semestre : ");
        semeMan3 = sc.nextInt();
        System.out.println("\nIntroduce cuantos kilos de Peras has vendido en cada Semestre : ");
        System.out.println("----------------");
        System.out.print("\nPrimer Semestre : ");
        semePer1 = sc.nextInt();
        System.out.print("\nSegundo Semestre : ");
        semePer2 = sc.nextInt();
        System.out.print("\nTercer Semestre : ");
        semePer3 = sc.nextInt();
        totalManza = (semeMan1 + semeMan2 + semeMan3) * preManza;
        totalPera = (semePer1 + semePer2 + semePer3) * prePera;
        System.out.println("\nEl total de Manzanas : " + totalManza);
        System.out.println("El total de Peras : " + totalPera);
        System.out.println("El total de todo : " + (totalManza + totalPera));

    }

}
