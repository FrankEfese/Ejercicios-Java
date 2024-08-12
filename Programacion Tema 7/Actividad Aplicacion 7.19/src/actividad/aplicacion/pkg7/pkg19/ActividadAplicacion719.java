package actividad.aplicacion.pkg7.pkg19;

//Implementa la clase Pila para numeros Integer , usando directamente una tabla
//para guardar los elementos apilados. 
public class ActividadAplicacion719 {

    public static void main(String[] args) {

        Pila p = new Pila();
        p.apilar(5);
        p.apilar(23);
        p.apilar(44);
        p.mostrarPila();
        p.desapilar();
        p.mostrarPila();
        p.apilar(10);
        p.mostrarPila();
        p.apilar(89);
        p.apilar(32);
        p.mostrarPila();
        p.desapilar();
        p.mostrarPila();
    }

}
