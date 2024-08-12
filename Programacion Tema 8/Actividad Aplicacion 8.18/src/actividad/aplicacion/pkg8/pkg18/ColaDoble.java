/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.aplicacion.pkg8.pkg18;

import java.util.Arrays;

/**
 *
 * @author franc
 */
public class ColaDoble extends Cola {

    public ColaDoble() {
        super();
    }

    @Override
    public void insertarFinal(int n) {
        super.insertarFinal(n);
    }

    @Override
    public void eliminarParametro() {
        super.eliminarParametro();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void insertarPrincipio(int n) {

        Integer t[] = new Integer[1];
        t[0] = n;

        for (Integer a : tabla) {
            t = Arrays.copyOf(t, t.length + 1);
            t[t.length - 1] = a;
        }

        tabla = t;

    }

    public void desencolarFinal() {

        tabla = Arrays.copyOf(tabla, tabla.length - 1);

    }

}
