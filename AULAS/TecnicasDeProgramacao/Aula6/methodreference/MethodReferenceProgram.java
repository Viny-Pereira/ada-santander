package TecnicasDeProgramacao.Aula6.methodreference;

public class MethodReferenceProgram {
    public static void getString(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        Impressao impressaoPorLambda = s -> System.out.println(s);
        impressaoPorLambda.getNome("Teste impressao por lambda");

        //Impressao impressaoPorMethodReference = string -> getString(string);
        Impressao impressaoPorMethodReference = MethodReferenceProgram::getString;
        impressaoPorMethodReference.getNome("Teste impressao por method referenceTeste impressao por method reference");
    }
}
