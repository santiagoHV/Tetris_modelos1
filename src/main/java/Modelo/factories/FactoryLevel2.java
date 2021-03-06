package Modelo.factories;

import JuegoTetris.*;

public class FactoryLevel2 implements Factory{
    @Override
    public Fichas retornarFicha() {
        int random = (int) (Math.random()*70);

        if(random < 15){
            return new FichaO();
        }else if(random >= 15 && random < 20){
            return new FichaJ();
        }else if(random >= 20 && random < 30){
            return new Ficha_S();
        }else if(random >= 30 && random < 40){
            return new FichaI();
        }else if(random >= 40 && random < 50){
            return new FichaL();
        }else if(random >= 50 && random < 60){
            return  new FichaT();
        }else{
            return new FichaZ();
        }
    }

    @Override
    public int retornarTiempo() {
        return 100;
    }
}
