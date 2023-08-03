package LogicaProgramacao.src.Aula5.src;

public class Triangulo {
    public static void main(String[] args) {
        try {
        validarTriangulo(3, 5, 9);
        }catch (Exception e){
            System.out.println("Não forma um triangulo!");
        }
    }

/*    public static void validarTriangulo(int a, int b, int c) throws Exception {
        if (!(a + b > c && b + c > a && c + a > b)) {
            throw new Exception();
        }
    }*/

    public static void validarTriangulo(int a, int b, int c) throws LadosInvalidosException {
        if (!(a + b > c && b + c > a && c + a > b)) {
            throw new LadosInvalidosException("Lados inválidos");
        }
    }
}
