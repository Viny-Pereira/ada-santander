package OOP.AULA2.src.EXEMPLOS;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(1,2);
        int resultado = calculadora.getSoma();
        System.out.println("Resultado: "+ resultado);
    }
}
