package AULA_3.CalculoArea;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) throws LadosInvalidosException {
        try {
            double area = calcularArea(9, 1, 14);
            System.out.println(area);
        } catch (LadosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calcularArea(int lado1, int lado2, int lado3) throws LadosInvalidosException {
        double area = 0;
        if (triangulo(lado1, lado2, lado3)) {
            double p = (lado1 + lado2 + lado3) / 2;
            area = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
        }

        return arredondar(area);
    }

    public static double arredondar(double numeroDecimal) {
        double arredondado = new BigDecimal(numeroDecimal * 100.0 / 100.0).setScale(3, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
        return arredondado;
    }

    public static boolean triangulo(int lado1, int lado2, int lado3) throws LadosInvalidosException {
        boolean eTriangulo = false;
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado1) {
            if (Math.abs(lado1 - lado2) < lado3 && Math.abs(lado1 - lado3) < lado2 && Math.abs(lado3 - lado2) < lado1) {
                eTriangulo = true;
            }
        } else {
            throw new LadosInvalidosException("TEST");
        }
        return eTriangulo;
    }
}
