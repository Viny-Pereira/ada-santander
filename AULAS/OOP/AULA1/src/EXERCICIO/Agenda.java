package OOP.AULA1.src.EXERCICIO;

public class Agenda {
    Contato[] contatos;

    public Agenda() {

    }

    public Agenda(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void deletar(Contato contato) {
        Contato[] listaAjustada = new Contato[contatos.length - 1];
        int novaPosicaoContato = 0;

        for (int i = 0; i < contatos.length; i++) {

            String nomeContatoADeletar = contato.nome;
            String numeroADeletar = contato.numero;

            String nomeContatoAtualDoFor = contatos[i].nome;
            String numeroAtualDoFor = contatos[i].numero;

            if (!nomeContatoADeletar.equals(nomeContatoAtualDoFor)
                    && !numeroADeletar.equals(numeroAtualDoFor)) {

                listaAjustada[novaPosicaoContato] = contatos[i];
                novaPosicaoContato++;

            }
            contatos = listaAjustada;

        }
    }

    public Contato buscarPorNome(String nome) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i].nome.equals(nome)) {
                return contatos[i];
            }
        }
        return null;
    }

    public void addContato(Contato novoContato) {
        int tamanhoNovaLista = contatos.length + 1;
        Contato[] novaLista = new Contato[tamanhoNovaLista];

        for (int i = 0; i < contatos.length; i++) {
            novaLista[i] = contatos[i];
        }
        novaLista[tamanhoNovaLista - 1] = novoContato;
        contatos = novaLista;
    }

    public void imprimirAgenda() {
        System.out.println();
        for (Contato c : contatos) {
            System.out.println(c.nome);
        }
        System.out.println();
    }

}

