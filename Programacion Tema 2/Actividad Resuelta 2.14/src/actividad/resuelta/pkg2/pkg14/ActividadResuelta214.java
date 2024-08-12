package actividad.resuelta.pkg2.pkg14;

//Crear una aplicacion que solicite al usuario una fecha y  la muestre con un dia mas. 
import java.util.Scanner;

public class ActividadResuelta214 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia : ");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes : ");
        int mes = sc.nextInt();
        System.out.println("Introduce el anio : ");
        int anio = sc.nextInt();
        dia++;

        if (dia > 28 && mes == 2) {
            mes++;
            dia = 1;
        }

        if (dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            dia = 1;
            mes++;
        }

        if (dia > 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
            dia = 1;
            mes++;
        }

        if (mes > 12) {
            mes = 1;
            anio++;
        }

        if (anio == 0) {
            anio++;
        }

        System.out.println("FECHA : " + dia + "/" + mes + "/" + anio);

    }

}
