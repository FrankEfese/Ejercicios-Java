package actividad.resuelta.pkg8.pkg5;

public class Piano extends Instrumento {

    public Piano() {
        super();
    }

    @Override
    public void add() {
        super.add();
    }

    @Override
    void interpretar() {

        for (notas a : tablaNotas) {

            System.out.println(a);

        }
    }

}
