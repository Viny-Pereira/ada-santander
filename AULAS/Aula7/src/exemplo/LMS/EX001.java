package Aula7.src.exemplo.LMS;

public class EX001 {
    public static void main(String[] args) {
        String entrada = "amor";
        String[] saida = soletrandoStr(entrada);
        System.out.println(saida);
    }
        public static String[] soletrandoStr(String input) {
            String[] inputLista = new String[input.length()];
            for(int i = 0; i<input.length();i++){
                inputLista[i]=String.valueOf(input.charAt(i));
            }
            return inputLista;
    }
}
