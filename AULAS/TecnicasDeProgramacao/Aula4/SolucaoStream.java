package TecnicasDeProgramacao.Aula4;

import java.util.stream.Stream;

public class SolucaoStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 6, 7, 8, 9);

/*        Stream<Integer> streamDobro = stream.map(n -> 2 * n);
        System.out.println(streamDobro);*/
        stream.map(n -> 2 * n).forEach(n -> System.out.println(n));

    }
}
