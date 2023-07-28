package Aula7.src.exemplo.LMS;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class EX004 {
    public static void main(String[] args) {
        double[] entrada = new double[]{3, 20000.00, 2000.00, 250.00};
        double saida = salarioComComissao(entrada);
        System.out.println((saida));
    }

    public static double salarioComComissao(double[] input) {
        double numeroCarros = input[0];
        double totalVendas = input[1];
        double salarioFixo = input[2];
        double valorPorCarro = input[3];
        double porcentagemTotalVendido = 5 / 100d;
        double valorVariavelTotalVendido = porcentagemTotalVendido * totalVendas;
        double valorVariavelCarrosVendidos = numeroCarros * valorPorCarro;
        double salarioFinal = salarioFixo + valorVariavelCarrosVendidos + valorVariavelTotalVendido;
        return arredondar(salarioFinal);
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}

