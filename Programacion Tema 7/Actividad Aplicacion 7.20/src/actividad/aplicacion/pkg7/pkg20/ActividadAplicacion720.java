package actividad.aplicacion.pkg7.pkg20;

//Repite la actividad anterior usando una Lista para guardar los elementos encolados. 
public class ActividadAplicacion720 {

    public static void main(String[] args) {

        Lista l = new Lista();
        Pila p = new Pila(l);
        p.l.insertarFinal(5);
        p.l.insertarFinal(52);
        p.l.insertarFinal(15);
        p.l.mostrarLista();
        p.l.eliminarParametro(p.l.tabla.length - 1);
        p.l.mostrarLista();
        p.l.insertarFinal(35);
        p.l.insertarFinal(524);
        p.l.insertarFinal(135);
        p.l.mostrarLista();
        p.l.eliminarParametro(p.l.tabla.length - 1);
        p.l.mostrarLista();
    }

}
