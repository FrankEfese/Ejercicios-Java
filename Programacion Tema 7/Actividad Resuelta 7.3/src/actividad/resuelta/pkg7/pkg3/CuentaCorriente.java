package actividad.resuelta.pkg7.pkg3;

public class CuentaCorriente {

    String dni;
    public String nombre;
    private int saldo;

    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
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

        if (saldo - n >= 0) {

            operacion = true;
            saldo -= n;

        }

        System.out.println("\nSALDO ACTUAL : " + saldo);

        return operacion;

    }

    void ingresarDinero(int n) {

        saldo += n;
        System.out.println("\nDINERO INGRESADO");
        System.out.println("\nSALDO ACTUAL : " + saldo);

    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }

}
