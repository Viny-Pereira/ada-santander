package OOP.AULA2.src.EXERCICIOS;

public class Cliente {

    public final String nome;

    public final String CPF;

    public final String email;

    public Cliente(String nome, String CPF, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object c) {
        if (c instanceof Cliente outroCliente) {
            if (outroCliente.getCPF().equals(this.getCPF())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCPF='" + CPF +
                "\nEmail='" + email;
    }
}
