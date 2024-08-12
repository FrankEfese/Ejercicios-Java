package actividad.aplicacion.pkg7.pkg12;

public class Ecuacion {

    double a;
    double b;
    double c;

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void discriminantes() {

        double discriminante = b * b - 4 * a * c;
        System.out.println("Discriminante : " + discriminante);
    }

    public void solucion() {

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución es única: x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }

    }

}
