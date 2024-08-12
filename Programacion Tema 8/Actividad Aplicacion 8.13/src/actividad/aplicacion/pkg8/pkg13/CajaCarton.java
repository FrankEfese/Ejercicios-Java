package actividad.aplicacion.pkg8.pkg13;

public class CajaCarton extends Caja {

    public CajaCarton(double ancho, double alto, double fondo, String etiqueta) {
        super(ancho, alto, fondo, etiqueta);
        uni = Unidad.CM;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean setEtiqueta(String s) {
        return super.setEtiqueta(s);
    }

    @Override
    public void getVolumen() {

        double volumen = (ancho * fondo * alto);

        System.out.println("Volumen : " + (volumen * 0.8));

    }

    public void superficie() {

        double areaCara1 = ancho * alto; // Cara 1
        double areaCara2 = ancho * alto; // Cara 2
        double areaCara3 = ancho * fondo; // Cara 3
        double areaCara4 = ancho * fondo; // Cara 4
        double areaCara5 = alto * fondo; // Cara 5
        double areaCara6 = alto * fondo; // Cara 6

        double superficieTotal = 2 * (areaCara1 + areaCara2 + areaCara3 + areaCara4 + areaCara5 + areaCara6);
        System.out.println("Superficie : " + superficieTotal);

    }

}
