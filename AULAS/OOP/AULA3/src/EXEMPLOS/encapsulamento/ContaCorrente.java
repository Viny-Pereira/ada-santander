package OOP.AULA3.src.EXEMPLOS.encapsulamento;

public class ContaCorrente {
    private String nome;
    private double saldo;

    public void depositar(double deposito){
        this.saldo+=deposito;
    }

    public void sacar(double saque){
        this.saldo-=saque;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
}
