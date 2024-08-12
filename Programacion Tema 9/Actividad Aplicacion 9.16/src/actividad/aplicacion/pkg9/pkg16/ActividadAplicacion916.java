package actividad.aplicacion.pkg9.pkg16;

//Definir las interfaces Cola y Pila para Object e implementarlos en la clase Lista. 


public class ActividadAplicacion916 {
    
    public static void main(String[] args) {
        
        Object tabla[] = new Object[0];
        Object tabla2[] = new Object[0];
        
        Lista l = new Lista(tabla);
        l.apilar("hola");
        l.apilar(2);
        l.apilar(2.34);
        System.out.println(l.toString());
        l.desapilar();
        System.out.println(l.toString());
        Lista l2 = new Lista(tabla2);
        l2.encolar("pepe");
        l2.encolar("jose");
        System.out.println(l2.toString());
        l2.desencolar();
        System.out.println(l2.toString());
    }
    
}
