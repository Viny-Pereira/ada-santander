package LogicaProgramacao.src.Aula8.LMS;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import static java.util.Locale.setDefault;

public class EX005 {
    public static void main(String[] args) {
        setDefault(Locale.US);
        double[] entrada = new double[]{3.0, 25.00, 2.0};
        double saida = valorEntrada(entrada);
        System.out.println(saida);
        entrada = new double[]{4, 50, 1};
        saida = valorEntrada(entrada);
        System.out.println(saida);

    }

    public static double valorEntrada(double[] input) {
        double descontoNaEntrada = descontoEntrada(input[0]);
        double acrescimoPelaMusica = acrescimoMusica(input[2]);
        double valorBaseEntrada = input[1];

        double valorPago = (1 - descontoNaEntrada) * (1 + acrescimoPelaMusica) * valorBaseEntrada;

        return arredondar(valorPago);
    }

    public static double descontoEntrada(double diaSemana) {
        double desconto = 0d;
        if (diaSemana == 1d || diaSemana == 2d || diaSemana == 4d) {
            desconto = 25 / 100d;
        }
        return desconto;
    }

    public static double acrescimoMusica(double temMusica) {
        double acrescimo = 0;
        if (temMusica == 1) {
            acrescimo = 15 / 100d;
        }

        return acrescimo;
    }

    public static double arredondar(double numeroArredondar) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.###", symbols);
        return Double.parseDouble(decimalFormat.format(numeroArredondar));
    }
}
