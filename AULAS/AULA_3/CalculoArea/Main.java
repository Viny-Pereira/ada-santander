package AULA_3.CalculoArea;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        double area = calcularArea(9, 7, 14);
        System.out.println(area);
    }

    public static double calcularArea(int lado1, int lado2, int lado3) {
        double p = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));

        return arredondar(area);
    }

    public static double arredondar(double numeroDecimal) {

        double arredondado = new BigDecimal(numeroDecimal * 100.0 / 100.0).setScale(3, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
        return arredondado;
    }
}
