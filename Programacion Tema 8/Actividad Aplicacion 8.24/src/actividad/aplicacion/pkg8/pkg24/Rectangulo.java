package actividad.aplicacion.pkg8.pkg24;

public class Rectangulo extends Poligono {

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void area() {

        System.out.println("Area : " + (base * altura));
    }

}
