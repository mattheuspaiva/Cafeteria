package Decoradores;

import Bebidas.Bebida;

public class CanelaDecorator implements Bebida {
    private final Bebida bebida;

    public CanelaDecorator(Bebida bebida){
        this.bebida = bebida;
    }
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Canela";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.50;
    }
}
