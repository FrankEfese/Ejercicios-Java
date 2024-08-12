package Maquinaria;

import Personal.Mecanico;

public class Locomotora {

    String matricula;
    int potencia;
    int anioAnt;
    Mecanico mec;

    public Locomotora(String matricula, int potencia, int anioAnt, Mecanico mec) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anioAnt = anioAnt;
        this.mec = mec;
    }

}
