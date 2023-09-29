package TecnicasDeProgramacao.Aula6.exercicios;

import java.util.List;
import java.util.Optional;

public class BancoUsuarios {
    private List<Usuario> usuarios;

    public BancoUsuarios() {
        this.usuarios = List.of(
                new Usuario("Apenas Nome"),
                new Usuario("Informacoes Completo",
                        Optional.of("Email.com"),
                        Optional.of(20)),
                new Usuario("Nome e Email",
                        Optional.of("Email.com"),
                        Optional.empty()),
                new Usuario("Nome e idade",
                        Optional.empty(),
                        Optional.of(22))
        );
    }
    public List<Usuario> getUsuarios(){
        return this.usuarios;
    }
}
