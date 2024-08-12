package actividad.resuelta.pkg7.pkg8;

public class Sintonizador {

    final double max = 108;
    final double min = 80;
    double señal;

    public Sintonizador(double señal) {
        this.señal = señal;
    }

    public Sintonizador() {
        señal = 80;
    }

    public void subida() {
        if (señal + 0.5 > 108) {
            señal = 80;
        } else {
            señal += 0.5;
        }

    }

    public void bajada() {

        if (señal - 0.5 < 80) {
            señal = 108;
        } else {
            señal -= 0.5;
        }
    }

    public void señalRadio() {

        System.out.println("SEÑAL : " + señal);
    }

}
