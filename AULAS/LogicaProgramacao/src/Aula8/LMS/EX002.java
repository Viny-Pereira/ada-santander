package LogicaProgramacao.src.Aula8.LMS;

import java.util.Arrays;

public class EX002 {
    public static void main(String[] args) {
        String[] entrada = new String[]{};
        String[] saida = substringStr(entrada);
        System.out.println(Arrays.toString(saida));

    }

    public static String[] substringStr(String[] input) {
        String[] palavrasContidasIntermediaria = new String[input.length];

        int tamanhoArray = input.length;
        int count = 0;
        for (int i = 0; i < tamanhoArray; i++) {
            for (int j = 0; j < tamanhoArray; j++) {
                if (i != j && input[j].contains(input[i])) {
                    palavrasContidasIntermediaria[count] = input[i];
                    count += 1;
                }
            }
        }
        String[] semRepeticoes = new String[count];
        int countSemRepeticao = 0;
        for (int i = 0; i < count; i++) {
            boolean reptida = false;
            for (int j = 0; j < count; j++) {
                if (palavrasContidasIntermediaria[i].equals(semRepeticoes[j])) {
                    reptida = true;
                    break;
                }

            }
            if (!reptida) {
                semRepeticoes[countSemRepeticao] = palavrasContidasIntermediaria[i];
                countSemRepeticao++;
            }
        }

        String[] palavrasContidas = new String[countSemRepeticao];
        for (int k = 0; k < countSemRepeticao; k++) {
            palavrasContidas[k] = semRepeticoes[k];
        }

        return palavrasContidas;
    }
}

