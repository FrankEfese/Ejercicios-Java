package actividad.resuelta.pkg13.pkg1;

//Definir una interfaz cuya funcion abstracta permita generar un saludo dirigido al objeto
//que se le pasa como parametro . Implementar un saludo para nombres y otra para clientes . 
public class ActividadResuelta131 {
    
    public static void main(String[] args) {
        
        Cliente t = new Cliente("Pepe");
        
        Saludo<Cliente> s = x -> "Hola " + x.nombre;
        
        System.out.println(s.saludo(t));
        
        String nombre = "Jose";
        
        Saludo<String> n = nom -> "Hola " + nom;
        
        System.out.println(n.saludo(nombre));
        
    }
    
}
