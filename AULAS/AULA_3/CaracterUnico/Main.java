package AULA_3.CaracterUnico;

public class Main {
    public static void main(String[] args) {
        String entrada = "cocada";
        int saida = primeiroCaractereUnico(entrada);
        System.out.println(saida);
    }
    public static int primeiroCaractereUnico(String input) {
        int posicao = -1;
        String[] palavra = input.split("");
        for (int i = 0; i<input.length();i++){
            int count = 0;
            for (int j = 0; j<input.length();j++){
                System.out.println(palavra[i]==palavra[j]);
                System.out.println(palavra[i]);
                System.out.println(palavra[j]);

                if(palavra[i]==palavra[j]){
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
