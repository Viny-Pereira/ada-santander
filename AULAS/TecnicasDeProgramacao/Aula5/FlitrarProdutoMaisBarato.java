package TecnicasDeProgramacao.Aula5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FlitrarProdutoMaisBarato {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 2500.0, 10),
                new Produto("Impressora", 800.0, 5),
                new Produto("Mouse", 50.0, 20),
                new Produto("Teclado", 100.0, 15)
        );

        System.out.println(produtos.stream().min(Comparator.comparingDouble(p -> p.getPreco())).get().getNome());
    }
}
