import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto(1, "Copo", 3.5),
                new Produto(2, "Caneta", 0.9),
                new Produto(3, "Jogo de Panelas", 130.5)
        );

        for(Produto p : produtos) {
            System.out.format(new Locale("pt", "BR"),"%04d\t%-20s\t%.2f%n", p.getId(), p.getNome(), p.getPreco());
        }

        double preco = 1356.7;
        String precoStr = String.format(new Locale("en", "US"),"%.2f", preco);
        System.out.println(precoStr);

    }


}
