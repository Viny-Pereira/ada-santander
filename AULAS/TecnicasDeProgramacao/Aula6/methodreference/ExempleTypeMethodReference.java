package TecnicasDeProgramacao.Aula6.methodreference;

import TecnicasDeProgramacao.Aula5.Funcionario;

import java.util.function.Function;

public class ExempleTypeMethodReference {
    public static void main(String[] args) {
        Function<String, Integer> contarCaracteres = s -> s.length();
//        Function<String, Integer> contarCaracteres = String::length;
        System.out.println(contarCaracteres.apply("Viny"));

        Function<String, Integer> contarCaracteresPorMethodReference = String::length;
        System.out.println(contarCaracteresPorMethodReference.apply("Viny"));

        Function<Usuario, String> getLoginUsuario = usuario -> usuario.getLogin();
        Usuario usuario = new Usuario("Login", "Senha");
        System.out.println(getLoginUsuario.apply(usuario));

        Function<Usuario, String> getLoginUsuarioMethodReference = Usuario::getLogin;
        System.out.println(getLoginUsuarioMethodReference.apply(usuario));
    }
}
