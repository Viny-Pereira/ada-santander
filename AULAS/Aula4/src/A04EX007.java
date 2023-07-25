package Aula4.src;


public class A04EX007 {
    public static void main(String[] args) {
        int[][] entradas = {
                {2, 2, 5},
                {3, 3, 5},
                {2, 2, 2},
                {2, 5, 2},
                {2, 4, 3},
                {150, 120, 220},
                {122, 252, 130},
                {152, 200, 351},
                {1232, 2200, 120},
                {1, 2, 1},
                {2, 1, 2}
        };

        String[] saidas = {
                "LadosInvalidosException",
                "true",
                "true",
                "LadosInvalidosException",
                "true",
                "true",
                "LadosInvalidosException",
                "true",
                "LadosInvalidosException",
                "LadosInvalidosException",
                "true"
        };

        for (int i = 0; i < entradas.length; i++) {
            String resultado = "true";

            try {
                eUmTriangulo(entradas[i]);
            } catch (LadosInvalidosException e) {
                resultado = "LadosInvalidosException";
            }
            String esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado == esperado);
            System.out.println();
        }
    }

    public static void eUmTriangulo(int[] input) throws LadosInvalidosException {
        boolean eTriangulo;
        int lado1 = input[0];
        int lado2 = input[1];
        int lado3 = input[2];

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado1) {
            if (Math.abs(lado1 - lado2) < lado3 && Math.abs(lado1 - lado3) < lado2 && Math.abs(lado3 - lado2) < lado1) {
                eTriangulo = true;
            }
        } else {
            throw new LadosInvalidosException("LadosInvalidosException");
        }
    }
}