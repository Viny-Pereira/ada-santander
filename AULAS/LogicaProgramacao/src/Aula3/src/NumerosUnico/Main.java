package LogicaProgramacao.src.Aula3.src.NumerosUnico;

public class Main {
    public static void main(String[] args) {
        double [] entrada = {2,2,3.1,4,4.1,4.1};
        boolean saida = elementosRepetidos(entrada);
        System.out.println(saida);
    }
    public static boolean elementosRepetidos(double[] input) {
        boolean repeticoes = false;
        for (int i = 0; i<input.length;i++){
            int count = 0;
            for (int j = 0; j<input.length;j++){
                if(input[i]==input[j]){
                    count +=1;
                }
            }
            if(count==2){
                return repeticoes=true;
            }
        }
        return repeticoes;
    }
}
