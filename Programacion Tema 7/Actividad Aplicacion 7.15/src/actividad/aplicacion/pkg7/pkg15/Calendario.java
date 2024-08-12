package actividad.aplicacion.pkg7.pkg15;

public class Calendario {

    int año;
    int mes;
    int dia;

    public Calendario(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public static Calendario c(int anio, int mes, int dia) {

        if (mes > 12 || mes < 1) {
            mes = 1;
        }

        if (dia < 1 || dia > 31) {
            dia = 1;
        }

        return new Calendario(anio, mes, dia);

    }

    public void increDia() {

        dia++;

        if (mes == 2 && dia > 28) {
            mes++;
            dia = 1;
        }

        if ((mes == 1 || mes == 3 || mes == 5 || mes == 8 || mes == 7 || mes == 12 || mes == 10) && dia > 31) {
            mes++;
            dia = 1;
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            dia = 1;
            mes++;
        }

        if (mes > 12) {
            mes = 1;
            año++;
        }

    }

    public void increMes() {
        mes++;

        if (mes > 12) {
            mes = 1;
            año++;
        }
    }

    public void increAnio() {
        año++;
    }

    public void mostrar() {

        System.out.println(dia + " / " + mes + " / " + año);

    }

    public boolean iguales(Calendario p) {

        if (this.año == p.año && this.mes == p.mes && this.dia == p.dia) {
            return true;
        } else {
            return false;
        }

    }

}
