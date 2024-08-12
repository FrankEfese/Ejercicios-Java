package actividad.resuelta.pkg1.pkg10;

//Diseñar un algoritmo que nos indique si podemos salir a la calle.Existen aspectos que influiran en esta decision : 
//si esta lloviendo y si hemos terminado nuestra tarea.Solo podremos salir a la calle si no esta lloviendo y hemos finalizado nuestra tarea.
//Existe una opcion en la que podremos salir dando igual lo anterior : si tenemos que ir a la biblioteca.

import java.util.Scanner;

public class ActividadResuelta110 {

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ha dejado de llover :  (true / false)");
        boolean lluvia = sc.nextBoolean();
        System.out.println("Has terminado tus tareas : (true / false)");
        boolean tareas = sc.nextBoolean();
        System.out.println("Tienes que ir a la Biblio : (true / false)");
        boolean biblio = sc.nextBoolean();
        
        boolean salir = biblio || (lluvia && tareas);
        
        System.out.println("Puedes salir : " + salir);
      
    }
    
}
