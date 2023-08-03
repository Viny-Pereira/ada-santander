package LogicaProgramacao.src.Aula8.LMS;

import java.util.Arrays;

public class EX004 {
    public static void main(String[] args) {
        String entrada = "amor";
        String[] saida = soletrandoInvertidoStr(entrada);
        System.out.println(Arrays.toString(saida));
    }
    public static String[] soletrandoInvertidoStr(String input) {
        String[] inputLista = new String[input.length()];
        for(int i = 0; i<input.length();i++){
            inputLista[input.length()-i-1]=String.valueOf(input.charAt(i));
        }
        return inputLista;
    }
}
