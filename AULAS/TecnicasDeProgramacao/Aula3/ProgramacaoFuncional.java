package TecnicasDeProgramacao.Aula3;

public class ProgramacaoFuncional {
    public static void main(String[] args) {
        Integer numero1 = 2;
        Integer numero2 = 4;


        Operacao operacaoSomar = new OperacaoSomar();
        Integer resultado = calcular(numero1, numero2, operacaoSomar);
        System.out.println(resultado);

        Operacao operacaoSubtrair = new OperacaoSubtrair();
        resultado = calcular(numero1, numero2, operacaoSubtrair);
        System.out.println(resultado);

        /*Operacao operacaoLambdaSomar = (Integer a, Integer b) -> {
            return a + b;
        };*/
        Operacao operacaoLambdaSomar = (a, b) -> a + b;
    }

    public static Integer calcular(Integer numero1, Integer numero2, Operacao operacao) {
        return operacao.executar(numero1, numero2);
    }

}
