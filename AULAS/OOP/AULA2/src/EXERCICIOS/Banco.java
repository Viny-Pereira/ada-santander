package OOP.AULA2.src.EXERCICIOS;

public class Banco {
    Conta[] contasCadastradas = new Conta[0];

    public Banco() {

    }

    public void criarConta(Conta novaConta) {
        Conta[] novaContasCadastradas = new Conta[this.contasCadastradas.length + 1];
        for (int i = 0; i < this.contasCadastradas.length; i++) {
            novaContasCadastradas[i] = this.contasCadastradas[i];
        }
        novaContasCadastradas[novaContasCadastradas.length - 1] = novaConta;
        this.contasCadastradas = novaContasCadastradas;
    }

    public Conta buscarConta(String numeroConta) {
        for (Conta conta : contasCadastradas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        throw new RuntimeException("CONTA NÂO ENCONTRADA");
    }

    public void depositar(String numeroConta, double deposito) {
        Conta conta = buscarConta(numeroConta);
        conta.depositar(deposito);
    }

    public void sacar(String numeroConta, double saque) {
        Conta conta = buscarConta(numeroConta);
        conta.sacar(saque);
    }

}
