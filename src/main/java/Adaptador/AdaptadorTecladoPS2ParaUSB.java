package Adaptador;

import TecladoPS2.TecladoPS2;

public class AdaptadorTecladoPS2ParaUSB implements AdaptadorTeclado {
    private TecladoPS2 tecladoPS2;

    public AdaptadorTecladoPS2ParaUSB(TecladoPS2 tecladoPS2) {
        this.tecladoPS2 = tecladoPS2;
    }

    @Override
    public void conectar() {
        tecladoPS2.conectarViaPS2();
        System.out.println("Adaptando para USB");
    }
}
