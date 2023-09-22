package TecnicasDeProgramacao.Aula3;

public class OperacaoSubtrair implements Operacao {
    @Override
    public Integer executar(Integer numero1, Integer numero2) {
        return numero1 - numero2;
    }
}
