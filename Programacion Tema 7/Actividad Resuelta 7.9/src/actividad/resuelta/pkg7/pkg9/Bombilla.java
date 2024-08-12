package actividad.resuelta.pkg7.pkg9;

public class Bombilla {

    private boolean estado;
    public static boolean interruptor = true;

    public Bombilla() {
        estado = false;
    }

    public void enciende() {
        estado = true;
    }

    public void apaga() {
        estado = false;

    }

    public boolean estado() {
        return interruptor && estado;
    }

    public String estadoInfo() {
        return estado() ? "Encendida" : "Apagada";
    }
}
