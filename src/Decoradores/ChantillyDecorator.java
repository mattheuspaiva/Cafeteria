package Decoradores;

import Bebidas.Bebida;

public class ChantillyDecorator implements Bebida {
    private final Bebida bebida;

    public ChantillyDecorator(Bebida bebida){
        this.bebida = bebida;
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chantilly";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 3.00;
    }
}
