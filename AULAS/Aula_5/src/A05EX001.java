package Aula_5.src;
import java.util.Scanner;
public class A05EX001 {
    public static void main(String[] args) {
        String[] frutas = {"Pera", "Laranja", "Maca", "Tomate", "Caqui", "Morango"};
        int[] quantidades = new int[frutas.length];
        Scanner scanner = new Scanner(System.in);
        int quantidade;
        System.out.println("Bem vindo a feira. Para cada fruta coloque a quantidade desejada");

        for(int i = 0; i < frutas.length; i++){
            String nomeFruta = frutas[i];
            System.out.printf("Quantas %s você deseja comprar", frutas[i]);
            quantidade = scanner.nextInt();
            verificadorDeQuantidade(quantidade);
            quantidades[i] = quantidade;
        }

        double valorTotal = calcularValorCompra(quantidades);

        System.out.printf("Valor total: %.2f", valorTotal);
    }

    public static double calcularValorCompra(int[] quantidades) {
        double valorCompra = 0;

        for(int i = 0; i < quantidades.length; i++){
            valorCompra += calcularPreco(quantidades[i]);
        }

        return valorCompra;
    }

    public static double calcularPreco(int quantidade) {
        double valorPromocao = 1.25;
        double valorNormal = 1.45;

        if(quantidade > 10){
            return valorPromocao * quantidade;
        } else {
            return valorNormal * quantidade;
        }
    }

    public static void verificadorDeQuantidade(int quantidade) throws QuantidadeInvalidasException{
        if (quantidade==0){
            throw new QuantidadeInvalidasException("Quantidade insuficiente, no mínimo uma fruta");
        }else if (quantidade<0){
            throw new QuantidadeInvalidasException("Número de frutas inválidos!, valor menor do que 0.");
        }
    }

}
