package LogicaProgramacao.src.Aula3.src.FrutasPreco;

public class Main {
    public static void main(String[] args) {
        double numeroFrutas = 7;
        double custo = custoCompra(numeroFrutas);
        System.out.println("R$ "+custo);
    }

    public static double custoCompra(double input) {
        double valorAPagar = input * 1.45;
        if (input > 10) {
            valorAPagar = input * 1.25;
        }
        return valorAPagar;
    }
}
