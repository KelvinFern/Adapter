package org.example;

import Adaptador.AdaptadorTeclado;
import Adaptador.AdaptadorTecladoPS2ParaUSB;
import TecladoPS2.TecladoPS2;
import TecladoPS2.TecladoPS2Impl;

public class Main {
    public static void main(String[] args) {
        TecladoPS2 tecladoPS2 = new TecladoPS2Impl();
        AdaptadorTeclado adaptador = new AdaptadorTecladoPS2ParaUSB(tecladoPS2);
        adaptador.conectar();
    }
}
