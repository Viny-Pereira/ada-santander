package TecnicasDeProgramacao.Aula6.methodreference;

public class ExempleConstructorMethodReference {
    public static void main(String[] args) {
        String login = "";
        String senha = "";
        Usuario usuario = new Usuario(login, senha);
        BaseDeDados baseDeDados = () -> new Usuario();
        Usuario usuario1 = baseDeDados.getUsuario();
        System.out.println(usuario1);

        BaseDeDados baseDeDadosPorMethodReference = Usuario::new;
        System.out.println(baseDeDadosPorMethodReference.getUsuario());

        BaseDeDadosSegundoContrutor bds = (lg, se) -> new Usuario(lg, se);
        System.out.println(bds.getUsuario("Test", "Test").getLogin());

        BaseDeDadosSegundoContrutor bdsMr = Usuario::new;
        System.out.println(bdsMr.getUsuario("Test", "Test").getLogin());

    }
}
