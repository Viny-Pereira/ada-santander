package Aula7.src.exemplo.LMS;

public class EX002 {
    public static void main(String[] args) {
        String resposta = numeroPertenceASequenciaFibonacci(8);
        System.out.println(resposta);
    }

    public static String numeroPertenceASequenciaFibonacci(int input) {
        String reposta = "0";
        int primeiroNumero = 0;
        int segundoNumero = 1;
        int auxiliar;
        while (segundoNumero <= input) {
            reposta+=", " + segundoNumero;

            auxiliar = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = auxiliar;
        }
        return reposta;

    }
}
