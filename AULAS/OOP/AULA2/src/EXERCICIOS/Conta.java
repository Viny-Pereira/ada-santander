package OOP.AULA2.src.EXERCICIOS;

public class Conta {
    public final Cliente cliente;
    public final String numeroConta;
    public double saldoConta = 0;

    public Conta(Cliente cliente, String numeroConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void depositar(double deposito) {
        this.saldoConta += deposito;
    }

    public void sacar(double saque) {
        if(possivelSacar(saque)){
            this.saldoConta -= saque;
        }else {
            throw new RuntimeException("SALDO INSUFICIENTE !!");
        }
    }

    public boolean possivelSacar(double saque) {
        if (this.saldoConta < saque) return false;
        return true;
    }

    @Override
    public boolean equals(Object c){
        if (c instanceof Conta outraConta){
            if(outraConta.getNumeroConta().equals(this.getNumeroConta())){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return cliente +
                "\nNumeroConta='" + numeroConta +
                "\nSaldoConta=" + saldoConta;
    }
}
