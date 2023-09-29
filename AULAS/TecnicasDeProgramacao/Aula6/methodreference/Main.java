package TecnicasDeProgramacao.Aula6.methodreference;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        BaseDeDados baseDeDados = new BaseDeDados();
        Optional<Usuario> usuarioBuscado = baseDeDados.getByName("login3");
        imprimirLoginUsuario(usuarioBuscado);
    }

    private static void imprimirLoginUsuario(Optional<Usuario> usuarioBuscado) {
        System.out.println(usuarioBuscado.get().getLogin());
    }
}
