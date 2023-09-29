package TecnicasDeProgramacao.Aula5;

import java.util.Arrays;
import java.util.List;

public class MapearProdutoPorPreco {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 2500.0, 10),
                new Produto("Impressora", 800.0, 5),
                new Produto("Mouse", 50.0, 20),
                new Produto("Teclado", 100.0, 15)
        );
        produtos.stream().map(p->p.getPreco()).forEach(p -> System.out.println(p));

    }
}