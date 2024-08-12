package actividad.resuelta.pkg2.pkg12;

//Pedir el dia , el mes y el año de una fecha e indicar si la fecha es correcta. 
import java.util.Scanner;

public class ActividadResuelta212 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia : ");
        int dia = sc.nextInt();
        System.out.println("Introduce el mes : ");
        int mes = sc.nextInt();
        System.out.println("Introduce el anio : ");
        int anio = sc.nextInt();

        boolean fechaCorrecta = false;

        if (mes == 2 && (dia > 0 && dia < 29)) {
            fechaCorrecta = true;
        } else {
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia < 31)) {
                fechaCorrecta = true;
            } else {
                if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 0 && dia < 32)) {
                    fechaCorrecta = true;
                } else {
                    fechaCorrecta = false;
                }
            }
        }

        if (fechaCorrecta) {
            System.out.println("Fecha OK : " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("ERROR");
        }

    }

}
