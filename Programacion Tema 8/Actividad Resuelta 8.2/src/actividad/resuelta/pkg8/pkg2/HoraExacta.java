package actividad.resuelta.pkg8.pkg2;

public class HoraExacta extends Hora {

    int segundos;

    public HoraExacta(int segundos, int hora, int minutos) {
        super(hora, minutos);
        this.segundos = 0;

        if (!setSegundos(segundos)) {
            System.out.println("Segundos incorrectos");
        }
    }

    public boolean setSegundos(int v) {

        if (v >= 0 && v < 60) {
            segundos = v;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        String a = super.toString();
        a += " : " + segundos;
        return a;

    }

    @Override
    public boolean setHora(int v) {
        return super.setHora(v);
    }

    @Override
    public boolean setMinutos(int v) {
        return super.setMinutos(v);
    }

    @Override
    public void incrementa() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            super.incrementa();
        }

    }

}
