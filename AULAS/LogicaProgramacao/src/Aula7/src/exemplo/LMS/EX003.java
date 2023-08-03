package LogicaProgramacao.src.Aula7.src.exemplo.LMS;

import java.util.Arrays;

public class EX003 {
    public static void main(String[] args) {
        int[] entrada = new int[]{16, 26, 114, 16, 135, 6, 100, 2};
        int[] saida = ordenar(entrada);
        System.out.println(Arrays.toString(saida));
    }

    public static int[] ordenar(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[i]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }
}
