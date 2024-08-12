package actividad.resuelta.pkg7.pkg13;

//Una pila es una estructura dinamica de datos donde los elementos se insertan y se retiran 
//siguiendo la norma de que el ultimo que se apila sera el primero en desapilarse. 
//Implementar la clase Pila para numeros Integer , donde se usa una lista para guardar elementos apilados. 
public class ActividadResuelta713 {

    public static void main(String[] args) {

        Lista l = new Lista();
        Pila p = new Pila(l);
        p.desapilar();
        p.apilar(4);
        p.apilar(43);
        p.apilar(24);
        p.apilar(14);
        p.desapilar();
        p.desapilar();
        p.mostrarPila();
    }

}
