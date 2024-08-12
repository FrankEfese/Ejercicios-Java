package actividad.aplicacion.pkg8.pkg11;

public class Campana extends Instrumento {

    public Campana() {
        super();
    }

    @Override
    public void add() {
        super.add();
    }

    @Override
    void interpretar() {

        for (notas n : tablaNotas) {
            System.out.println(n);
        }
    }

}
