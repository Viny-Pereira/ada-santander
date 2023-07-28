package Aula7.src.exemplo.LMS;

public class EX005 {
    public static void main(String[] args) {
        int[] entrada = new int[]{1,2,3,6,9};
        String saida = parImpar(entrada);
        System.out.println((saida));
    }

    public static String parImpar(int[] input) {
        int numeroPares=0;
        int numeroImpares;
        int tamanhoArray=input.length;

        for (int numero: input) {
            if(numero%2==0) {
                numeroPares += 1;
            }
        }
        numeroImpares = tamanhoArray-numeroPares;

        String indicacaoPar;
        String indicacaoImpar;

        if (numeroPares>1){
            indicacaoPar = "pares";
        }else {
            indicacaoPar = "par";
        }

        if (numeroImpares>1){
            indicacaoImpar = "ímpares";
        }else {
            indicacaoImpar = "ímpar";
        }



        String reposta = numeroPares +" "+indicacaoPar+", "+numeroImpares+ " " +indicacaoImpar;
        return reposta;
    }
}
