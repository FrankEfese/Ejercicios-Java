/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.propuesta.pkg12.pkg5;

import java.util.Comparator;

/**
 *
 * @author franc
 */
public class ComparadorNombre implements Comparator<Cliente> {

    @Override
    public int compare(Cliente o1, Cliente o2) {

        return o1.nombre.compareTo(o2.nombre);
    }

}
