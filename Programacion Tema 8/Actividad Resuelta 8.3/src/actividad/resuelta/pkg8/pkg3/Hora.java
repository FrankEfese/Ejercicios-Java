package actividad.resuelta.pkg8.pkg3;

public class Hora {

    int hora;
    int minutos;

    public Hora(int hora, int minutos) {
        this.hora = 0;
        this.minutos = 0;

        if (!setHora(hora)) {
            System.out.println("Hora incorrecta");
        }

        if (!setMinutos(minutos)) {
            System.out.println("Minutos incorrectos");
        }
    }

    public void incrementa() {

        minutos++;

        if (minutos > 59) {
            minutos = 0;
            hora++;
        }

        if (hora > 23) {

            hora = 0;
        }

    }

    public boolean setMinutos(int v) {

        if (v >= 0 && v < 60) {

            minutos = v;
            return true;

        } else {
            return false;
        }

    }

    public boolean setHora(int v) {

        if (v >= 0 && v < 24) {

            hora = v;
            return true;

        } else {
            return false;
        }

    }

    @Override
    public String toString() {

        String h;
        h = hora + " : " + minutos;

        return h;
    }
}
