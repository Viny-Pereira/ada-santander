package Aula2.src.PrecoFrutas;

import java.util.Scanner;

public class A02EX001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeTotalFrutas = 0;
        int quantidadeFrutas;
        double precoFinal = 0;
        String[] Frutas = {"Pera", "Laranja", "Maça", "Tomate", "Caqui"};
        for (int i = 0; i < Frutas.length; i++) {
            System.out.printf("Quantas %s você comprou?%n", Frutas[i]);
            quantidadeFrutas = scanner.nextInt();
            quantidadeTotalFrutas +=quantidadeFrutas;
            precoFinal += valorFruta(quantidadeFrutas);

        }
        System.out.printf("Você comprou um total de %d frutas e isso custou R$%.2f", quantidadeTotalFrutas, precoFinal);
    }

    public static double valorFruta(int quantidadeFrutas) {
        double valorAPagar = 1.45 * quantidadeFrutas;
        if (quantidadeFrutas > 10) {
            valorAPagar = 1.25 * quantidadeFrutas;
        }
        return valorAPagar;
    }
}
