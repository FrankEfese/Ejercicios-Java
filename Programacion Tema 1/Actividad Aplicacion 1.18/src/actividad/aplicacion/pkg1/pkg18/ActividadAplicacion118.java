package actividad.aplicacion.pkg1.pkg18;

//Un biologo esta realizando un estudio de distintas especies de invertebrados y necesita
//una aplicacion que le ayude a contabilizar el numero de patas que tienen en total todos 
//los animales capturados durante una jornada de trabajo.Para ello , te ha solicitado 
//que escribas una aplicacion a la que hay que proporcionar :
//-El numero de hormigas capturadas (6 patas)
//-El numero de arañas capturadas (8 patas)
//-El numero de cochinillas capturadas (14 patas)
//La aplicacion debe mostrar el numero total de patas.

import java.util.Scanner;

public class ActividadAplicacion118 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final int patasHormigas = 6;
        final int patasArañas = 8;
        final int patasCochinillas = 14;
        
        System.out.println("Introduce cuantas hormigas has capturado : ");
        int hormigas = sc.nextInt();
        System.out.println("Introduce cuantas aranias has capturado : ");
        int arañas = sc.nextInt();
        System.out.println("Introduce cuantas cochinillas has capturado : ");
        int cochinillas = sc.nextInt();
        
        int totalPatas = (hormigas * patasHormigas) + (arañas * patasArañas) + (cochinillas * patasCochinillas);
        System.out.println("El total de patas es : " + totalPatas);
     
    }
    
}
