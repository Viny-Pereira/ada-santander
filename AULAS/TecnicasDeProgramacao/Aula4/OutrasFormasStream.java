package TecnicasDeProgramacao.Aula4;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class OutrasFormasStream {
    public static void main(String[] args) {
        //Colecao vazia
        Collections.emptyList();
        // Stream vazia;
        Stream.empty().map(n -> n + "").forEach(n -> System.out.println(n));
    }
}
