package Bebidas;

public class ChocolateQuente implements Bebida{
    @Override
    public String getDescricao() {
        return "Bebida: Chocolate quente";
    }

    @Override
    public double getPreco() {
        return 7.0;
    }
}
