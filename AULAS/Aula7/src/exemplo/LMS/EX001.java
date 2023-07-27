package Aula7.src.exemplo.LMS;

public class EX001 {
    public static void main(String[] args) {
        String entrada = "amor";
        char[] saida = soletrandoStr(entrada);
        System.out.println(saida);
    }
        public static char[] soletrandoStr(String input) {
            char[] inputLista = new char[input.length()];
            for(int i = 0; i<input.length();i++){
                inputLista[i]=input.charAt(i);
            }
            return inputLista;
    }
}
