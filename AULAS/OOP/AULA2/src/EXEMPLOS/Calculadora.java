package OOP.AULA2.src.EXEMPLOS;

public class Calculadora {

    public final int number1;
    public final int number2;

    public Calculadora(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getSoma() {
        return number1 + number2;
    }
}
