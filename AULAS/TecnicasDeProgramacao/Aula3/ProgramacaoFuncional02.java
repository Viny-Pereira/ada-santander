package TecnicasDeProgramacao.Aula3;

import java.util.function.Function;

public class ProgramacaoFuncional02 {
    public static void main(String[] args) {
//criar um programa que conte os caracteres de uma String
        String palavra = "Igor";
        ContarCaracteres<String, Integer> contarCaracteres = p -> p.length();
        ContarCaracteres<String, Integer> contarCaracteres1 = p -> p.length() -1;
        ContarCaracteres<String, Integer> contarLetraI = p ->{
            int contador = 0;
            for (int i = 0; i < p.length(); i++) {

                if (p.charAt(i)=='I') {
                    contador++;
                }
            }
            return contador;
        };

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vinicius");

        ContarCaracteres<StringBuilder, Integer> contarCaracteres3 = p -> p.length();
        System.out.println("Numero de caracters StringBuilder :"+ contarCaracteres3.contar(stringBuilder));

        System.out.println("Numero de letras i: "+ conta(palavra, contarLetraI));
        System.out.println("Numero de caracteres do nome: " + conta(palavra, contarCaracteres));
        System.out.println(contarCaracteres1.contar(palavra));


        Function<String, Integer> funcaoContarCaracteres = p -> p.length();
        System.out.println("Contagem de caracteres com Function: " + funcaoContarCaracteres.apply(palavra));


    }

    private static Integer conta(String palavra, ContarCaracteres<String, Integer> contarCaracteres) {

        return contarCaracteres.contar(palavra);
    }
}
