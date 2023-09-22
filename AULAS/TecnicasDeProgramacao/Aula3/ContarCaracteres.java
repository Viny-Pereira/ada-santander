package TecnicasDeProgramacao.Aula3;

@FunctionalInterface
public interface ContarCaracteres<T, U> {
    U contar(T palavra);
}
