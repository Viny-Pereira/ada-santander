package AULA_3.CustosAutomoveis;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] entradas = {115500.00,25000.00, 32500.00};
        double [] saida = custosCarro(entradas);
        System.out.println(Arrays.toString(saida));
    }
    public static double[] custosCarro( double[] input) {
        double [] distribuidorEImpostos = new double[2];
        distribuidorEImpostos[0]=arredondar(input[1]/input[0]*100);
        distribuidorEImpostos[1]=arredondar(input[2]/input[0]*100);
        return distribuidorEImpostos;
    }



    public static double arredondar(double numeroDecimal){

        double arredondado = new BigDecimal(numeroDecimal * 100.0 / 100.0).setScale(3, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
        return arredondado;
    }

}
