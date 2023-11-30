import java.util.ArrayList;

public class SistemaEstoqueProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Eletronico("Smartphone", 1200.0));
        produtos.add(new Roupa("Camiseta", 25.0));
        produtos.add(new Eletronico("Tablet", 800.0));

        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());

            produto.ligar();
            produto.conectarWiFi();

            System.out.println();
        }
    }
}