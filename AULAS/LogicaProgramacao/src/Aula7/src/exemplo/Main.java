package LogicaProgramacao.src.Aula7.src.exemplo;

public class Main {
    public static void main(String[] args) {
        int sum_1 = sum(10_000);
        int sum_2 = sumRecursive(10_000);
        int mult_1 = multiplicationRecursive(3);
        int mult_2 = multiplication(3);
        System.out.println(sum_1);
        System.out.println(sum_2);
        System.out.println(mult_1);
        System.out.println(mult_2);

    }
    public static int sum(int limit){
        int valueOfSum = 0;
        for (int i=0; i<=limit;i++){
            valueOfSum+=i;
        }
        return valueOfSum;
    }
    public static int sumRecursive(int limit){
        if(limit==0){
            return 0;
        }
        return limit + sumRecursive(limit-1);
    }

    public static int multiplication(int limit){
        int valueOfMultiplication = 1;
        for (int i=1; i<=limit;i++){
            valueOfMultiplication*=i;
        }
        return valueOfMultiplication;
    }
    public static int multiplicationRecursive(int limit){
        if(limit==0){
            return 1;
        }
        return limit * multiplicationRecursive(limit-1);
    }


}
