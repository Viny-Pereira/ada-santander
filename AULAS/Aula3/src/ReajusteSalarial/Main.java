package Aula3.src.ReajusteSalarial;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        double [] entrada = {1, 5.0, 2000.00};
        double saida = (calculoSalario(entrada));
        System.out.println(saida);
    }
    public static double calculoSalario( double[] input) {
        double salario;
        double percentualAumento=1.5/100d;
        if(input[0]<5) {
            percentualAumento = 1/100d;
        }else if (input[0]>10){
            percentualAumento = 2/100d;
        }
        System.out.println(percentualAumento);
        salario = (1+percentualAumento+input[1]/100)*input[2];
        salario = arredondar(salario);
        return salario;
    }

    public static double arredondar(double numeroDecimal){

        double arredondado = new BigDecimal(numeroDecimal * 100.0 / 100.0).setScale(3, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
        return arredondado;
    }
}
