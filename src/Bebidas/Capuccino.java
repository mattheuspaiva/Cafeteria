package Bebidas;

public class Capuccino implements Bebida{
    @Override
    public String getDescricao() {
        return "Bebida: Capuccino";
    }

    @Override
    public double getPreco() {
        return 8.0;
    }
}
