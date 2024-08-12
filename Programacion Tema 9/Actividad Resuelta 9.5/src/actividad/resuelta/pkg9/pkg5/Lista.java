package actividad.resuelta.pkg9.pkg5;

import java.util.Arrays;

public class Lista implements ColaDoble, Pila {

    Integer tabla[];

    public Lista() {
        tabla = new Integer[0];
    }

    void insertaralfinal(int dato) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = dato;
    }

    Integer eliminarT(int indice) {

        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];

            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);

        }

        return eliminado;
    }

    @Override
    public void encolar(Integer n) {
        insertaralfinal(n);
    }

    @Override
    public Integer desencolar() {
        return eliminarT(0);
    }

    @Override
    public void encolarPrincipio(Integer n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer desencolaFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Lista{" + "tabla=" + Arrays.toString(tabla) + '}';
    }

    @Override
    public void apilar(Integer n) {
        insertaralfinal(n);
    }

    @Override
    public Integer desapilar() {
        return eliminarT(tabla.length - 1);
    }

}
