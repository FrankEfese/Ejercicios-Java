package Maquinaria;

import Personal.Maquinista;

public class Tren {

    Locomotora loc;
    Vagones tabla[] = new Vagones[5];
    Maquinista maqui;

    public Tren(Locomotora loc, Maquinista maqui) {
        this.loc = loc;
        this.maqui = maqui;
    }

}
