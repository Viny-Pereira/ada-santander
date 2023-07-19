package AULA_2.ParesEImpares;

import java.util.Arrays;

public class A03EX003 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 6, 0};
        int[] ascending = sortAscendingOrder(numbers);
        int[] descending = sortDescendingOrder(numbers);
        int[] numerosParesAscending = pares(ascending);
        int[] numerosImparesAscending = impares(ascending);
        int[] numerosParesDescending = pares(descending);
        int[] numerosImparesDescending = impares(descending);

        System.out.println("NUMBERS");
        System.out.println(Arrays.toString(numbers));

        System.out.println("ASCENDING");
        System.out.println(Arrays.toString(ascending));

        System.out.println("PARES");
        System.out.println(Arrays.toString(numerosParesAscending));
        System.out.println("IMPARES");
        System.out.println(Arrays.toString(numerosImparesAscending));

        System.out.println("DESCENDING");
        System.out.println(Arrays.toString(descending));

        System.out.println("PARES");
        System.out.println(Arrays.toString(numerosParesDescending));
        System.out.println("IMPARES");
        System.out.println(Arrays.toString(numerosImparesDescending));

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

    public static int numeroPares(int[] numeros) {
        int nPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                nPares += 1;
            }
        }
        return nPares;
    }

    public static int[] pares(int[] numeros) {
        int nPares = numeroPares(numeros);
        int[] pares = new int[nPares];
        int count = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[count] = numero;
                count += 1;
            }
        }
        return pares;
    }

    public static int[] impares(int[] numeros) {
        int nPares = numeroPares(numeros);
        int[] impares = new int[numeros.length - nPares];
        int count = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares[count] = numero;
                count += 1;
            }
        }
        return impares;
    }

}
