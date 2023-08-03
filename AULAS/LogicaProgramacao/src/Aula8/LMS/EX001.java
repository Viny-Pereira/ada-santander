package LogicaProgramacao.src.Aula8.LMS;


public class EX001 {
    public static void main(String[] args) {
        int soma = somaAlgarismos(123);
        System.out.println(soma);
    }
    public static int somaAlgarismos(int input) {
        int soma = 0;
        int adicionar;
        if(input<=0){
            return -1;
        }
        while (input!=0){
            adicionar=input%10;
            soma+=adicionar;
            input/=10;
        }return soma;
    }
}
