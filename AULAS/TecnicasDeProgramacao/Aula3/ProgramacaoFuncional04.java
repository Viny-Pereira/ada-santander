package TecnicasDeProgramacao.Aula3;

import java.util.function.BiFunction;

public class ProgramacaoFuncional04 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> calculadoraSomar = (n1, n2) -> n1 + n2;

        System.out.println(calculadoraSomar.apply(1, 3));
    }
}
