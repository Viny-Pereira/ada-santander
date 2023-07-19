package AULA_2.OrdenarNumeros;

import java.util.Arrays;

public class A02EX002 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 6, 0};
        int[] ascending = sortAscendingOrder(numbers);
        int[] descending = sortDescendingOrder(numbers);

        System.out.println("NUMBERS");
        System.out.println(Arrays.toString(numbers));

        System.out.println("ASCENDING");
        System.out.println(Arrays.toString(ascending));

        System.out.println("DESCENDING");
        System.out.println(Arrays.toString(descending));

    }

    public static int[] sortAscendingOrder(int[] array) {

        int[] orderArray = new int[array.length];
        for (int i = 0; i < orderArray.length; i++) {
            int position = 0;
            for (int j = 0; j < orderArray.length; j++) {
                if (array[i] > array[j]) {
                    position += 1;
                }
            }
            orderArray[position] = array[i];
        }
        return orderArray;
    }

    public static int[] sortDescendingOrder(int[] array) {

        int[] orderArray = new int[array.length];
        for (int i = 0; i < orderArray.length; i++) {
            int position = 0;
            for (int j = 0; j < orderArray.length; j++) {
                if (array[i] > array[j]) {
                    position += 1;
                }
            }
            orderArray[array.length - position - 1] = array[i];
        }
        return orderArray;
    }
}
