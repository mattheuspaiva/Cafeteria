import Bebidas.Bebida;
import Bebidas.Cafe;
import Bebidas.Capuccino;
import Bebidas.ChocolateQuente;
import Decoradores.CaldaChocolateDecorator;
import Decoradores.CanelaDecorator;
import Decoradores.ChantillyDecorator;
import Decoradores.LeiteExtraDecorator;

public class Main {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        Bebida cafeComLeite = new LeiteExtraDecorator(cafe);
        System.out.println(cafeComLeite.getDescricao());
        System.out.println("Preço: R$ " + cafeComLeite.getPreco());
        System.out.println();

        Bebida capuccino = new Capuccino();
        Bebida capuccinoComChantilly = new ChantillyDecorator(capuccino);
        Bebida capuccinoCompleto = new CanelaDecorator(capuccinoComChantilly);
        System.out.println(capuccinoCompleto.getDescricao());
        System.out.println("Preço: R$ " + capuccinoCompleto.getPreco());
        System.out.println();

        Bebida chocolate = new ChocolateQuente();
        Bebida chocolateComLeite = new LeiteExtraDecorator(chocolate);
        Bebida chocolateComChantilly = new ChantillyDecorator(chocolateComLeite);
        Bebida chocolateCompleto = new CaldaChocolateDecorator(chocolateComChantilly);
        System.out.println(chocolateCompleto.getDescricao());
        System.out.println("Preço: R$ " + chocolateCompleto.getPreco());
    }
}