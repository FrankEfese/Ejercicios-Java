package actividad.aplicacion.pkg8.pkg24;

public abstract class Poligono {

    protected double base;
    protected double altura;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    

    abstract public void area();

}
