package TecnicasDeProgramacao.Aula6.methodreference;

public class ExempleInstanceMethodReference {
    public static void main(String[] args) {
        Verificador verificadorPorLambda = n -> 2 == 0;
        System.out.println(verificadorPorLambda.isPar(2));

        var instanceMethodReference = new ExempleInstanceMethodReference();
        Verificador verificadorPorMethodReference = instanceMethodReference::verifica;
        verificadorPorMethodReference.isPar(2);
    }

    public boolean verifica(Integer numero) {
        return numero % 2 == 0;
    }
}
