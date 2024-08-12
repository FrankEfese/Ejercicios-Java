package actividad.resuelta.pkg7.pkg5;

public class CuentaCorriente {

    String dni;
    String nombre;
    int saldo;
    static private String banco = "BBVA";
    Gestor gestor;

    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public CuentaCorriente(String dni, String nombre, Gestor gestor) {
        this.dni = dni;
        this.nombre = nombre;
        this.gestor = gestor;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

    public CuentaCorriente(String dni, int saldo) {
        this.dni = dni;
        nombre = "Sin Asignar";
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String nombre, int saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    boolean sacarDinero(int n) {

        boolean operacion = false;

        if (saldo - n >= 0 && n > gestor.importeMax) {

            operacion = true;
            saldo -= n;

        }

        System.out.println("\nSALDO ACTUAL : " + saldo);

        return operacion;

    }

    void gestor() {

        System.out.println("Nombre : " + gestor.nombre);
        System.out.println("Telefono : " + gestor.telefono);
        System.out.println("Importe Max : " + gestor.importeMax);

    }

    void ingresarDinero(int n) {

        if (n < gestor.importeMax) {
            saldo += n;
            System.out.println("\nDINERO INGRESADO");
            System.out.println("\nSALDO ACTUAL : " + saldo);
        } else {
            System.out.println("\nNO SE PUEDE REALIZAR");
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo + ",banco=" + banco + ", gestor=" + gestor + '}';
    }

}
