package actividad.aplicacion.pkg2.pkg13;

//En una granja se compra directamente una cantidad (comidaDiaria) de comida para los animales. 
//El numero de animales que alimentar (todos la misma especie) es numAnimales, y sabemos que cada animal come una media de 
//kilosPorAnimal. Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de
//alimento suficiente para cada animal . En caso negativo , ha de calcular cual es la racion que corresponde a cada uno. 

import java.util.Scanner;



public class ActividadAplicacion213 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de Comida Diaria : ");
        int comDiaria = sc.nextInt();
        System.out.println("Introduce la cantidad de Animales : ");
        int cantAnimales = sc.nextInt();
        System.out.println("Cuantos kilos de media come cada Animal : ");
        int kilosMedia = sc.nextInt();
        
        double media = comDiaria / cantAnimales;
        
        if(media >= kilosMedia){
            System.out.println("Hay suficiente comida.");
        }else{
            System.out.println("No hay suficiente , por lo que la racion debe ser : " + media);
        }
        
    }
    
}
