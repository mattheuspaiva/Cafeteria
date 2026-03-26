package Bebidas;

public class Cafe implements Bebida{
    @Override
    public String getDescricao() {
        return "Bebida: Café";
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}
