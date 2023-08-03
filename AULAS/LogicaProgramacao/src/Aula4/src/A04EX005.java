package LogicaProgramacao.src.Aula4.src;

public class A04EX005 {
    public static void main(String[] args) {
        String[] entradas = {
                "amor",
                "cocada",
                "mora",
                "ovo",
                "cachorro",
                "kaka",
                "saudades",
                "palalelepipedo",
                "fofocalizando",
                "papagaio",
                "ateiaateiab"
        };

        int[] saidas = {
                0,
                1,
                0,
                1,
                1,
                -1,
                2,
                9,
                4,
                4,
                10
        };

        for (int i = 0; i < entradas.length; i++) {
            double resultado = primeiroCaractereUnico(entradas[i]);
            double esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
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
