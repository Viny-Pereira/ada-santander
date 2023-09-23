package TecnicasDeProgramacao.Aula4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(n -> System.out.println(n));
        //System.out.println(integerStream.min(Comparator.naturalOrder()).get());


        // Colections
        List<Integer> integers = List.of(1, 4, 2, 3);
        integers.stream().forEach(n -> System.out.println(n));
        System.out.println(integers.stream().min(Comparator.naturalOrder()).get());


    }
}
