package Decoradores;

import Bebidas.Bebida;

public class CaldaChocolateDecorator implements Bebida {
    private final Bebida bebida;

    public CaldaChocolateDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Calda de Chocolate";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.50;
    }
}
