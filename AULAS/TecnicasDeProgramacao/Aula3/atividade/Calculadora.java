package TecnicasDeProgramacao.Aula3.atividade;

import java.util.function.BiFunction;

public class Calculadora {
    Integer executar(Integer numero1, Integer numero2, BiFunction<Integer, Integer, Integer> operacao) {
        return operacao.apply(numero1, numero2);
    }
}
