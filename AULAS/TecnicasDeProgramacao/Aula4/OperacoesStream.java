package TecnicasDeProgramacao.Aula4;

import java.util.Comparator;
import java.util.stream.Stream;

public class OperacoesStream {
    public static void main(String[] args) {
        //Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        //integerStream.map(n -> n * 2).filter(n -> n.equals(2)).forEach(n -> System.out.println(n));

        // remover elementos iguais dentro da stream
        Stream<String> produtos = Stream.of("Feijão", "Arroz", "Feijão", "macarrão");
        produtos.distinct().forEach(p -> System.out.println(p));

        // ordencacao de valores na stream
        Stream<Integer> integerStream = Stream.of(5, 32, 1, 0);
        integerStream.sorted().forEach(n -> System.out.println(n));

        // ordenacao de valores da Stream atraves da operacao terminal forEachOrdered
        integerStream.forEachOrdered(n -> System.out.println(n));

        Stream<Integer> novaStream = Stream.of(32, 5, 1, 6);
        novaStream.forEachOrdered(n -> System.out.println(n));

        // maior elemento da stream
        Stream<Integer> maiorElemento = Stream.of(32, 4, 5, 6, 7, 100);
        System.out.println(maiorElemento.max(Comparator.naturalOrder()));
    }
}
