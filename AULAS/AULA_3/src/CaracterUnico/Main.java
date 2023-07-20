package AULA_3.src.CaracterUnico;

public class Main {
    public static void main(String[] args) {
        String entrada = "ccada";
        int saida = primeiroCaractereUnico(entrada);
        System.out.println(saida);
    }
    public static int primeiroCaractereUnico(String input) {
        int posicao = -1;
        String[] palavra = input.split("");
        for (int i = 0; i<input.length();i++){
            int count = 0;
            for (int j = 0; j<input.length();j++){

                if(palavra[i].equals(palavra[j])){
                    count +=1;
                }
            }
            if(count==1){
                posicao=i;
                return posicao;
            }
        }
        return posicao;
    }
}
