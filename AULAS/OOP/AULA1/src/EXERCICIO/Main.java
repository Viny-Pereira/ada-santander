package OOP.AULA1.src.EXERCICIO;


/*- Modele a classe AGENDA que contém um array de contatos como atributo e os seguintes métodos:
        - deletar(Contato);
        - buscar(String);

        - Modele uma classe CONTATO com os devidos atributos e os seguintes métodos:
        - ligar()
        - detalhar()
        - verNumero()

        - crie vários contatos e coloque-os em uma classe Agenda;

        - no método main, faça a impressão usando cada método*/
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato primeiroContato = new Contato();
        primeiroContato.nome = "Joao";
        primeiroContato.numero = "123";
        primeiroContato.descricao = "Amigo";

        Contato segundoContato = new Contato();
        segundoContato.nome = "maria";
        segundoContato.numero = "456";
        segundoContato.descricao = "tia";

        Contato terceiroContato = new Contato();
        terceiroContato.nome = "ronaldo";
        terceiroContato.numero = "789";
        terceiroContato.descricao = "pai";

        Contato contato4 = new Contato();
        contato4.nome = "ugo";
        contato4.numero = "321";
        contato4.descricao = "irmao";

        agenda.contatos = new Contato[] {primeiroContato, segundoContato, terceiroContato, contato4};

        System.out.println("Imprimindo agenda");
        agenda.imprimirAgenda();

        System.out.println("Buscando ugo");
        Contato ugo = agenda.buscarPorNome("ugo");

        System.out.println("Detalhar");
        ugo.detalhar();

        System.out.println("ligar");
        ugo.ligar();

        System.out.println("Apagando contato");
        agenda.deletar(segundoContato);


        System.out.println("Imprimindo agenda");
        agenda.imprimirAgenda();

    }
}
