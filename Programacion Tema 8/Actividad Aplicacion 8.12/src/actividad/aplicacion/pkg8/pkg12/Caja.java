package actividad.aplicacion.pkg8.pkg12;

public class Caja {

    protected enum Unidad {
        M, CM
    };

    protected double ancho;
    protected double alto;
    protected double fondo;
    protected Unidad uni;
    protected String etiqueta;

    public Caja(double ancho, double alto, double fondo, String etiqueta, Unidad uni) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.uni = uni;
        this.etiqueta = "Por Defecto";

        if (!setEtiqueta(etiqueta)) {

            System.out.println("\nHas pasado el limite de caracteres.");

        }
    }

    public void getVolumen() {

        if (uni == Unidad.M) {

            double volumen = (ancho * alto * fondo);
            System.out.println("\nVolumen : " + volumen);

        } else {
            double volumen = (ancho * alto * fondo) * 1000000;

            System.out.println("\nVolumen : " + volumen);
        }
    }

    public boolean setEtiqueta(String s) {

        if (s.length() <= 30) {
            etiqueta = s;

            return true;
        } else {

            return false;
        }
    }

    @Override
    public String toString() {
        return "Caja{" + "ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", uni=" + uni + ", etiqueta=" + etiqueta + '}';
    }

}
