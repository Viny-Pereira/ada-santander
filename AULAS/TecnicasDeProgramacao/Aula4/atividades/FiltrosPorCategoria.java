package TecnicasDeProgramacao.Aula4.atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FiltrosPorCategoria {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletrônicos"),
                new Produto("Camisa", "Vestuário"),
                new Produto("Smartphone", "Eletrônicos"),
                new Produto("Tênis", "Calçados"));

        produtos.stream().filter(p -> p.getCategoria().equals("Vestuário")).forEach(p -> System.out.println(p.getNome()));
    }

}
