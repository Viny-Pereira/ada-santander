package TecnicasDeProgramacao.Aula3.atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Ecommerce {
    public static void main(String[] args) {

        Function<List<Produto>, Double> precoTotal = listaProdutos -> {
            Double soma = 0d;
            for (Produto produto : listaProdutos) {
                soma += produto.getPreco();
            }
            return soma;
        };
        List<Produto> produtos = new ArrayList<>();
        Produto produto = new Produto();
        produto.setNome("Pasta de dente");
        produto.setPreco(3.50);
        Produto produto1 = new Produto();
        produto1.setNome("Feijao");
        produto1.setPreco(5.50);
        produtos.add(produto);
        produtos.add(produto1);

        System.out.println("Soma valores da lista: " + precoTotal.apply(produtos));
    }


}
