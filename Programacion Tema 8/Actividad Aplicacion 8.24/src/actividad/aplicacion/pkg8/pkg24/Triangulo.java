package actividad.aplicacion.pkg8.pkg24;

public class Triangulo extends Poligono {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public void area() {

        System.out.println("Area : " + (base * altura) / 2);

    }

}
