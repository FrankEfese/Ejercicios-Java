package actividad.aplicacion.pkg7.pkg15;

//Diseña la clase Calendario que representa una fecha concreta . 
//-Calendario (int año , mes y dia) , crea un objeto Calendario, la fecha debe estar bien. 
//-incrementaDia. 
//-incrementaMes. 
//-incrementaAño. 
//-mostrar. 
//-comparardosCalendarios. 
import java.util.*;

public class ActividadAplicacion715 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.println("Introduce el anio : ");
        int anio = sc.nextInt();
        System.out.println("Introduce el mes : ");
        do {
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);

        System.out.println("Introduce el dia : ");
        int dia = 0;
        if (mes == 2) {

            do {

                dia = sc.nextInt();
            } while (dia < 0 || dia > 28);
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 8 || mes == 7 || mes == 12 || mes == 10) {

            do {
                dia = sc.nextInt();
            } while (dia < 0 || dia > 31);
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            do {
                dia = sc.nextInt();
            } while (dia < 0 || dia > 30);
        }

        Calendario c = new Calendario(anio, mes, dia);
        Calendario c2 = new Calendario(anio, mes, dia);
        c.increDia();
        c.increMes();
        c.increAnio();
        c.increMes();
        c.mostrar();
        c2.increDia();
        c2.increMes();
        c2.increAnio();
        c2.increMes();
        c2.mostrar();
        System.out.println(c.iguales(c2));

        Calendario p = Calendario.c(anio, mes, dia);
        p.mostrar();

    }

}
