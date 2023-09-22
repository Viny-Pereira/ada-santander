package TecnicasDeProgramacao.Aula3.atividade;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero1 = 1;
        int numero2 = 2;

        int somar = calculadora.executar(numero1, numero2, (n1, n2) -> n1 + n2);
        System.out.println(somar);

        int subtrair = calculadora.executar(numero1, numero2, (n1, n2) -> n1 - n2);
        System.out.println(subtrair);
        int multiplicar = calculadora.executar(numero1, numero2, (n1, n2) -> n1 * n2);
        System.out.println(multiplicar);
        int dividir = calculadora.executar(numero1, numero2, (n1, n2) -> n1 / n2);
        System.out.println(dividir);
    }
}
