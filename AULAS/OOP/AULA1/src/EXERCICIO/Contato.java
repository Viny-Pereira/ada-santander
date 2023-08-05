package OOP.AULA1.src.EXERCICIO;

public class Contato {

    String nome;
    String numero;
    String descricao;

    public void ligar() {
        System.out.println("Ligando para: " + nome);
    }

    public void detalhar() {
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Descricao: " + descricao);
    }

    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object c) {
        if (c instanceof Contato contatoAComparar) {
            if (contatoAComparar.nome.equals(nome) && contatoAComparar.numero.equals(numero)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
